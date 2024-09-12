



class Animal{
    public void makeSound(){
        System.out.println("We d bark");
    }
}
class cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Yes Cat too bark!");
    }
}
class vehicle{
    public void drive(){
        System.out.println("Repairing a vehicle");
    }
}
class car extends vehicle{
    @Override
    public void drive(){

        System.out.println("Repairing a car!");
    }
}
class shape{
    public int getArea(){
        return 0;
    }
}
class rectangle extends shape{
    private int length;
    private int breadth;
    public rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;

    }

    @Override
    public int getArea(){
        
        return length*breadth;
    }
}
class employee{
    private int salary;
    public void work(){
        System.out.println("Working in web department");
    }
    public employee(int salary){
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }
    
}
// class HRmanager extends employee{
   
//     @Override
//     public void work(){
//         System.out.println("New work");
//     }
//     public void salary(){
//         System.out.println("New Salary");
//     }
//     public String addEmployee(String s){
//         return s;

//     }
//     public void employee(int s){
//         System.out.println("Yaha kya likhu");
//     }
// }
public class practice {
   public static void main(String[] args) {
    // cat c= new cat();
    // c.makeSound();
    // vehicle v=new vehicle();
    // car c= new car();
    // c.drive();
    // v.drive();
    // rectangle re=new rectangle(4,5);
    // System.out.println(re.getArea());
    employee e=new employee(3000);
    // HRmanager h=new HRmanager();
    System.out.println(e.getSalary());
    // System.out.println(h.addEmployee("ADITYA"));
    e.work();
   }

    
}
