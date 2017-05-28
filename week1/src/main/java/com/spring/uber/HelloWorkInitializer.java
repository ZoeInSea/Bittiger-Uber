package com.spring.uber;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by zoe on 5/26/17.
 */
public class HelloWorkInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{HelloWorldConfiguration.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
