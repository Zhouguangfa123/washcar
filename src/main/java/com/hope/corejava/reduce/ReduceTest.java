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
        //求和
        Integer result = stream.reduce(0, Integer::sum);
        // 类型声明
    }
}
