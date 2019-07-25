package com.hope.corejava.lambda;

import org.junit.Test;

import java.util.function.BinaryOperator;

/**
 * LambdaTest
 *
 * @author zhougf
 * @date 2019/07/25
 */
public class LambdaTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (n1, n2) -> n1 + n2;
        //apply方法用于接收参数，并返回BinaryOperator中的Integer类型
        System.out.println(add.apply(3, 4));
        BinaryOperator<String> addStr = (n1, n2) -> n1 +"==="+ n2;
        //apply方法用于接收参数，并返回BinaryOperator中的String类型
        System.out.println(addStr.apply("3", "4"));
    }

}
