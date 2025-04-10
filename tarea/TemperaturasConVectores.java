import java.util.Scanner;

public class TemperaturasConVectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturasMinimas = new double[5];
        double[] temperaturasMaximas = new double[5];
        double[] temperaturasMedias = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Día " + (i + 1) + ":");
            System.out.print("Introduce la temperatura mínima: ");
            temperaturasMinimas[i] = scanner.nextDouble();
            System.out.print("Introduce la temperatura máxima: ");
            temperaturasMaximas[i] = scanner.nextDouble();


            temperaturasMedias[i] = (temperaturasMinimas[i] + temperaturasMaximas[i]) / 2;
        }
        System.out.println("\nResumen de temperaturas:");
        System.out.println("Día\tMínima\tMedia\tMáxima");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f%n", (i + 1), temperaturasMinimas[i], temperaturasMedias[i], temperaturasMaximas[i]);
        }
        double menorTempMinima = temperaturasMinimas[0];
        for (int i = 1; i < temperaturasMinimas.length; i++) {
            if (temperaturasMinimas[i] < menorTempMinima) {
                menorTempMinima = temperaturasMinimas[i];
            }
        }
        System.out.println("\nDías con la temperatura mínima más baja:");
        for (int i = 0; i < 5; i++) {
            if (temperaturasMinimas[i] == menorTempMinima) {
                System.out.printf("Día %d con %.2f °C%n", (i + 1), menorTempMinima);
            }
        }
        scanner.close();
    }
}

