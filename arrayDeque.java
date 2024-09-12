
import java.util.ArrayDeque;
import java.util.Scanner;

public class arrayDeque {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayDeque<Integer> l1=new ArrayDeque<>();
        for(int i=1;i<=5;i++){
            System.out.printf("Enter %d element of array",i);
            l1.add(sc.nextInt());

        }
        // System.out.println(l1);
        // System.out.println(l1.contains(3));
        // System.out.println(l1.pop());
        // l1.clear();
        // System.out.println(!l1.isEmpty());
        l1.addFirst(10);
        l1.addLast(20);
        System.out.println(l1.getLast());
        l1.addLast(3000);
        System.out.println(l1.contains(30));
        System.out.println(l1);

    }
}
