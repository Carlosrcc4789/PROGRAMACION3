package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    String[] original;
    String[] inverso;
    Scanner scanner;

    public Ejercicio2(int size) {
        original = new String[size];
        inverso = new String[size];
        scanner = new Scanner(System.in);
    }

    public void ejecutar() {
        // Lectura de la cadena original
        for (int i = 0; i < original.length; i++) {
            System.out.print("Ingresa la cadena original [" + i + "]: ");
            String cadena = scanner.nextLine();
            original[i] = cadena;
        }

        // Inversión del array original
        for (int i = 0; i < original.length; i++) {
            inverso[i] = original[original.length - 1 - i];
        }

        // Mostrar el array inverso
        System.out.println("Array invertido:");
        for (int i = 0; i < inverso.length; i++) {
            System.out.println("inverso [" + i + "]: " + inverso[i]);
        }
    }
}

