public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};

        int index = 0;

        // Move non-zero elements forward
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining with zeros
        while(index < arr.length) {
            arr[index] = 0;
            index++;
        }

        // Print result
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}