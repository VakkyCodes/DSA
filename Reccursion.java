public class Reccursion {
    public static  void  recur(int n,int i,int sum){
       if(i==n){
        sum+=i;
        System.out.println(sum);
        return;
       }
        sum+=i;
        recur(n, i+1, sum);
    }
    static int Fact(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Fact(n - 1);
    }
    public static void main(String[] args) {
   recur(5,0,0);
    }
}
