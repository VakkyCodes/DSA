import java.util.HashSet;

public class HASHSETS {
    public boolean Subarray(int a[],int b[]){
         HashSet<Integer>Sets=new HashSet<>();
        for(int n:a){
            Sets.add(n);
        }
        for(int n:b){
            if(!Sets.contains(n)){
           
                return false ;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
       HASHSETS s=new HASHSETS();
       int a[]={1,2,3,4,5};
       int b[]={31,4,5};
       s.Subarray(a,b);
       if (s.Subarray(a, b)) {
           System.out.println("arr2 is a subarray of arr1");
       } else {
           System.out.println("arr2 is not a subarray of arr1");
       }

    }
}
