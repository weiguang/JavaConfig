package com.okayjam.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author: Chen weiguang <chen2621978@gmail.com>
 * @create: 2019/08/19 19:44
 **/
@Configuration
@ComponentScan(basePackages={"com.okayjam.spring"},
        excludeFilters={
                @ComponentScan.Filter(type= FilterType.ANNOTATION, value= Controller.class)
        })
public class RootConfig {
}
