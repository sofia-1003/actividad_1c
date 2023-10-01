package com.example;

import java.io.PrintStream;
import java.util.Scanner;


public class ejer4 {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] arg) {}

    long money=0;
    long mil=0;
    long quinientos=0;
    long docientos=0;
    long cien=0;
    long cincuenta=0;
    long uno=0;

    screen.println("Ingrese una cantidad de dinero");

    money = keyboard.nextLong();
    mil = money / 1000;
    quinientos = (money % 1000) / 500;
    docientos = ((money % 1000) % 500)/ 200;
    cien = (((money % 1000) % 500 ) % 200)/ 100;
    cincuenta = ((((money % 1000)% 500)% 200)% 100)/50;
    uno = (((((money % 1000)% 500)% 200)% 100)% 50);

    screen.println(("las monedas de 1000 que se requieren son" +mil \



}
