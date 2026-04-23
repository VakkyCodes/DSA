import java.util.*;
public class test {
public static boolean check(int mat[][]){
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
if(mat[i][j]!=mat[i+1][j+1] && i!=1 && j!=1){
return false;
}
}
}
return true;
}
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
int mat[][]=new int[2][2];
System.out.println("enter the number");
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
mat[i][j]=sc.nextInt();
}
}
int sum=0;
if(check(mat)){
for(int i=0;i<2;i++){
sum+=mat[0][i];
}
}
else{
for(int i=0;i<2;i++){
sum+=2*mat[0][i];
}
}
System.out.println("the solution is: "+sum);

    }
}
