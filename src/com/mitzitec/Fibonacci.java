package com.mitzitec;

public class Fibonacci {
    int serie = 10;
       public void fibonacci(){
           System.out.println("");
           System.out.println("Sucesión de Fibonacci: ");
           for (int i = 0; i < serie; i++) {
               System.out.print(fibonacciRecursivo(i)+ " ,");
           }
       }

        public static int fibonacciRecursivo(int n) {
        if (n == 0) {
            return 0;

        } else if (n == 1) {
            return 1;
        } else {

            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }

    }

}
