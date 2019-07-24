package com.hope.annotation.test;

import com.hope.annotation.bean.PropertyTest;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;


/**
 * ReflectTest
 *
 * @author zhougf
 * @date 2019/7/23
 */
public class ReflectTest {
    @Test
    public void propertyTest() throws Exception{
        PropertyTest test = new PropertyTest();
        Class aClass = test.getClass();
        //获取所有的属性
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            //设置属性可以访问
            field.setAccessible(true);
            //属性类型
            Type type = field.getGenericType();
            System.out.println(type);
            //类型名称
            String typeName = type.getTypeName();
            System.out.println(typeName);
            //get属性值
            Object o = field.get(test);
            String string = o.toString();
            System.out.println(string);
            //同理也有set方法
            field.set(test,"true");
        }
    }

    @Test
    public void methodTest() throws Exception{
        PropertyTest test = new PropertyTest();
        Class aClass = test.getClass();
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            System.out.println(method.getName());
        }
        //获取不到私有方法
        Method method = aClass.getMethod("publicMethod");
        //获取某个方法可以获取私有方法，
        Method declaredMethod = aClass.getDeclaredMethod("privateMethod");
        //设置方法可以访问
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(test,null);

    }
        private static String getMethodName(String fieldName){
            byte[] items = fieldName.getBytes();
            items[0] = (byte) ((char) items[0] - 'a' + 'A');
            return new String(items);
        }

}
