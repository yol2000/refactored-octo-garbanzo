public class ArrayDesplaza {
    public static void main(String[] args) {
        String[] array = {"A", "C", "B", "E", "D"}; // Arreglo de cadenas

        System.out.println("Arreglo original:");
        imprimirArreglo(array);

        // Guardar la última letra del arreglo
        String ultimaLetra = array[array.length - 1];

        // Desplazar hacia la derecha todas las letras en el arreglo
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        // Colocar la última letra en la primera posición del arreglo
        array[0] = ultimaLetra;

        System.out.println("\nArreglo modificado:");
        imprimirArreglo(array);
    }

    public static void imprimirArreglo(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}