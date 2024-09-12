

class phone{
    public void ring(){
        System.out.println("Ringing in phone");
    }

    public void music(){
        System.out.println("Playing Music...");
    }
}

class smartPhone extends phone{
    public void swagat(){
        System.out.println("AAPKA SWAGAT HAI");
    }
    @Override
    public void music(){
        System.out.println("Playing in Smartphone...");
    }
    public String[] Opennetwork() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Opennetwork'");
    }
}
public class dynamicmethodDispatch {
    public static void main(String[] args) {
        phone ph =new smartPhone();   //Allowed
        ph.music();
        ph.ring();
    }
    
}
