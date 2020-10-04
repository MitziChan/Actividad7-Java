package com.mitzitec;

public class Main {

    public static void main(String[] args) {
        primos p = new primos();
        Fibonacci F = new Fibonacci();
        p.iniciar(20);
        p.esPrimo(10);
        F.fibonacci();
    }
}
