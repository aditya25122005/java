import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();

        l1.add(10);
        l1.add(20);
        l1.add(0,30);
        l1.add(2,33);

        l2.add(1);
        l2.add(2);
        l2.add(3);

        l2.addAll(l1);
        System.out.println(l2.contains(10));
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        l2.clear();
        System.out.println(l2.isEmpty());

        System.out.println(l1);
        System.out.println(l2);


    }
}

