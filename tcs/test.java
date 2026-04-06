public class test {
    public static void test1(){
        int arr[]={10,20,4,45};
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=largest){
                secondlargest=largest;
                largest=arr[i];     
               }
               else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
               }
        }
        System.out.println("this is the largest"+largest+"this is the second largest"+secondlargest);
    }
    
    public static void main(String[] args) {
        test1();
    }
}
