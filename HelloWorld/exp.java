package com.khsmwv.richardi;

public class exp {

    public static int factorial(int n) {
        int retval = 1;
        for(int i = n; i > 0; i--) {

            retval *= i;
        }
        return retval;
    }

    public static double myexp(double x, int n) {
        double retval = 1.0;
        int i = 1;
        double numerator = 1.0;
        double denominator = 1.0;

        while(i < n) {
            numerator *= x;
            denominator *= i;
            retval += numerator / denominator;
            i++;
        }


        return retval;
    }

    public static void check(double x) {
        System.out.printf("%.1f\t%.4f\t%.4f\n", x, Math.exp(x), myexp(x, 20));

    }


    public static void main(String[] args) {
        check(13);
        for(double i = 0.1; i <= 100; i *= 10 ) {
            check(i);
        }
        System.out.println();
        for(double i = -0.1; i >= -100; i *= 10 ) {
            check(i);
        }



    }
}
