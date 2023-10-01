package com.example;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int numero=0;
        int resultado=0;

        screen.println("Ingrese un numero entero");
        numero = keyboard.nextInt();
        resultado = numero%2;
        screen.println("El residuo de la division por 2 es:"+resultado);
    }
}

