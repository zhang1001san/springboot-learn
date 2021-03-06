package com.zhang.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 * @author:zhang
 * @since:2021/4/7
 */
@Configuration
public class WebConfig {

    @Bean
    public LocaleResolver localeResolver(){
        return new SessionLocaleResolver();
    }
}
