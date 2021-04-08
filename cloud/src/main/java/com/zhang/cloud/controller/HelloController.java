package com.zhang.cloud.controller;

import com.zhang.cloud.bean.Department;
import com.zhang.cloud.mapper.DepartmentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * @author:zhang
 * @since:2021/4/7
 */
@RestController
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private MessageSource messageSource;

    private DepartmentMapper departmentMapper;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/log/{num}")
    public String log(@PathVariable("num") int num) {
        for (int i = 0; i < num; i++) {
            LOGGER.trace("logger trace 级别" + i);
            LOGGER.debug("logger debug 级别" + i);
            LOGGER.info("logger info 级别" + i);
            LOGGER.warn("logger warn 级别" + i);
            LOGGER.error("logger error 级别" + i);
        }
        return "hello";
    }

    @GetMapping("/i18n")
    public String i18n(Locale locale) {
        return messageSource.getMessage("hello", null, locale);
    }

    @GetMapping("/department/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.queryDepartment(id);
    }
}
