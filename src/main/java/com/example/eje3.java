package com.example;

import java.io.PrintStream;
import java.util.Scanner;

public class eje3 {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] arg) {
        int horaseman=0;
        int costohora=0;
        float retenfuente=0;
        long salarbruto=0;
        long salarneto=0;
        long retenfuente2=0;

        screen.println("Indique horas trabajadas a la semana");
        horaseman=keyboard.nextInt();
        screen.println("Indique un valor por cada hora trabajada");
        costohora=keyboard.nextInt();
        screen.println("Indique la retefuente");
        retenfuente=keyboard.nextFloat();
        salarbruto=horaseman*costohora;
        retenfuente2=(long)(salarbruto*(retenfuente/100));
        salarneto=salarbruto-retenfuente2;

        screen.println("El salario bruto es de "+ salarbruto +", el salario neto es de "+ salarneto +" y la retencion en la fuente "+retenfuente2+"");

    }
    
}
