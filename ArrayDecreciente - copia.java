import java.util.Arrays;

public class ArrayDecreciente {
    public static void main(String[] args) {
        int[] matriz1 = {3, 9, 6, 5, 2, 8};
        int[][] matriz2 = new int[matriz1.length][]; // matriz2 tendrá la misma cantidad de filas que matriz1
        
        Arrays.sort(matriz1); // Ordena la matriz1
        
        for (int i = 0; i < matriz1.length; i++) {
            matriz2[i] = new int[matriz1.length - i]; // Cada fila tiene una longitud decreciente
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = matriz1[i + j]; // Construye cada fila de matriz2
            }
        }
        
        System.out.println("Matriz 1 ordenada: ");
        imprimirMatriz(matriz1);
        
        System.out.println("Matriz 2 construida: ");
        imprimirMatriz(matriz2);
    }
    
    public static void imprimirMatriz(int[] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i] + " ");
        }
        System.out.println();
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}






