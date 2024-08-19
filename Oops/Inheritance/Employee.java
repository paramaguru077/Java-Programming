package Oops.Inheritance;

public class Employee {
    
    public static void main(String[] args) {
        
     // Manager m1 = new Manager("guru",80000,2000,"07/03/2024");
     // m1.Display();
     // Employee1 e1 = new Manager("siva",50000,3000,"09/50/2000");

      Employee1[] employees = new Employee1[3];
     employees[0] = new Employee1();
     employees[1]= new Manager("guru",2000,80000,"7/03/2004");
     employees[2]= new Employee1();


    Employee1 obj1 = new Manager("siva",70000,8000,"29303");
    Manager m1 = (Manager) obj1;
    
        
    for(Employee1 e:employees){
        e.Display(); // data binding
    } 

}
}

class Employee1{  // base class
   private  String name ;
  private double salary;
  private String dateOfJoining;
  Employee1(String n,double s,String d){
        this.name=n;
        this.salary=s;
        this.dateOfJoining=d;
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
    public void Display(){
        System.out.println(name + salary + dateOfJoining);
    }
    Employee1(){
        name=" ";
        salary=0.0;
        dateOfJoining=" ";

    }
}

class Manager extends Employee1{  //derived class
    double bonus;
    Manager(String n,double s,double b, String d){
        super(n,s,d);  // it call the parent class constructor
        bonus=b;
    }

   public void setBonus(double b){
        bonus=b;
    }

    public double getSalary(){
        return super.getSalary()+bonus;
    }
    public void Display(){
        super.Display();
        System.out.println(bonus);
    }


 
}
