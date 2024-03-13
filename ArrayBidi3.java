public class ArrayBidi3 {
    public static void main(String[] args) {
        int[] intArray = new int[]{ 2, 4, 20, 33, 45, 60 };

        // Declarar otro array para almacenar el doble de cada elemento
        int[] doubleIntArray = new int[intArray.length];

        // Mostrar el array original
        System.out.println("Array original:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println(); // Cambio de línea después de imprimir el array original

        // Calcular el doble de cada elemento y almacenarlo en el nuevo array
        for (int i = 0; i < intArray.length; i++) {
            doubleIntArray[i] = intArray[i] * 2;
        }

        // Mostrar el nuevo array con el doble de cada elemento
        System.out.println("Array con el doble de cada elemento:");
        for (int i = 0; i < doubleIntArray.length; i++) {
            System.out.print(doubleIntArray[i] + " ");
        }
    }
}



        
