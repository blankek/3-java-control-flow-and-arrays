package com.example.task06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int a, int b, int c, int d) {
        int[] numbers = new int[] {a, b, c, d};
        Arrays.sort(numbers);
        return numbers[numbers.length -1];
    }

}