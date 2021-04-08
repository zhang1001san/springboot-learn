package com.zhang.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
 * @author:zhang
 * @since:2021/4/8
 */
@RestController
public class LanguageController {


    @GetMapping("/language/{language}")
    public String switchLanguage(HttpServletRequest request, @PathVariable("language") String language) {
        Locale locale;
        if ("zh".equals(language) || "zh_CN".equals(language)) {
            locale = Locale.CHINA;
        } else {
            locale = Locale.US;
        }
        request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
        return "success";
    }
}
