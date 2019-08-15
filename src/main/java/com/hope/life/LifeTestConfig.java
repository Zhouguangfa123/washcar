package com.hope.life;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * LifeTestConfig
 *
 * @author zhougf
 * @date 2019/8/15
 */
@Configuration
@ComponentScan
public class LifeTestConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")
    public LifeTestBean createLifeTestBean() {
        return new LifeTestBean();
    }
}
