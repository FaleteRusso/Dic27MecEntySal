package com.corenetworks.presentacion;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProbarFileOutputStream {
    public static void main(String[] args) {
        FileOutputStream fSalida = null;
        DataOutputStream buffer = null;
        int contador = 5;
        try {
            fSalida = new FileOutputStream("datos.dat");
            buffer= new DataOutputStream(fSalida);
            buffer.writeInt(contador);

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
