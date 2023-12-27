package com.corenetworks.presentacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class probarFileReader {
    public static void main(String[] args) {
        //definir variables
        FileReader fEntrada=null;
        char []buffer = new char[128];
        int longitudLeida =0;
        //Acciones E/S
        try {
            fEntrada = new FileReader("primer_ejemplo.txt");
            longitudLeida=fEntrada.read(buffer);
            System.out.println("El buffer tiene-> "+Arrays.toString(buffer));
            System.out.println("La longitud es -> "+longitudLeida);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Cerrar las clases que gestionan stream

    }
}
