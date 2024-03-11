public class ArrayBurbujaSort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90}; // Arreglo a ordenar
        
        System.out.println("Arreglo original:");
        imprimirArreglo(array);

        bubbleSort(array);

        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(array);
    }

    public static void bubbleSort(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
