public class Longest{
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 1, 1, 1, 1};
        int k = 3,i=0,sum=0,max=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            while(sum==k){
                max=Math.max(max,j-i+1);
                sum-=arr[i];
                i++; 
            }

        }
        System.out.println(max); 
    }
}