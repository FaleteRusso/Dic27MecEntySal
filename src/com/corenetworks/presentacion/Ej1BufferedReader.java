import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej1BufferedReader {
    public static void main(String[] args) {
        FileReader fentrada = null;
        BufferedReader buffer = null;
        String linea = null;
        int contador=0;
        try {
            fentrada = new FileReader("buffered_writer_ejemplo.txt");
            buffer = new BufferedReader(fentrada);
            while (true) {
                linea = buffer.readLine();
                if (linea == null) {
                    break;
                }
                System.out.println(linea);
                contador++;
            }
            System.out.println("Se han leido "+ contador + " lineas");
            buffer.close();
            fentrada.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
