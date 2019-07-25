package com.hope.corejava.sorting;

import java.util.Arrays;

/**
 * SortingTest
 *
 * @author zhougf
 * @date 2019/7/25
 */
public class SortingTest {
    /**
     * ц╟ещеепР
     *
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }

        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{1, 5, 8, 89, 12})));
    }
}
