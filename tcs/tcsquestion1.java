import java.util.*;

public class tcsquestion1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("enter the numbers of element");
        int count = sc.nextInt();
        System.out.println("enter the element");
        for (int i = 0; i < count; i++) {
            map.put(sc.nextInt(), sc.nextInt());
        }
        System.out.println("enter the count ofid ");
        int add = 0;
        int coutn = sc.nextInt();
        System.out.println("enter the id to search");
        for (int j = 0; j < coutn; j++) {
            int cid = sc.nextInt();
                if (map.containsKey(cid)) {
                    if (map.get(cid) == 2) {
                        add += 5;
                    } else if (map.get(cid) == 1) {
                        add += 2;
                    } else {
                        add += 1;
                    }
                }
            
        }
        System.out.println("the add is " + add);
    }
}