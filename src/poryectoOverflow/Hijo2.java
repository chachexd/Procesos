package poryectoOverflow;
import java.io.IOException;
import java.util.Scanner;

public class Hijo2 {
    public void killProcess(String proceso) throws IOException {
        // Construye el comando taskkill con el nombre del proceso
        ProcessBuilder pb = new ProcessBuilder("taskkill", "/F", "/IM", proceso);

        // Inicia el proceso de terminar
        Process p = pb.start();


    }

}
