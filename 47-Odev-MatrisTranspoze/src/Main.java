import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };
        int[][] transpozedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++){
                transpozedMatrix[i][j] = matrix[j][i];
            }
        }
        System.out.println("Matris:");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Transpoze:");
        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(transpozedMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}