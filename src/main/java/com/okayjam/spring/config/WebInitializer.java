package com.okayjam.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * @author: Chen weiguang <chen2621978@gmail.com>
 * @create: 2019/08/19 19:44
 **/
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    /**
     *  开启文件上传功能
     * @param registration
     */
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        super.customizeRegistration(registration);
        registration.setMultipartConfig(
                // 设置默认位置，最大文件大小，最大请求大小，和缓存大小
                new MultipartConfigElement("/", 10240000, 102400000, 1024));
    }
}
