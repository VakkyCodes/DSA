import java.util.*;

public class SlidingWindowNotes {

    // 🔹 1. Maximum Sum Subarray of size K (Fixed Window)
    public static int maxSumSubarray(int[] arr, int k) {
        int sum = 0, maxSum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(i >= k - 1) {
                maxSum = Math.max(maxSum, sum);
                sum -= arr[i - (k - 1)];
            }
        }

        return maxSum;
    }

    // 🔹 2. Longest Substring Without Repeating Characters
    public static int longestSubstring(String s) {
        int[] freq = new int[256];
        int left = 0, maxLen = 0;

        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch]++;

            while(freq[ch] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    // 🔹 3. Longest Subarray with Sum ≤ K
    public static int longestSubarrayAtMostK(int[] arr, int k) {
        int left = 0, sum = 0, maxLen = 0;

        for(int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while(sum > k) {
                sum -= arr[left];
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    // 🔹 4. Count Subarrays with Sum = K (Using HashMap)
    public static int countSubarrays(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, count = 0;

        for(int num : arr) {
            sum += num;

            if(map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args) {

        int[] arr1 = {2, 1, 5, 1, 3, 2};
        System.out.println("Max Sum Subarray: " + maxSumSubarray(arr1, 3));

        System.out.println("Longest Substring: " + longestSubstring("abcabcbb"));

        int[] arr2 = {1, 2, 1, 1, 1};
        System.out.println("Longest Subarray ≤ K: " + longestSubarrayAtMostK(arr2, 3));

        int[] arr3 = {1, 1, 1};
        System.out.println("Count Subarrays Sum = K: " + countSubarrays(arr3, 2));
    }
}