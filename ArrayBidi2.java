public class ArrayBidi2 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][5]; // Creación de una matriz
        matriz[0][0] =1;
        matriz[0][1] =2;
        matriz[0][2] =3;
        matriz[0][3] =4;
        matriz[1][0] =5;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i * matriz[i].length) + j;
                System.out.println("Matriz[" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }
}
