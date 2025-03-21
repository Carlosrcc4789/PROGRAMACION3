package ejerccio3;

class MaxMinVector {
    public static void main(String[] args) {
        int[] vector = {3, 5, 1, 8, 2, 7, 4};
        int maximo = vector[0];
        int minimo = vector[0];
        int indiceMaximo = 0;
        int indiceMinimo = 0;

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
                indiceMaximo = i;
            }
            if (vector[i] < minimo) {
                minimo = vector[i];
                indiceMinimo = i;
            }
        }

        System.out.println("Máximo: " + maximo + " en índice " + indiceMaximo);
        System.out.println("Mínimo: " + minimo + " en índice " + indiceMinimo);
    }
}
