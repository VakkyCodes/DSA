import java.util.*;

public class gym {
    public static void main(String[] args) {
        int months[] = {12, 9, 6, 3, 1};
        int cost[]   = {12000, 11000, 8000, 5000, 2000};

        int n = 11;

        if(n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int totalCost = 0;

        for(int i = 0; i < months.length; i++) {
            while(n >= months[i]) {
                n -= months[i];
                totalCost += cost[i];
            }
    }
   if(n == 0) {
            System.out.println(totalCost);
        } else {
            System.out.println("Error");
        }
    }
}