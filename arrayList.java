import java.util.*;
public class arrayList {
public static void main(String [] args){
    ArrayList<Integer> l1=new ArrayList<>();
    ArrayList<Integer> l2=new ArrayList<>();
    l1.add(10);
    l1.add(20);
    l1.add(30);

    l2.add(1);
    l2.add(2);
    l2.add(3);
    l1.addFirst(300);
    l1.addLast(200);
    System.out.println(l2.size());
    System.out.println(l1.get(0));

    System.out.println(l2.indexOf(3));
    // l1.clear();
    System.out.println(l1.isEmpty());


    l2.addAll(l1);
    l2.remove(2);
    System.out.println(l1);
    System.out.println(l2);

    l2.add(3,400);
    System.out.println(l2);
    System.out.println(l2.contains(1));
    



}

    
}
