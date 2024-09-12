abstract class base {
    public base(){
        System.out.println("I am a constructor of base");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void Greet();

}
class Derived extends base{
    public void Greet(){
        System.out.println("Good Morning");
    }
}

abstract class Derived2 extends base{
    public void th(){
        System.out.println("I am good");
    }
}
public class abstractClass2 {
    public static void main(String[] args) {
        Derived d =new Derived();
        // Derived2 d2 =new Derived2();  ...> Throws error
    }
    
}
