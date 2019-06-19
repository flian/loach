package org.lotus.loach.global;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * 设置springMVC分页参数
 *
 * @author: Foy Lian
 * Date: 6/19/2019
 * Time: 4:19 PM
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        PageArgumentResolver pageArgumentResolver = new PageArgumentResolver();
        resolvers.add(pageArgumentResolver);
    }
}
