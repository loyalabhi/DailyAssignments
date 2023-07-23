import java.util.Scanner;

public class KeyFinder {
    public static int findKey(int input1, int input2, int input3) {
        int thousandsDigit = input1 / 1000;
        int hundredsDigit = (input2 % 1000) / 100;
        int smallestDigit = findSmallestDigit(input3);

        int key = (thousandsDigit * hundredsDigit) + smallestDigit;
        return key;
    }

    public static int findSmallestDigit(int number) {
        int minDigit = 9;
        while (number > 0) {
            int digit = number % 10;
            minDigit = Math.min(minDigit, digit);
            number /= 10;
        }
        return minDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input1 (four-digit number): ");
        int input1 = scanner.nextInt();

        System.out.print("Enter input2 (four-digit number): ");
        int input2 = scanner.nextInt();

        System.out.print("Enter input3 (four-digit number): ");
        int input3 = scanner.nextInt();

        int key = findKey(input1, input2, input3);
        System.out.println("Key: " + key);
        
        scanner.close();
    }
}
