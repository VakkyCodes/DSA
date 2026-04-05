public class bit {
    public static void unique(int arr[]) {
        int ans = 0;
        for (int i : arr) {
            ans ^= i;
        }
        System.out.println(ans);
    }

    public static void evenodd() {
        int n = 9;
        System.out.println((n & 1) == 1 ? "odd" : "even");
    }

    public static void poweroftwo() {
        int n = 16;
        if ((n & (n - 1)) == 0)
            System.out.println("yes it is power of 2");
        else
            System.out.println("no it is not");
    }

    public static void countone() {
        int n = 6;
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        System.out.println(count);
    }
     public static void findTwoSingles(int[] arr) {
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }
        int mask = xor & (-xor);
        int num1 = 0, num2 = 0;
        for (int num : arr) {
            if ((num & mask) == 0) {
                num1 ^= num;   // group A
            } else {
                num2 ^= num;   // group B
            }
        }

        System.out.println("Two single numbers are: " + num1 + " and " + num2);
    }
      public static void findMissingNumber(int[] arr) {
        int missing = 0;
        
        // XOR all numbers in the array
        for (int num : arr) {
            missing ^= num;
        }
        
        // XOR all numbers from 0 to n (expected range)
        for (int i = 0; i <= arr.length; i++) {
            missing ^= i;
        }
        
        System.out.println(missing);
    }
    

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 4, 5};
        unique(arr);
        evenodd();
        poweroftwo();
        countone();
        findTwoSingles(arr);
        findMissingNumber(arr);
    }
}
