public class test {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i=2+i){
            int sum=arr[i]+arr[i+1];
            System.out.println(sum);
        }
    }
}
