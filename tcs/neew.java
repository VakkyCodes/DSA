import java.util.HashMap;
import java.util.Scanner;

public class neew{
    public static void ana(){
      Scanner sc=new Scanner(System.in);
      System.err.println("enter the size of array");
      int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     } 
     if(arr.length==0){
      return;
     }
     for(int i=0;i<n;i++){
      int count=1;
      for(int j=i+1;j<n;j++){
        if(arr[i]==arr[j]){
          count ++;
        }
      if(count%2!=0){
      System.out.println("this is the imposter"+arr[j]);
      return;
     }
     } 
     
     } 
}
public static void opt(){
  int arr[]={1,2,3,3,2};
  HashMap<Integer,Integer>map=new HashMap<>();
  for(int i=0;i<arr.length;i++){
    map.put(arr[i], map.getOrDefault(arr[i],1)+1);
  }
  for(int i=0;i<map.size();i++){
    System.out.println("hi");
  }
}
    public static void main(String[]args){
      opt();

    }
}