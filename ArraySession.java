import java.util.Arrays;

public class ArraySession {
    public static void main(String[] args) {

        int[] ages = new int[10];
        ages[0] = 20;
        ages[1] = 20;

        String[] names = new String[10];
        names[0] = "John";
        names[1] = "Aljoscha";

        System.out.println(Arrays.toString(ages));

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        for (String name : names) {
            System.out.println(name);
        }




            // Create a 2x2 matrix (2-dimensional array)
            int[][] matrix = new int[2][2];

            // Assign values to the matrix
            matrix[0][0] = 1;
            matrix[0][1] = 2;
            matrix[1][0] = 3;
            matrix[1][1] = 4;

            // Access and print values from the matrix
            System.out.println("Matrix elements:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(); // Move to the next row
            }
    }
}
