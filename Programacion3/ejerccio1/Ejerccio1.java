package ejerccio1;

import java.util.Random;

public class Ejerccio1 {
    int[] vector_numeros = new int[10];

    public Ejerccio1() {
        // Constructor vacío
    }

    public void ejecutar() {
        Random random = new Random();

        // Llenar el vector con números aleatorios
        for (int i = 0; i < vector_numeros.length; i++) {
            int aleatorio = random.nextInt(10) + 1; // Genera un número aleatorio entre 1 y 10
            vector_numeros[i] = aleatorio;
        }

        // Mostrar el cuadrado y el cubo de cada número
        for (int i = 0; i < vector_numeros.length; i++) {
            int numero = vector_numeros[i];
            int cuadrado = (int) Math.pow(numero, 2);
            int cubo = (int) Math.pow(numero, 3);
            System.out.println("vector_numeros[" + i + "]:" + numero + ", cuadrado: " + cuadrado + ", cubo: " + cubo + ";");
        }
    }
}
