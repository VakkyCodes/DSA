import java.util.HashMap;

public class neew{
    public static void ana(){
     int arr[]={1,2,1,3,2};
     HashMap<Integer,Integer>Map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
      Map.put(arr[i],Map.getOrDefault(arr[i],0 )+1);
    }
    System.out.println(Map);
     
    }
    public static void main(String[]args){
      ana();

    }
}