class circle{
    public int radius;

    public circle(int a){
        System.out.println("Running because of super..");
        this.radius=a;
    }
    public circle(){
        System.out.println("default constructor");
    }
    public void print(){
        
        System.out.println("I am a circle");
    }

    public double Area(){
        double a=Math.PI*this.radius*this.radius;
        return a;
    }
 
}

class cylinder extends circle{
    cylinder(int r,int h){
        super(r);
        
        this.height=h;
    }
    public int height;
    public double Volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
    
}

class Rectangle{
    public void print(){
        System.out.println("I am a rectangle");
    }
    public int length;
    public int Breadth;
    public int height;
    

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return Breadth;
    }

    public void setBreadth(int Breadth) {
        this.Breadth = Breadth;
    }

    public int Area(int l, int b){
        System.out.print("The Area is :");
        return l*b;
    }
}

class cuboid extends Rectangle{
    public void out(){
        System.out.println("I am extended cuboid.");
    }

    public int volume(int l,int b,int h){
        System.out.print("The volume is: ");
        return(l*b*h);
    }
}

public class PS10 {
    public static void main(String[] args) {
        circle c= new circle(5);
        System.out.println(c.Area());
        

        cylinder obj =new cylinder(12,4);
        System.out.println(obj.Volume());
        
        Rectangle r=new Rectangle();   
        r.print(); 

        cuboid cb =new cuboid();

        System.out.println(r.Area(5, 5));
        // r.setBreadth(6);
        System.out.println(cb.volume(4,3,2));
        
        






    }
    
}
