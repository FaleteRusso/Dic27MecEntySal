package com.corenetworks.presentacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ej4Read {
    public static void main(String[] args) {
        //mejorar el codigo anterior para que lea hasta final de archivo
        //definir variables
        FileReader fEntrada=null;
        char []buffer = new char[128];
        int longitudLeida =0;
        //Acciones E/S
        try {
            fEntrada = new FileReader("primer_ejemplo.txt");
            while(longitudLeida!=-1){
                System.out.println("Entra el bucle");
               longitudLeida=fEntrada.read(buffer);
                System.out.println(Arrays.toString(buffer));
            }
            //Cerrar las clases que gestionan stream
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    }
