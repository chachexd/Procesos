package actividadApagador;

import java.io.IOException;



public class Apagador {
    ProcessBuilder pb;
    public void apagar() throws IOException {
        System.out.println("Apagando el equipo...");
        String comando = "C:\\Windows\\System32\\shutdown.exe -s -t 3";
        pb = new ProcessBuilder(comando.split("\\s"));
        pb.start();
    }

    public void suspender() throws IOException {
        System.out.println("Suspendiendo el equipo...");

    }

    public void reiniciar() throws IOException {
        System.out.println("Reiniciando el equipo...");
        String comando = "C:\\Windows\\System32\\shutdown.exe -r -t 3";
        pb = new ProcessBuilder(comando.split("\\s"));
        pb.start();
    }
}
