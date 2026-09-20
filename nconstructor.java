public class nconstructor{
    public static void main(String args[]){
    Student S1= new Student();
    }
}
class University{
    University(){
        System.out.println("many universities");
    }
}
class College extends University{
    College(){
        System.out.println("Colleges under Universities");
    }
}
class Student extends College{
    Student(){
        System.out.println("students are under College and University");
    }
}