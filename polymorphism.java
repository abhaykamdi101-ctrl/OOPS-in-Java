import java.util.*;
public class polymorphism{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float x = sc.nextFloat();
        float y = sc.nextFloat();
        calculator c1 = new calculator();
        System.out.println("addition of floating values" + c1.sum(x,y));
        System.out.println("addition of int " +c1.sum(a,b,c));      
    }
}
class calculator{
    int sum(int a , int b ){
        return a+b;
    }
    float sum(float a , float b){
        return (float)a+b;
    }
    int sum(int a , int b ,int c){
        return a+b+c;
    }

}