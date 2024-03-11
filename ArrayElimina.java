import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayElimina {
    public static void main(String[] args) {
        String[] array = {"A", "C", "B", "E", "D"}; // Arreglo original
        String[] elementosAEliminar = {"B", "C"}; // Elementos a eliminar

        System.out.println("Arreglo original:");
        imprimirArreglo(array);

        // Crear una lista a partir del arreglo para facilitar la manipulación
        List<String> lista = new ArrayList<>(Arrays.asList(array));

        // Eliminar los elementos de la lista
        lista.removeAll(Arrays.asList(elementosAEliminar));

        // Convertir la lista resultante de nuevo en un arreglo
        array = lista.toArray(new String[0]);

        System.out.println("\nArreglo después de eliminar los elementos:");
        imprimirArreglo(array);
    }

    public static void imprimirArreglo(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
