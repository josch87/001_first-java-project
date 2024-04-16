public class SimpleCalculation {
    public static void main(String[] args) {

        System.out.println(add(2,3));
        System.out.println(add(2.4,3.6));
        System.out.println(subtract(2,3));
        System.out.println(subtract(2.2,3.3));

        System.out.println(makePositive(0));

        int a = 2;
        int b = 10;

        if (a > b) {
            System.out.println(subtract(a, b));
        } else {
            System.out.println(add(a, b));
        }

        System.out.println(evenOrOdd(3));

        System.out.println("isPalindrome? " + isPalindrome("Anna"));

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static int makePositive(int a) {
        if (a >= 0) {
            return a;
        } else {
            return a * -1;
        }
    }

    public static int evenOrOdd(int a) {
        if (a % 2 == 0) {
            return a;
        } else {
            return a * 2;
        }
    }

    public static boolean isPalindrome(String text) {
        String lowerCaseText = text.toLowerCase();
        StringBuilder reversedText = new StringBuilder();
        reversedText.append(lowerCaseText).reverse();

        return lowerCaseText.contentEquals(reversedText.toString());
    }


}
