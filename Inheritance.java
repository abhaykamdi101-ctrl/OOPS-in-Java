public class Inheritance{
    public static void main(String args[]){
    peacock p1 = new peacock();
    p1.breathe();
    p1.fly();
    rabbit r1 = new rabbit();
    r1.eats();
    }
}
class Animal{
    void eats(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
class bird extends Animal {
    void fly(){
        System.out.println("fly");
    }
}
//till above class there is single level inheritance
//now multilevel inheritance

class peacock extends bird{
    void wnf(){
        System.out.println("walk and fly both");
    }
}
//this rabbit class is an example of hirearchical inheritance
class rabbit extends Animal{
    void run(){
        System.out.println("one of the fastest runner");
    }
}