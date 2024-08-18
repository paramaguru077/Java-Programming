package Oops.Inheritance;

public class Employee {
    
    public static void main(String[] args) {
        
    }

}

class Employee1{  // base class
  private  String name ;
  private double salary;
  Employee1(String n,double s){
        this.name=n;
        this.salary=s;
    }
   public String getName(){
        return name;
    }
   public void setName(String n){
        this.name=n;
    }
  public  double getSalary(){
        return salary;
    }
   public void setSalary(double s){
        this.salary=s;
    }
   public void raiseSalary(double percent){
        this.salary=salary*(percent/100);
        
    }
    Employee1(){
        name=" ";
        salary=0.0;

    }
}

class Manager extends Employee1{  //derived class
    double bonus;
    Manager(String n,double s,double b){
        super(n,s);  // it call the parent class constructor
        bonus=b;
    }

    void setBonus(double b){
        bonus=b;
    }


 
}
