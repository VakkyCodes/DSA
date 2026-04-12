import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }



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