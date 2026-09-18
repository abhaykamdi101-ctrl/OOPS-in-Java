import java.util.*;
public class polymorphism2{
    public static void main(String args[]){
        cpp c = new cpp();
        c.inheritance();
    }
}
class java{
   void inheritance(){
    System.out.println("supports single level , multilevel , hirearchical and hybrid");
   }
}
class cpp extends java{
    void inheritance(){
    System.out.println("supports every type of inheritance including multiple inheritance");
    }
}