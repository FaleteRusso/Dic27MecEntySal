package com.corenetworks.presentacion;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProbarBufferedWriter {
    public static void main(String[] args) {
        //declara variables
        FileWriter fSalida= null;
        BufferedWriter buffer = null;

        //acciones E/S
        try {
            fSalida= new FileWriter("buffered_writer_ejemplo.txt");
            buffer= new BufferedWriter(fSalida);
            buffer.write("usando bufferedWrite...");
            //cerrar flujos
            buffer.flush();
            buffer.close();
            fSalida.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }
}
