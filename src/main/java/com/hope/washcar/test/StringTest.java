package com.hope.washcar.test;

import java.util.Locale;

/**
 * StringTest
 *
 * @author zhougf
 * @date 2019/6/24
 */
public class StringTest {
    public static void main(String[] args) {
        String str = String.format("hi %s","���");
        String str1 = String.format("hi %s %s","���","���");
        Locale locale = new Locale("ja", "JP");
        String str2 = String.format(locale,"hi %s","���");
        System.out.println(str2);
    }
}
