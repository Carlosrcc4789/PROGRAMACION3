package burbuja;

public class Burbuja {


    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio;


        for (int i = 0; i < n - 1; i++) {
            intercambio = false;


            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {

                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambio = true;
                }
            }

            if (!intercambio) {
                break;
            }
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90,60,30,10};

        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        ordenarBurbuja(arreglo);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);
    }
}
