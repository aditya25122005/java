class Ekclass{
    int a;

    public Ekclass(int a) {
        System.out.println("Base class constructor");
        this.a=a;
    }

    public int getA(){
        return a;
    }

    
    public int returnone(){
        return 1;

    }
}

class Doclass extends Ekclass{

    Doclass(int c){
        super(c);
        System.out.println("I am a constructor");

    }
}
public class thisAndSuper {
    public static void main(String[] args) {
        Ekclass e=new Ekclass(55);
        Doclass d=new Doclass(5);
        System.out.println(d.getA());
        
    }
    
}
