package com.hope.annotation.test;

import com.hope.annotation.bean.MyTarget;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * AnnotationTest
 *
 * @author zhougf
 * @date 2019/7/24
 */
public class AnnotationTest {
    @MyTarget(name = "string")
    private String name;

    @MyTarget(name = "zhangSan")
    private void sayName(String name, int age) {
        System.out.println(this.name);
        System.out.println(name + ":" + age);
    }

    @Test
    public void fieldTest() throws Exception{
        AnnotationTest test = new AnnotationTest();
        Class annotation = AnnotationTest.class;
        //字段测试
        Field field = annotation.getDeclaredField("name");
        if (field.isAnnotationPresent(MyTarget.class)) {
            String name = field.getAnnotation(MyTarget.class).name();
            //set值
            field.set(test,name);
        }

        //方法测试

        Method method = annotation.getDeclaredMethod("sayName", String.class, int.class);
        if (method.isAnnotationPresent(MyTarget.class)) {
            //对象上面的test已经给字段set值
            String name = method.getAnnotation(MyTarget.class).name();
            method.invoke(test,name,5);
            method.setAccessible(true);
            method.invoke(new AnnotationTest(),"liSi",8);
        }
    }
}
