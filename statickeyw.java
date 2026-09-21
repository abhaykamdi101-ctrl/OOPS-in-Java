import java.util.*;
// static key word in java is used to share te same variable or method of a given class.
public class statickeyw{
    public static void main(String args[]){
      Student S1 = new Student();
      S1.Sname = "JVV";
      System.out.println(S1.Sname);

      Student s2 = new Student();
      System.out.println(s2.Sname);

      Student S3 = new Student();
      S3.Sname = "JVVU";
      System.out.println(S3.Sname);

      Student s4 = new Student();
      System.out.println(s4.Sname);
    }
}
class Student{
    int roll;
    String name;
    static String Sname;
    void setschool(String Sname){
        this.Sname=Sname;
    }
    String getSchool(){
        return this.Sname;
    }
}