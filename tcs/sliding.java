public class sliding {
    public static void main(String[] args) {
        int arr[]={2, 1, 5, 1, 3, 2};
        int k=3;
        int window=0;
        for(int i=0;i<k;i++){
            window+=arr[i];
        }
        int max=window;
        for(int i=k;i<arr.length;i++){
            window+=arr[i];
            window-=arr[i-k];
           max= Math.max(window, max);
        }
        System.out.println(max);
      }
}
