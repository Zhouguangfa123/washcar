package com.hope.springmvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * SpittrWebAppInitializer
 *
 * @author zhougf
 * @date 2019/08/14
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }

    //½«DispatcherServlet Ó³Éäµ½"/"
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
