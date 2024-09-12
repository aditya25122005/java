
abstract class Pen{
    public abstract void write();
    public abstract void refill();
    
}
class fountainpen extends Pen{
    public void write(){
        System.out.println("Write");
    }
    public void refill(){
        System.out.println("refill");

    }
    public void changeNib(){
        System.out.println("changing the nib");
    }
}


interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Animals Started Jumping");
    }

    public void bite(){
        System.out.println("Started biting");
    }

}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("I can speak");
    }
    public void eat(){
        System.out.println("I eat vegetables");
    }

    public void sleep(){
        System.out.println("Animals do sleep in night");
    }
    public void jump(){
        System.out.println("humans jump occasionally");
    }
}

abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();

}
class smartPhone extends telephone{
    public void ring(){
        System.out.println("Started ringing...");
    }
    public void lift(){
        System.out.println("Started lifting...");
    }
    public void disconnect(){
        System.out.println("Disconnecting...");
    }

    public void showoff(){
        System.out.println("i am smarter than telephone.");
    }

}
interface TVremote{
    void next();
    void previous();
}
interface smartTVremote extends TVremote{
    void youtube();
    void instagram();
}
class TV implements TVremote,smartTVremote{
    public void next(){
        System.out.println("Next Channel");
    }
    public void previous(){
        System.out.println("previous channel");
    }

    public void youtube(){
        System.out.println("Turnng on youtube");
    }

    public void instagram(){
        System.out.println("Opening instagram");
    }
}

public class PS11 {
    public static void main(String[] args) {
        Monkey m1=new Human();
        m1.bite();
        m1.jump();

        BasicAnimal abhay =new Human();
        // abhay.speak();        error
        abhay.eat();
        abhay.sleep();



        // telephone t= new smartPhone();
        
        // smartPhone s =new smartPhone();
        // s.showoff();
        // s.disconnect();
        // s.lift();


        // fountainpen fp =new fountainpen();
        // fp.changeNib();
        // fp.refill();
        // Human hm=new Human();
        // hm.sleep();
        // hm.eat();
        // Monkey all =new Monkey();
        // all.jump();
        TVremote old =new TV();
        old.next();
        old.previous();
        smartTVremote n =new TV();
        n.instagram();
        n.youtube();

      
        
    }
    
}
