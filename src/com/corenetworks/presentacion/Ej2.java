package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        //solicitar por consola el nombre y la edad de una persona (cincoveces)
        //en le fichero de salida se ha de guardar asi:
        //NOMBRE            EDAD
        //XXXXXX            XXXXXX
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fSalida = new FileWriter("NombreyEdad.txt");
            fSalida.write("NOMBRE          EDAD"+ "\n");
            for(int i = 0; i < 5; i++){
                System.out.println("Escriba su nombre y edad");
                fSalida.write(sc.nextLine() + "\n");
            }
            fSalida.flush();
            // Cerrar los flujos
            fSalida.close();
            sc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* Ejemplo de la profe, con estructura y esta novedad:
        frase = String.format("%-20s \t \t \t %d \n", nombre, edad); esto encuadra la respuesta
                //1. Declarar variables
        FileWriter fSalida = null;
        Scanner teclado = new Scanner(System.in);
        String nombre = null;
        int edad = 0;
        String frase = null;
        try {
            fSalida = new FileWriter("tercer_ejemplo.txt");
            fSalida.write("NOMBRE \t \t \tEDAD\n");
            fSalida.write("-".repeat(50)+ "\n");
            //2. Acciones e/S
            for(int i = 1; i <=5; i++){
                System.out.println("Escriba el nombre  " + i);
                nombre = teclado.nextLine();
                System.out.println("Escriba la edad " + i);
                edad = teclado.nextInt();
                teclado.nextLine();
                frase = String.format("%-20s \t \t \t %d \n", nombre, edad);
                fSalida.write(frase);

            }
            //3. Cerrar los flujos
            fSalida.flush();
            fSalida.close();
            teclado.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
         */
    }
}
