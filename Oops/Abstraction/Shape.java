package Oops.Abstraction;

public class Shape {
    public static void main(String args[]){
        Shapes[] shape= new Shapes[3];
        shape[0] = new Square(3)
        shape[1] = new Triangle(2,4);
        shape[2] = new Square(8);
        for(Shapes s:shape){
            s.area();
            
        }

    

    }
}
abstract class Shapes{
     abstract void area();   
}

class Square extends Shapes{
    private int length;
    Square(int l){
        this.length=l;
    }

    void area(){
        System.out.println(length*length);
       
    }
    void test(){
        System.out.println(3);
    }
  
}
class Triangle extends Shapes{
    private int length;
    private int breath;
    Triangle(int l,int b){
        this.length=l;
        this.breath=b;
    }

    void area(){
        System.out.println((breath*length)/2);
       
    }
  
}