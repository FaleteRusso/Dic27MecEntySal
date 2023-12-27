package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        //1. Declarar variables
        FileWriter fSalida = null;
        Scanner teclado = new Scanner(System.in);
        String nombre = null;
        int edad = 0,acumuladorEdad=0;
        double nota = 0, acumuladorNota=0;
        String frase = null;


        try {
            try {
                fSalida = new FileWriter("tercer_ejemplo.txt");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            fSalida.write("NOMBRE \t \t \tEDAD\t \t \tNOTA\n");
            fSalida.write("*".repeat(58) + "\n");
            //2. Acciones e/S
            for (int i = 1; i <= 5; i++) {
                System.out.println("Escriba el nombre  " + i);
                nombre = teclado.nextLine();
                System.out.println("Escriba la edad " + i);
                edad = teclado.nextInt();
                acumuladorEdad+=edad;
                System.out.println("Escriba la nota " + i);
                nota = teclado.nextDouble();
                acumuladorNota+=nota;
                teclado.nextLine();
                frase = String.format("%-20s \t \t \t %d\t \t \t%e \n", nombre, edad,nota);

            }
            fSalida.write(String.format("el promedio de notas es %.2f",acumuladorNota/5));
            fSalida.write(String.format("El promedio de edades es %.d",acumuladorEdad/5));
            fSalida.flush();
            fSalida.close();
            teclado.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

