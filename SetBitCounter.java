public class SetBitCounter {
    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) { // Check last bit
                count++;
            }
            n = n >>> 1; // Unsigned right shift
        }
        return count;
    }
    public static int reverse(int n){
        int sum=0;
        while(n!=0){
           sum=sum+(n%10) ; 
           n=n/10;   
        }
        return sum;
    }

    public static void main(String[] args) {
       System.out.println( reverse(123));


    }
}
