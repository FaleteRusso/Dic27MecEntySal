package com.corenetworks.presentacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProbarBufferedReader {
    public static void main(String[] args) {
        //declarar variables
        FileReader fEntrada=null;
        BufferedReader buffer=null;
        String linea= null;

        //acciones e/s
        try {
            fEntrada=new FileReader("buffered_writer_ejemplo.txt");
            buffer=new BufferedReader(fEntrada);
            while(true){
                linea = buffer.readLine();
                if(linea ==null){
                    break;
                }
                System.out.println(linea);
            }
            //cierre Stream
            buffer.close();
            fEntrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }



    }
}
