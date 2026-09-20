public class abstration{
    public static void main(String args[]){
       Reek R1 = new Reek();
       R1.moves();
    }
}
interface ChessPlayer{
    void moves(); // this class is by default abstract and public both
}
class king implements ChessPlayer{
    //In child classes function is by default abstract but not public , so we have to define it
    public void moves(){
        System.out.println("left , right , up and down only by one step");
    }
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("left ,rigth, up ,down , diagonally ");
    }
}
class Reek implements ChessPlayer{
    public void moves(){
        System.out.println("left , rigth");
    }
}
