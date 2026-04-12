import java.util.*;

public class arrray {

    // 🔹 1. Two Sum (Brute force)
    public static int[] twoSumBrute(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // 🔹 2. Kadane’s Algorithm (Max Subarray Sum)
    public static int maxSubarraySum(int[] arr) {
        int maxSum = arr[0], curr = arr[0];

        for(int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            maxSum = Math.max(maxSum, curr);
        }

        return maxSum;
    }

    // 🔹 3. Move Zeros to End
    public static void moveZeros(int[] arr) {
        int j = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    // 🔹 4. Reverse Array
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // 🔹 5. Find Missing Number (0 to n)
    public static int missingNumber(int[] arr) {
        int xor = 0;

        for(int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
            xor ^= (i + 1);
        }

        return xor;
    }
    public static void mixedSeriesNthTerm(int n) {
    int fib1 = 1, fib2 = 1, fibNext = 1;
    int primeCount = 0, num = 2;
    int fibIndex = 1, primeIndex = 0;
    int result = 0;

    for (int i = 1; i <= n; i++) {
        if (i % 2 != 0) { // Odd position: Fibonacci
            if (fibIndex == 1 || fibIndex == 2) {
                result = 1;
            } else {
                fibNext = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibNext;
                result = fibNext;
            }
            fibIndex++;
        } else { // Even position: Prime
            while (true) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeCount++;
                    result = num;
                    num++;
                    break;
                }
                num++;
            }
            primeIndex++;
        }
    }
    System.out.println(result);
}

    // 🔹 MAIN METHOD
    public static void main(String[] args) {

        int[] arr1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSumBrute(arr1, 9)));

        int[] arr2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Subarray Sum: " + maxSubarraySum(arr2));

        int[] arr3 = {0, 1, 0, 3, 12};
        moveZeros(arr3);
        System.out.println("Move Zeros: " + Arrays.toString(arr3));

        int[] arr4 = {1, 2, 3, 4, 5};
        reverse(arr4);
        System.out.println("Reversed: " + Arrays.toString(arr4));

        int[] arr5 = {3, 0, 1};
        System.out.println("Missing Number: " + missingNumber(arr5));
    }
}