package com.hope.washcar.test;

import java.util.HashSet;
import java.util.Set;

/**
 * TestSetDemo
 *
 * @author zhougf
 * @date 2019/06/02
 */
public class TestSetDemo {
    public static void main(String[] args) {
        Set<Short> set = new HashSet<>(8);
        for(Short i = 0; i < 100; i++) {
            set.add(i);
            set.remove(i-1);
        }
        System.out.println(set.size());
    }
}
