package org.lotus.loach.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用响应封装
 *
 * @author: Foy Lian
 * Date: 6/4/2019
 * Time: 4:39 PM
 */
@Data
public class Response<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 响应代码，需要定义到码表中。
     * 0 - 成功
     * 9999 - 失败
     */
    private Integer code;
    /**
     * 响应的提示消息，或者错误消息
     */
    private String message;

    /**
     * 响应的数据
     */
    private T payload;

    public static Response create() {
        return new Response();
    }

    public Response<T> ok(T data) {
        //成功
        this.code = 0;
        this.payload = data;
        return this;
    }

    public Response<T> error(String errorMessage) {
        //默认错误
        this.code = 9999;
        this.message = errorMessage;
        return this;
    }
}
