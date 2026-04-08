public class neew {
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        int max=arr[arr.length-1];
       
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                System.out.println(max);
                max=arr[i];
            }
        }
    }
}
