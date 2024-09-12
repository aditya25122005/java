interface bicycle{
    int a=45;
    void applybrake(int decrement);
    void speedUp(int increment);
}

interface blowHorn{
    void blowHornpepepe();
    void  blowHornpopopo();
}
class AvonCycle implements bicycle, blowHorn{
    int speed=7;
    public void applybrake(int decrement){
        System.out.println("Applying brake...");
        speed-=decrement;
    }
    @Override
    public void speedUp(int increment){
        System.out.println("Speeding Up...");
        speed+=increment;
    }
    public void blowHornpepepe(){
        System.out.println("pepepe");
    }
    public void blowHornpopopo(){
        System.out.println("popopo");
    }

}
public class interfaces {
    public static void main(String[] args) {
        AvonCycle ac=new AvonCycle();
        ac.applybrake(2);
        ac.speedUp(5);
        System.out.println(ac.a);
        // ac.a=90;  :::>>Throws error

        ac.blowHornpepepe();
        ac.blowHornpopopo();
        
    }
    
}
