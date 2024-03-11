public class ArrayBurbujaSort2 {
    public static void main(String[] args) {
        int[] array = {3, 9, 6, 5, 2, 8}; // Arreglo a ordenar
        boolean check = false; // Variable para verificar si se realizó algún intercambio en la iteración
        
        System.out.println("Arreglo original:");
        imprimirArreglo(array);
        
        // Realizar las primeras 5 vueltas del algoritmo de burbuja
        for (int vuelta = 1; vuelta <= 5; vuelta++) {
            System.out.println("\nVuelta " + vuelta + ":");
            check = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    check = true; // Se realizó al menos un intercambio en esta vuelta
                }
            }
            
            // Mostrar el arreglo después de esta vuelta
            imprimirArreglo(array);
            
            // Si no se realizó ningún intercambio en esta vuelta, el arreglo ya está ordenado
            if (!check) {
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
}
