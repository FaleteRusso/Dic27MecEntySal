package com.corenetworks.presentacion;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ej1FileOutputStream {
    public static void main(String[] args) {
        FileOutputStream fSalida = null;
        DataOutputStream dato = null;
        byte num =1;
        short num1 =10;
        int num2 = 12342;
        long num3 = 2136247783;
        float num4 =23.54434343F;
        double num5 =23.53;
        char letra = 'a';
        boolean yes = true;
        try {
            fSalida = new FileOutputStream("Prinitivos.dat");
            dato= new DataOutputStream(fSalida);
            dato.writeByte(num);
            dato.writeShort(num1);
            dato.writeInt(num2);
            dato.writeFloat(num4);
            dato.writeDouble(num5);
            dato.writeChar(letra);
            dato.writeBoolean(true);

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

}
