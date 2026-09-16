import java.util.*;
public class constructors2{
    public static void main(String args[]){
       student s1 = new student();
       s1.name = "abhay";
       s1.roll = 5;
       System.out.println(s1.name + s1.roll);
       s1.marks[0] = 98;
       s1.marks[1] = 99;
       s1.marks[2] = 100;

       student s2 = new student(s1);
       s1.marks[1] = 90;
       for(int i = 0 ; i < 3 ; i++){
        System.out.println(s2.marks[i]);
       }
    }
}
class student{
    int roll;
    String name;
    int marks[];

    student(student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        //shallow copy
        //this.marks = s1.marks
        //deep copy
        for(int i = 0 ; i < marks.length ; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    student(){
        marks = new int[3];
        System.out.println("constructor is called");
    }
    student(int roll){
        marks = new int[3];
        this.roll = roll;
        System.out.println(roll);
    }
    student(String name){
        marks = new int[3];
        this.name = name;
    }
}