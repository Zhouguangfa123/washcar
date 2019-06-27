package com.hope.washcar.test;
import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;

/**
 * Locale �Ĳ��Գ���
 * @author zhougf
 * @date 2018/09/07
 */
public class LocaleTest {

    public static void main(String[] args) {
        // 2�ֲ�ͬ��Locale�Ĵ�������
        testDiffDateLocales();

        // ��ʾ���е�Locales
        testAllLocales();
    }


    /**
     * 2�ֲ�ͬ��Locale�Ĵ�������
     */
    private static void testDiffDateLocales() {
        // dateΪ2013-09-19 14:22:30
        Date date = new Date();

        // �������������ġ���Locale
        Locale localeCN = Locale.SIMPLIFIED_CHINESE;
        // ������Ӣ��/��������Locale
        Locale localeUS = new Locale("en", "US");

        // ��ȡ���������ġ���Ӧ��date�ַ���
        String cn = DateFormat.getDateInstance(DateFormat.MEDIUM, localeCN).format(date);
        // ��ȡ��Ӣ��/��������Ӧ��date�ַ���
        String us = DateFormat.getDateInstance(DateFormat.MEDIUM, localeUS).format(date);

        System.out.printf("cn=%s\nus=%s\n", cn, us);
    }

    /**
     * ��ʾ���е�Locales
     */
    private static void testAllLocales() {
        Locale[] ls = Locale.getAvailableLocales();

        System.out.print("All Locales: ");
        for (Locale locale:ls) {
            System.out.printf(locale+", ");
        }
        System.out.println();
    }
}