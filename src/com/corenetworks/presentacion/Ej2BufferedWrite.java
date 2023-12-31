package com.corenetworks.presentacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej2BufferedWrite {
    public static void main(String[] args) {
        FileWriter fSalida = null;
        BufferedWriter buffer = null;
        Scanner sc = new Scanner(System.in);
        String nombre = null;
        int edad = 0;
        String frase = null;

        try {
            fSalida = new FileWriter("buffered_Write_Ej2.txt");
            buffer= new BufferedWriter(fSalida);
            buffer.write("NOMBRE \t \t \tEDAD\n");
            buffer.write("-".repeat(50)+ "\n");
            //2. Acciones e/S
            for(int i = 1; i <=5; i++){
                System.out.println("Escriba el nombre  " + i);
                nombre = sc.nextLine();
                System.out.println("Escriba la edad " + i);
                edad = sc.nextInt();
                sc.nextLine();
                frase = String.format("%-20s \t \t \t %d \n", nombre, edad);
                buffer.write(frase);

            }
            //3. Cerrar los flujos
            fSalida.flush();
            buffer.flush();
            buffer.close();
            fSalida.close();
            sc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
    }

}
    }
