import java.util.*;
public class Solution{
    public static void main(String args[]){
        pen p1 = new pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);
        p1.setStyle("aqua blue");     
    }
}
class pen {
    String color;
    int tip;
    String style;
    void setColor(String newcolor){
        color = newcolor;        
    } 
    void settip(int newtip){
        tip = newtip;
    }
    void setStyle(String newStyle){
        style = newStyle;
        System.out.println(style);
    }
}
class BankAccount{
    String name;
    String lname;
    public void setInfo(String na , String lna){
       System.out.print(" hello");
       name = na;
       lname = lna;
        System.out.print(name);
         System.out.print(lname);
    }
}