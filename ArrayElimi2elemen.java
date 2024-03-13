import java.util.ArrayList;
import java.util.List;

public class ArrayElimi2elemen {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Arreglo original

        System.out.println("Arreglo original:");
        imprimirArreglo(array);

        // Crear una lista a partir del arreglo para facilitar la manipulación
        List<Integer> lista = new ArrayList<>();
        for (int elemento : array) {
            lista.add(elemento);
        }

        // Elementos a eliminar
        int[] elementosAEliminar = {3, 5};

        // Eliminar los elementos de la lista
        for (int elemento : elementosAEliminar) {
            lista.remove((Integer) elemento);
        }

        // Convertir la lista resultante de nuevo en un arreglo
        array = lista.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("\nArreglo después de eliminar los elementos:");
        imprimirArreglo(array);
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
