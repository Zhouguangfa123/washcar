package com.hope.corejava.reduce;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * ReduceTest
 *
 * @author zhougf
 * @date 2019/7/25
 */
public class ReduceTest {

    @Test
    public void reduceTest() {
        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        //һ����ֻ��ʹ��һ��
        Stream<Integer> stream1 = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        //���
        Integer result = stream.reduce(8, Integer::sum);
        Integer result1 = stream1.reduce(8, (a,b)-> a+b);
        System.out.println(result);
        System.out.println(result1);
        // ��������
    }
}
