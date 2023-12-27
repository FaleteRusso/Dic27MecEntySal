package com.corenetworks.presentacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej1BufferedWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fSalida= null;
        BufferedWriter buffer = null;
        System.out.println("Se le solicitará escribir 5 frases");

            try {
                fSalida = new FileWriter("buferedWriter1.txt");
                buffer= new BufferedWriter(fSalida);
                for(int i = 0; i < 5; i++){
                    System.out.println("Escriba su frase "+ i);

                    buffer.write(sc.nextLine()+"\n" );

                }
                buffer.flush();
                buffer.close();
                fSalida.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

