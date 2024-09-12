class Base1{

    Base1(){
        System.out.println("I am a constructor");
    }

    Base1(int a){
        System.out.println("I am an overloaded constructor with value of a as "+a);
    }
    
}
class Derived1 extends Base1{
    Derived1(){
        // super(6);

    System.out.println("I am a derived class constructor");
}
Derived1(int x,int y){
    super(x);
    System.out.println("I am an overloaded constructor of derived class with value of x and y as"+x+y);
}
}
class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am constructor of derived class of d1");
    }
    childOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of derived class with y as "+y);
    }
   
}

public class constructorsInInheritance {
    public static void main(String[] args) {
        // Base1 b=new Base1();

        // Derived1 d=new Derived1(4,7);

        childOfDerived cd =new childOfDerived(1,2,3);

        
    }
    
}
