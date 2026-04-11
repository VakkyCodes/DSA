
import java.util.*;

public class neew{
    public static void prime(){
   int n=3;
    for(int i=2;i<Math.sqrt(n);i++){
      if(n%i==0){
        System.out.println("it is not prime");
      }
      else System.out.println("it is prime");
    }

      
}


    public static void main(String[]args){
         int arr[]={1,2,1,3,2,5,3,7,5,11};
      prime();

    }
}