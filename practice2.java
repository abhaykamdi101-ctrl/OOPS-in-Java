 //simple calculator using OOPS
import java.util.*;
class Complex{
   int sum(int a , int b){
    return a+b;
   }
   int Diffrence(int a , int b){
    return a-b;
   }
   int product(int a , int b){
    return a*b;
   }
   float Division(float a , float b){
    return (float)a/b;
   }
}
public class practice2{
    public static void main(String args[]){
        Complex c1 = new Complex();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("sum is : " + c1.sum(x,y));
        System.out.println("sub is : " + c1.Diffrence(x,y));
        System.out.println("mul is : " + c1.product(x,y));
        System.out.println("Division : " + c1.Division((float) 2.5 , (float) 2.5));
    }
}