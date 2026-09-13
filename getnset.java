import java.util.*;
public class getnset{
    public static void main(String args[]){
      Pen p1 = new Pen();
      p1.setColor("blue");
      System.out.println(p1.getcolor());
      p1.settip(5);
      System.out.println(p1.gettip());

      p1.setColor("orange");
      System.out.println(p1.getcolor());
    }
}
class Pen{
    private String color;
    private int tip;
    void setColor(String newcolor){
        this.color = newcolor;
    }
    void settip(int newtip){
        this.tip = newtip;
    }
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
}