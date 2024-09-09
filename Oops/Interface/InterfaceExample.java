package Oops.Interface;

public class InterfaceExample {
    public static void main(String[] args) {
        Namable n1 = new Guru();
            n1.Name();
        
    }
    
}

interface Namable {
    int NUM=0;
    void Name();
    default void  Display(){
        System.out.println("No name");
    }
}
class Guru implements Namable{
   public void Name(){
        System.out.println("Hi guru");
    }
}
class Siva implements Namable{
    public void Name(){
         System.out.println("Hi siva");
     }
 }
