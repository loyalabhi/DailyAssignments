import java.util.*;

public class CumulativeMultiple {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arrNum = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arrNum[i] = in.nextInt();
        }

        try {
            calculateCumulative(arrNum);
            System.out.println("Output: arrNum = " + Arrays.toString(arrNum));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        in.close(); 
    }

    public static void calculateCumulative(int[] arr) {
        int cumulativeMultiple = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cumulativeMultiple = 0;
                break;
            }
            arr[i] = cumulativeMultiple *= arr[i];
        }
    }
}
