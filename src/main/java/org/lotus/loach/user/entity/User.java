package org.lotus.loach.user.entity;

import lombok.Data;

/**
 * 用户实体类
 *
 * @author: Foy Lian
 * Date: 6/4/2019
 * Time: 5:55 PM
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
