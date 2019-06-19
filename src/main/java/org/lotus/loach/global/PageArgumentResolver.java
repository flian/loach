package org.lotus.loach.global;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * springMVC自定义pageBounds参数解析器
 *
 * @author: Foy Lian
 * Date: 2/8/2018
 * Time: 4:13 PM
 */
@Slf4j
public class PageArgumentResolver implements HandlerMethodArgumentResolver {
    /**
     * 只处理Page类型
     *
     * @param parameter
     * @return
     */
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return Page.class.equals(parameter.getParameterType());
    }

    /**
     * 简单创建需要pageBounds的对象
     *
     * @param parameter
     * @param mavContainer
     * @param webRequest
     * @param binderFactory
     * @return
     * @throws Exception
     */
    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        //默认显示第一页
        int page = 1;
        //默认每页10条数据
        int limit = 10;
        String pageString = webRequest.getParameter("page");
        String pageSizeString = webRequest.getParameter("limit");
        if (null != pageString && !pageString.isEmpty()) {
            try {
                page = Integer.parseInt(pageString);
            } catch (Exception e) {
                log.info("parse page to integer failue: page=" + pageString);
            }
        }
        if (null != pageSizeString && !pageSizeString.isEmpty()) {
            try {
                limit = Integer.parseInt(pageSizeString);
            } catch (Exception e) {
                log.info("parse limit to integer failue: limit=" + pageSizeString);
            }
        }
        return new Page<>(page, limit);
    }
}
