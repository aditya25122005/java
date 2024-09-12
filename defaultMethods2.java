interface camera{
    void takeSanp();
    void takevideo();
    default void record4kvideo(){
        
        System.out.println("recording in 4k...");
    }
    private void greet(){
        System.out.println("Hi God Morning");
    }
}

interface wifi{
    String [] Networks();
    void connectNetwork(String Network);
}

class Cellphone{
    public void MakeCall(int number){
        System.out.println("Making Call to "+number);
    }
}
class Smartphone extends Cellphone implements camera,wifi{
    public void record4kvideo(){
        
        System.out.println("recording in 2k");
    }
    @Override
    public void takeSanp(){
        System.out.println("Taking Snap in smartphone");
    }
    @Override
    public void takevideo(){
        System.out.println("taking video");
    }
    @Override
    public String[] Networks(){
        String[] networkslist={"First","Second","Third"};
        return networkslist;
    }
    @Override
    public void connectNetwork(String Network){
        
        System.out.println("Connecting to "+Network);
    }
    @Override
    public void MakeCall(int number){
        
        System.out.println("Calling to "+number);
    }
}
public class defaultMethods2 {
    public static void main(String[] args) {

        camera c= new Smartphone();
        c.takeSanp();
        c.takevideo();
        c.record4kvideo();
        wifi w= new Smartphone();
        w.connectNetwork("Mohan");

        Smartphone ph =new Smartphone(); 
        ph.MakeCall(8998);
        ph.takeSanp();

    
        // Smartphone s=new Smartphone();
        
        // s.record4kvideo();
        // s.MakeCall(78966);
        // s.takeSanp();
        // s.takevideo();
        // s.connectNetwork("Aditya 6g");
        // s.Networks();
        // String [] ar=s.Networks();
        // for(String ele:ar){
        //     System.out.println(ele);
        // }
        
    }
    
}
