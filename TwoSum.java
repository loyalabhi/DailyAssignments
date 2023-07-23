import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        throw new IllegalArgumentException("No two numbers add up to the target sum.");
    }

    public static void main(String[] args) {
        TwoSum twoSumObj = new TwoSum();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int length = scanner.nextInt();
        int[] nums = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        int[] result = twoSumObj.twoSum(nums, target);

        System.out.println("Indices of the two numbers that add up to the target sum:");
        System.out.println(Arrays.toString(result));
    }
}