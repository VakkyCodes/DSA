import java.util.ArrayList;
import java.util.List;

public class Classic{
//Prime
    public Boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public void countPrimes(int n){
        int count=0;
        for(int i=0;i<=n;i++){
            if(isPrime(i)) {
               count =count+1;
            };
        }
        System.out.println(count);
    }   
    public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: " + first + ", " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}

    //Factorial
    public static int  Factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
             fact=fact*i;
        }
       return fact;
    } 
    public static void TrailiingFactorial(int n){
        int fact=1;
        int count=0;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("fact is "+fact);
        while(fact!=0){
            if(fact%10==0){
                count++;
            }
            else{
                break ;
            }
            fact=fact/10;
        }
        System.out.println("fact is "+fact+" count is "+count); 
    }
    public static Boolean Armstrong(int n){
        int count =0;
        int temp=n;
        while(temp!=0){
            count ++;
            temp=temp/10;
        }
        int arm=0;
        temp=n;
        while(temp!=0){
            int digit=temp%10;
            arm+=Math.pow(digit, count);
            temp=temp/10;
        }
        if(n==arm){
            return true;
        }
        return false;
    }
    public static void Strong(int n){
       int temp=n;
       int strong=0;
       while(temp!=0){
        int digit=temp%10;
        strong+=Factorial(digit);

        temp=temp/10;
       }
    }
    static int sumOfDigits(int n) {
    int sum = 0;
    while (n != 0) {
        sum += n % 10;
        n /= 10;
    }
    int total=0;
    while(sum!=0){
         total += sum % 10;
         sum/=10;

    }
    int temp=total;
    int count=0;
    //count digit
    while(temp!=0){
        count ++;
        temp=temp/10;
    }
    if(count>1){
         int last=0;
    while(total!=0){
         last += total % 10;
         total/=10;

    }
    return last;
    

    }
    return total;
}
static int SubAddMul(int n) {
    int sum = 0;
    int temp=n;
    while (temp != 0) {
        sum += temp % 10;
        temp/= 10;
    }
     temp=n;
      int mul = 1;
    while (temp != 0) {
        mul *= temp % 10;
        temp /= 10;
    }
    int result=mul-sum;

return result;
}    
static int fibonacci(int n){
    int sum=0;
    for(int i=1;i<=4;i++){
        sum=i;
        System.out.println(i+(i-1));
        
    }
    return 0;
}
static int gcd(int a,int b){
  while(b!=0){
    int temp=b;
    b=a%b;
    a=temp;

  }

    return a;
}
// static int lcmgd(int a,int b){
//     ArrayList<Integer>list=new ArrayList<>();
//     int lcm=a*b/gcd(a, b);
//     list.add(lcm);
//     list.add(gcd(a, b));
//     return list;
// }
    public static void main(String[] args) {
       
}}