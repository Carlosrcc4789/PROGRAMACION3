package mes;

import java.util.ArrayList;
import java.util.Scanner;

public class VectorMeses {
    public static void main(String[] args) {

        ArrayList<Mes> meses = new ArrayList<>();

        meses.add(new Mes("Enero", 31));
        meses.add(new Mes("Febrero", 28));
        meses.add(new Mes("Marzo", 31));
        meses.add(new Mes("Abril", 30));
        meses.add(new Mes("Mayo", 31));
        meses.add(new Mes("Junio", 30));
        meses.add(new Mes("Julio", 31));
        meses.add(new Mes("Agosto", 31));
        meses.add(new Mes("Septiembre", 30));
        meses.add(new Mes("Octubre", 31));
        meses.add(new Mes("Noviembre", 30));
        meses.add(new Mes("Diciembre", 31));

        System.out.println("Lista de meses disponibles:");
        for (int i = 0; i < meses.size(); i++) {
            System.out.println((i + 1) + ". " + meses.get(i).getNombre());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngresa el número del mes (1-12): ");
        int mesSeleccionadoNumero = scanner.nextInt();

        if (mesSeleccionadoNumero < 1 || mesSeleccionadoNumero > 12) {
            System.out.println("Número de mes inválido. Debe estar entre 1 y 12.");
        } else {

            Mes mesSeleccionado = meses.get(mesSeleccionadoNumero - 1);
            System.out.println("Mes seleccionado: " + mesSeleccionado.getNombre() + " con " + mesSeleccionado.getDias() + " días.");
        }

        scanner.close();
    }
}
