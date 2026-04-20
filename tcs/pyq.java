import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class pyq {
    public static void first() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the time in minutes");
        int min = sc.nextInt();
        System.out.println("enter the Distance ");
        if (min > 60 || min <= 0) {
            System.out.println("error");
            return;
        }
        int dist = sc.nextInt();
        double hour = min / 60.0;

        double speed = dist / hour;
        System.out.println(speed);
    }

    public static void second() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int curr = 0;
        int start = 0;
        int end = 0;
        int s = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            if (curr > max) {
                max = curr;
                start = s;
                end = i;
            }
            if (curr < 0) {
                curr = 0;
                s = i + 1;
            }
        }
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(max);
    }

    public static void third() {
        int r = 2;
        int c = 2;
        int arr[][] = { { 30, 40 }, { 50, 60 } };
        for (int i = 0; i < r; i++) {
            int rowSum = 0; // Initialize sum for each row
            for (int j = 0; j < c; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Sum of row " + i + ": " + rowSum);
        }
    }

    public static void fifth() {
        int arr[] = { 1, 1, 3, 5, 6, 3, 5 };
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        for (int i = arr.length - 1; i > 0; i--) {
            set.add(arr[i]);
        }

    }

    public static void sixt() {
        int arr[] = { 1, 2, 3, 4, 1 }; // You can change this to any test case
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println(minIndex); // This is the number of rotations
    }

    public static void seventh() {
        int arrp[] = { 1, 3, 2, 3, 4, 1 };
        int max = 0;
        int index = 0;
        int visited[] = new int[arrp.length];
        for (int i = 0; i < arrp.length; i++) {
            if (visited[i] == 1) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arrp.length; j++) {
                if (arrp[i] == arrp[j]) {
                    count++;
                    visited[j] = 1;
                }
            }
            if (count > max) {
                max = count;
                index = i;
            } else if (count == max && arrp[i] < arrp[index]) {
                max = count;
                index = i;
            }

            visited[i] = 1;
            System.out.println(count + " " + arrp[i]);

        }
        System.out.println("max is " + arrp[index]);

    }

    public static void eight(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int ans = Integer.MAX_VALUE;
        // Find the element with highest frequency (smallest if tie)
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();
            if (freq > maxFreq || (freq == maxFreq && key < ans)) {
                maxFreq = freq;
                ans = key;
            }
        }
        System.out.println(ans);
    }

    public static void ninth() {
        int arr[] = { 5, 6, 7 };
        int[][] mat = {
                { 0, 1, 3 },
                { 1, 0, 2 },
                { 3, 2, 0 }
        };
        int max = 1000;
        for (int i = 0; i < mat.length; i++) {
            int sum = 0; // Loop over rows
            for (int j = 0; j < mat[i].length; j++) {

                if (i == j) {
                    mat[i][j] = arr[i];
                }
                sum += mat[i][j];
            }
            if (sum < max) {
                 max = sum;               
            }
        }
        for (int i = 0; i < mat.length; i++) { // Loop over rows
            for (int j = 0; j < mat[i].length; j++) { // Loop over columns
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
           
        }
         System.out.println("the min element is"+max);
    }
public static void tesnth(){
    double discount=0;
    double amount=6000;
    if(amount<1000){
        discount=0.05*amount;
        amount-=discount;
    }
     else if(amount >= 1000 && amount < 5000){
        discount=0.1*amount;
        amount-=discount;
    }
     else if(amount >= 5000){
        discount=0.15*amount;
        amount-=discount;
    }
    System.out.println(amount);
}
    public static void main(String[] args) {
        tesnth();
        
    }
}