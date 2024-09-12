
class Animal{
    public String Behaviour;

    public String getBahaviour(){
        return Behaviour;
    }

    public void setBehaviour(String Behaviour){
        this.Behaviour=Behaviour;

    }
}

class Lion extends Animal{
    public String speciality;

    public String getSpeciality() {
        System.out.println("Getting speciality for the King");
        return speciality;
    }

    public void setSpeciality(String speciality) {
        System.out.println("Setting speciality fo the king");
        this.speciality = speciality;
    }

}
public class AnimalLionInheritance {
    public static void main(String[] args) {
        
    
    Animal a =new Animal();

    a.setBehaviour("Hungry and dangerous");
    System.out.println(a.getBahaviour());
    

    Lion l=new Lion();
    l.setSpeciality("I am King");
    System.out.println(l.getBahaviour());
    System.out.println(l.getSpeciality());
    
    

}
}


    

