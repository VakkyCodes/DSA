public class dynamicsliding {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int i=0,sum=0,min_length=100000000;
       for(int j=0;j<arr.length;j++){
        sum+=arr[i];
        while(sum>target){
            min_length=Math.min(min_length, j-i+1);
            sum-=arr[i];
            i++;
        }
       }
        System.out.println(min_length);
    }
}
