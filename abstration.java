import java.util.*;
public class abstration{
    public static void main(String args[]){
       Horse h1 = new Horse();
       h1.eats();
       h1.walks();
       Chicken c1 = new Chicken();
       c1.walks();
    }
}
abstract class Animal{
    void eats(){
        System.out.println("every animal eats");
    }
    abstract void walks();
}
class Horse extends Animal{
    void walks(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    void walks(){
        System.out.println("walks on 2 legs");
    }
}