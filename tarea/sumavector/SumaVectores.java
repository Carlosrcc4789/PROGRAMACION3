package sumavector;

public class SumaVectores {
    public static void main(String[] args) {

        int[] vector1 = {1, 2, 3};
        int[] vector2 = {4, 5, 6};

        if (vector1.length != vector2.length) {
            System.out.println("Los vectores deben tener el mismo tamaño.");
            return;
        }


        int[] suma = new int[vector1.length];


        for (int i = 0; i < vector1.length; i++) {
            suma[i] = vector1[i] + vector2[i];
        }


        System.out.print("Resultado de la suma de vectores: ");
        for (int i : suma) {
            System.out.print(i + " ");
        }
    }
}
