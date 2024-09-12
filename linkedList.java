import java.util.*;
public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();

        l1.add(0,10);
        l1.add(1,20);
        l1.add(2,30);

        // System.out.println(l1.pop());
        l1.poll();
        System.out.println(l1);
        l1.offerFirst(200);
        l1.offerLast(400);
        l1.addLast(767);
        System.out.println(l1.size());
        System.out.println(l1);



    }
    
}
