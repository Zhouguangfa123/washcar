/*
package com.hope.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

*/
/**
 * WebConfig
 *
 * @author zhougf
 * @date 2019/08/14
 *//*


@Configuration
@EnableWebMvc
//启用扫描组件
@ComponentScan("com.hope.springmvc")
public class WebConfig extends WebMvcConfigurerAdapter {

    //配置jsp视图解析器
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resourceViewResolver =
                new InternalResourceViewResolver();
        resourceViewResolver.setPrefix("/WEB-INF/views/");
        resourceViewResolver.setSuffix(".jsp");
        resourceViewResolver.setExposeContextBeansAsAttributes(true);
        return resourceViewResolver;
    }

    public void configureDefaultServletHanding(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }


}
*/
