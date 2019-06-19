package org.lotus.loach.global;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * mybatis plugin pagination
 *  project : (https://mp.baomidou.com/guide/page.html)
 *
 * @author: Foy Lian
 * Date: 6/19/2019
 * Time: 4:04 PM
 */
@EnableTransactionManagement
@Configuration
@MapperScan("org.lotus.*.mapper*")
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}