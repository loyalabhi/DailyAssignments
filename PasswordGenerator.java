import java.util.Arrays;
import java.util.Scanner;

public class PasswordGenerator {
    public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int[] numbers = {input1, input2, input3, input4, input5};
        int[] stableNumbers = getStableNumbers(numbers);

        int maxStableNumber = Arrays.stream(stableNumbers).max().getAsInt();
        int minStableNumber = Arrays.stream(stableNumbers).min().getAsInt();

        return maxStableNumber + minStableNumber;
    }

    public static int[] getStableNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (isStable(number)) {
                count++;
            }
        }

        int[] stableNumbers = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (isStable(number)) {
                stableNumbers[index++] = number;
            }
        }

        return stableNumbers;
    }

    public static boolean isStable(int number) {
        int[] digitFrequency = new int[10];
        while (number > 0) {
            int digit = number % 10;
            digitFrequency[digit]++;
            number /= 10;
        }

        int firstFrequency = 0;
        for (int i = 0; i < digitFrequency.length; i++) {
            if (digitFrequency[i] != 0) {
                firstFrequency = digitFrequency[i];
                break;
            }
        }

        for (int i = 0; i < digitFrequency.length; i++) {
            if (digitFrequency[i] != 0 && digitFrequency[i] != firstFrequency) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input1: ");
        int input1 = scanner.nextInt();

        System.out.print("Enter input2: ");
        int input2 = scanner.nextInt();

        System.out.print("Enter input3: ");
        int input3 = scanner.nextInt();

        System.out.print("Enter input4: ");
        int input4 = scanner.nextInt();

        System.out.print("Enter input5: ");
        int input5 = scanner.nextInt();

        int password = findPassword(input1, input2, input3, input4, input5);
        System.out.println("Password: " + password);

        scanner.close();
    }
}
