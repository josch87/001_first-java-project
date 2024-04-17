import java.util.Arrays;

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
        System.out.println(Arrays.toString(sumOfArrays));
    }
}
