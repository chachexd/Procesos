package actividadApagador;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Apagador proceso = new Apagador();
        System.out.println("1- Apagar");
        System.out.println("2- Reiniciar");
        System.out.println("3- Suspender");
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                proceso.apagar();
                break;
            case 2:
                proceso.reiniciar();
                break;
            case 3:
                proceso.suspender();
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }


    }
}
