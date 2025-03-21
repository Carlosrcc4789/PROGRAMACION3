import ejercicio2.Ejercicio2;

import java.util.Scanner;

public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    System.out.print("¿Cuántas cadenas deseas ingresar? ");
    int size = inputScanner.nextInt();
    inputScanner.nextLine();

    Ejercicio2 ejercicio = new Ejercicio2(size);
    ejercicio.ejecutar();
    inputScanner.close();
}
}