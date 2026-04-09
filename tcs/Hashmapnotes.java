import java.util.*;

public class Hashmapnotes {

    // 🔹 1. Frequency Count
    public static void frequencyCount(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
        }

        System.out.println("Frequency: " + map);
    }

    // 🔹 2. First Non-Repeating Character
    public static void firstUnique(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : str.toCharArray()) {
            if(map.get(ch) == 1) {
                System.out.println("First Unique: " + ch);
                return;
            }
        }

        System.out.println("No unique character");
    }

    // 🔹 3. Two Sum
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if(map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    // 🔹 4. Longest Subarray with Sum = K
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0, maxLen = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum == k) {
                maxLen = i + 1;
            }

            if(map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    // 🔹 MAIN METHOD (for testing)
    public static void main(String[] args) {

        // Frequency
        frequencyCount("banana");

        // First Unique
        firstUnique("loveleetcode");

        // Two Sum
        int[] arr1 = {3, 2, 4};
        int[] res = twoSum(arr1, 6);
        System.out.println("Two Sum Indices: " + res[0] + ", " + res[1]);

        // Longest Subarray
        int[] arr2 = {1, 2, 3, 1, 1, 1, 2};
        System.out.println("Longest Subarray Length: " + longestSubarray(arr2, 3));
    }
} 