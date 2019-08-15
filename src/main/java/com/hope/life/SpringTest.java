package com.hope.life;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * SpringTest
 *
 * @author zhougf
 * @date 2019/8/15
 */
public class SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(LifeTestConfig.class);
        System.out.println(context.getBean("createLifeTestBean").toString());
        System.out.println(context.getBean("createLifeTestBean").toString());
        context.close();

    }
}
