package poryectoOverflow;

import java.io.IOException;
import java.util.Scanner;

public class Hijo1 {
    public void recogerProcesos(int cantidad) throws IOException {
        Hijo2 obj2 = new Hijo2();
        Scanner scanner = new Scanner(System.in);
        String[] lista = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Dime el nombre del proceso: " + i);
            lista[i] = scanner.nextLine();
        }
        for (int i = 0; i < lista.length; i++) {
            obj2.killProcess(lista[i]);
            System.out.println("Se ha eliminado el proceso: " + lista[i]);
        }
    }

}
