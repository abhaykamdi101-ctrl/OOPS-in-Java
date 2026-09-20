public class minheritance{
    public static void main(String args[]){
        Son s1 = new Son();
        s1.showFather();
        s1.showMother();
        s1.myself();
}
}
interface Father{
    void showFather();
}
interface Mother{
    void showMother();
}
class Son implements Father , Mother{
    public void showFather(){
        System.out.print("this is my father");
    }
    public void showMother(){
        System.out.print(" this is my mother");
    }
    void myself(){
        System.out.print(" And i am their Son");
    }
}