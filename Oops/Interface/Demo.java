package Oops.Interface;

public class Demo {
    public static void main(String args[]){
      
    }

    
}
interface Ridable{
    void ride();
        
    
}
class Car implements Ridable{
    public void ride(){
        System.out.println("your in car");
    }
    
}
class Bike implements Ridable{
    public void ride(){
        System.out.println("your in bike");
    }
}

class Mechanic{
    void check (Ridable c){
        System.out.println("checking");
        c.ride();
    }
}