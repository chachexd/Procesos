package poryectoOverflow;

import java.io.IOException;
import java.util.Scanner;

public class ProcesoPadre {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos procesos hay?");
        int cantidad = scanner.nextInt();
        Hijo1 obj = new Hijo1();
        obj.recogerProcesos(cantidad);

    }
}
