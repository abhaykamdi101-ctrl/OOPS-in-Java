import java.util.*;
public class constructors{
    public static void main(String args[]){
       student s1 = new student();
       student s2 = new student(124);
       student s3 = new student("abhay");
       student s4 = new student("akkk",404);
    //s1.names("abhay");
    }
}
class student{
    int rroll;
    String sname;
    student(){
        System.out.println("constructor is called");
    }
    student(int roll){
        this.rroll = roll;
        System.out.println(rroll);
    }
    student(String name){
        this.sname = name;
        System.out.println(sname);
    }
    student(String name , int roll){
        System.out.println(name + roll);
    }
    void names(String name){
        sname = name;
        System.out.println(sname);
    }
}