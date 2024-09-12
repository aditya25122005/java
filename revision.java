// class employee{
//     private int salary;
//     private String name;

//     public void setName(String s){
//         name=s;
//     }

//     public String getName(){
//         return name;

//     }

//     public int getSalary(){
//         return salary;
//     }
// }
// class cellphone{
//     public void ring(){
//         System.out.println("Ringing...");
//     }

//     public void vibrate(){
//         System.out.println("Vibrating...");
//     }
// }
// class square{
//     int side;

//     public int getSide() {
//         return side;
//     }

//     public void setSide(int side) {
//         this.side = side;
//     }

//     public void area(int side){
//         System.out.println("Area of square is :"+side*side);
//     }
//     public void perimeter(int side){
//         System.out.println("perimeter of square is :"+4*side);
//     }

// }
class cylinder{
    private int height;
    private int radius;

    public cylinder(){
        height=3;
        radius=4;
    }

    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }

    public int getradius(){
        return radius;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*height;

    }

    public double volume(){
        return Math.PI*radius*radius*height;

    }
}




public class revision {
    public static void main(String[] args) {
        // employee abc=new employee();
        // abc.setName("Aditya");
        // System.out.println(abc.getName());

        // cellphone lava =new cellphone();
        // lava.ring();
        // lava.vibrate();

        // square one =new square();
        // one.area(4);
        // one.perimeter(5);

        cylinder one =new cylinder();
        // one.setHeight(45);
        // one.setRadius(49);
    

        System.out.println(one.getHeight());
        System.out.println(one.getradius());

        System.out.println(one.surfaceArea());
        System.out.println(one.volume());


        
        
    }
    
}
