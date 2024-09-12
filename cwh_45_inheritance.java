class base{
    public int x;
    public void printMe(){
        System.out.println("I am a constructor");
    }

    public int getX(){
        return x;
    }

    public void setx(int x){
        System.out.println("I am in base and setting x now");
        
        this.x=x;
    }
}
class Derive extends base{
    int y;
     public int getY(){
        return y;
    }
     public void setY(int y){
        this.y=y;
     }
}
class cwh_45_inheritance{
    public static void main(String [] args){
        base b= new base();
        b.setx(6);
        System.out.println(b.getX());


        Derive D= new Derive();

        D.setx(78);
        System.out.println(D.getX());

        D.setY(44);
        System.out.println("Y setted to "+D.getY());


    }
}