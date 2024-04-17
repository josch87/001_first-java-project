import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        int largestNumber = 0;
        int[] moreNumbers = {11,12,13,14,15,16,17,18,19,20};
        int[] sumOfArrays = new int[moreNumbers.length];

        for (int number : numbers) {
            sum += number;
            if (largestNumber < number) {
                largestNumber = number;
            }
        }
        System.out.println("sum: " + sum);
        System.out.println("largestNumber: " + largestNumber);

        for (int i = 0; i < numbers.length; i++) {
            sumOfArrays[i] = numbers[i] + moreNumbers[i];
        }
        System.out.println("sumOfArrays: " + Arrays.toString(sumOfArrays));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter multiple lines of text (type 'done' to finish):");

        // Use a loop to read multiple lines until the user types 'done'
        String line;
        while (!(line = scanner.nextLine()).equals("done")) {
            System.out.println("You entered: " + line);
        }
        scanner.close();
    }



}
