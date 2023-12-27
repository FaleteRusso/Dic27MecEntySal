package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;

public class ProbarFileWriter {
    public static void main(String[] args) {
        //1. Declarar variables
        FileWriter fSalida = null;
        try {
            fSalida = new FileWriter("primer_ejemplo.txt");
            //2. Acciones entrada/salida
            fSalida.write("Hola mundo desde java");
            //3. Cerrar flujos
            fSalida.flush();
            fSalida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
