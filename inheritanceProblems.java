class bank{
    private int balance;
    public bank(int balance){
        this.balance=balance;
    }
    public void deposit(int deposit){
        balance+=deposit;
    }
    public void withDraw(int withDraw){
        if(balance>=withDraw){
            balance-=withDraw;
            System.out.println(withDraw+" is withdrawn from bank account");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    public int getBalance(){
        return balance;
    }
}

class savingAccount extends bank{
    public savingAccount(int balance){
        super(balance);
    }
    public void withDraw(int withDraw){
        if(getBalance()-withDraw>100){
            super.withDraw(withDraw);
            System.out.println(withDraw+" amount is withdrawn successfully");
        }
        else{
            System.out.println("not sufficient");
        }
    }
}
class Animal{
    public void move(){
        System.out.println("Animals are moving");
    }
}
class cheetah extends Animal{
    @Override
    public void move(){
        System.out.println("Cheetah is running");
    }
}
class person{
    private String Firstname;
    private String Lastname;

    public person(String Firstname,String Lastname){
        this.Firstname=Firstname;
        this.Lastname=Lastname;
    }
    public String getFirstName(){
        return Firstname;
    }
    public String getLastName(){
        return Lastname;
    }
}
class employee extends person{
    private String JobTitle;
    public employee(String Firstname,String Lastname,String JobTitle){
        super(Firstname, Lastname);
        this.JobTitle=JobTitle;
    }
    // public String getJobTitle(){
    //     return JobTitle;
    // }
    @Override
    public String getLastName(){
        return super.getLastName()+JobTitle;

    }
    
}
class shape{
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
}
class circle extends shape{
    private double radius;
    public circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}


public class inheritanceProblems{
    public static void main(String[] args) {
        // bank b =new bank(5000);
        // savingAccount s=new savingAccount(400);
        // s.withDraw(200);
        // b.deposit(300);
        // System.out.println(b.getBalance());
        // Animal a=new Animal();
        // cheetah ch= new cheetah();
        // ch.move();
        // a.move();
        // person p =new person("Aditya","Maheshwari");
        // employee e= new employee("Aditya", "Maheshwari","Java Developer");

        // System.out.println(e.getLastName());
        // System.out.println(p.getLastName());

        circle c=new circle(5);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
    
}
