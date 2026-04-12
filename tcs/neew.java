import java.util.*;
public class neew{
public static void ne(){
    int months[]={1,3,6,9,12};
    int price[]={2000,5000,8000,12000,15000};
    int n=7;
    int finalprice=0;
    
     for(int i = 0; i < months.length; i++) {
        if(months[i] == n) {
            System.out.println(price[i]);
            return;
        }
    }
    
    for(int i=0;i<price.length;i++){
        for(int j=0;j<price.length;j++){
            if(months[i]+months[j]==n){
                finalprice=price[i]+price[j];
                System.out.println(finalprice);
                return;
            }
        }
    }}


    public static void main(String[]args){
         ne();

    }
}