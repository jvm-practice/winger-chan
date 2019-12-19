package com.maxwit;

import java.util.Arrays;

public class App
{
    public int calculate(String expression) {
        String[] aa = expression.split("\\+");
        System.out.println(expression + " => " + Arrays.toString(aa));
        int sum = 0;
        for (String a : aa) {
            sum = sum + Integer.parseInt(a);
        }
        return sum;
    }

    public static void main( String[] args ) {
        App app = new App();
        int num = app.calculate("1+2+3");
        System.out.println(num);
    }
}

