package com.example;

import java.io.PrintStream;
import java.util.Scanner;

public class Ejer2 {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] arg) {
        long numercel=0;
        int prefijo=0;

        screen.println("ingrese un numero de celular");

        numercel=keyboard.nextLong();

        prefijo= (int) (numercel/10000000);
        
        screen.println("El prefijo del operador es: "+prefijo);

      }
}
    
