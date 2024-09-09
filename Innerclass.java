public class Innerclass {
    public static void main(String[] args){
        Outer a = new Outer();
        a.display();
        Outer.Inner b = a.new Inner();
        b.display();

    }
}
class Outer{
    void display(){
        System.out.println("outer");
    }
    class Inner{
        void display(){
            System.out.println("inner");
        }
    }
}