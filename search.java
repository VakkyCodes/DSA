public class search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int low=0;
        int high=arr.length-1;
   
        int key=2;
        //1 2 3 4 5 
        while(low<=high){
                 int mid=(low+high)/2;
        if (arr[mid]==key){
            System.out.println("this is what we were expecting");
            return;
        }
        else if (arr[mid]>key){
            high=mid-1;
            
        }
        else{
            low=mid+1;

        }
    }
    }
}
