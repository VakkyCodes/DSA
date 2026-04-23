import java.util.*;
public class tcsquestion2 {
public static boolean check(int mat[][],int n){
    
for(int i=0;i<n-1;i++){
for(int j=0;j<n-1;j++){
if(mat[i][j]!=mat[i+1][j+1]){
return false;
}
}
}
return true;
}
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int n=4;
int mat[][]=new int[n][n];
System.out.println("enter the number");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
mat[i][j]=sc.nextInt();
}
}
int sum=0;
if(check(mat, n)){
for(int i=0;i<n;i++){
sum+=mat[0][i];
}
}
else{
for(int i=0;i<n;i++){
sum+=2*mat[0][i];
}
}
System.out.println("the solution is: "+sum);

    }
}
