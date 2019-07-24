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
        //��ȡ���е�����
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            //�������Կ��Է���
            field.setAccessible(true);
            //��������
            Type type = field.getGenericType();
            System.out.println(type);
            //��������
            String typeName = type.getTypeName();
            System.out.println(typeName);
            //get����ֵ
            Object o = field.get(test);
            String string = o.toString();
            System.out.println(string);
            //ͬ��Ҳ��set����
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
        //��ȡ����˽�з���
        Method method = aClass.getMethod("publicMethod");
        //��ȡĳ���������Ի�ȡ˽�з�����
        Method declaredMethod = aClass.getDeclaredMethod("privateMethod");
        //���÷������Է���
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(test,null);

    }
        private static String getMethodName(String fieldName){
            byte[] items = fieldName.getBytes();
            items[0] = (byte) ((char) items[0] - 'a' + 'A');
            return new String(items);
        }

}
