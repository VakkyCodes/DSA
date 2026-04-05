public class second {
    public static void main(String[] args) {
        int arr[] = {12, 45, 1, 90};

        if (arr.length < 2) {
            System.out.println(-1);
            return;
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > largest) {
                second = largest;
                largest = i;
            } 
            else if (i > second && i != largest) {
                second = i;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(second);
        }
    }
}