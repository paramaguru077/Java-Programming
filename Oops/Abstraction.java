package Oops;

public class Abstraction {
    public static void main(String[] args) {
        Guru g1 = new Guru();
       Siva s1 = new Siva();
       Megan m1 = new Megan();
       Member[] member = new Member[3];
       member[0]  = new Guru();
       member[1] = new Megan();
       member[2]= new Siva();
       for(Member m : member){
        m.welcomeMessage();
       }
        
    }
}

abstract class Member{
   // private String name;
    abstract void welcomeMessage();
}
class Guru extends Member{
    void welcomeMessage(){
        System.out.println("hi guru");
    }
}
class Siva extends Member{
    void welcomeMessage(){
        System.out.println("hi siva");
    }
}
class Megan extends Member{
    void welcomeMessage(){
        System.out.println("hi Megam");
    }
}