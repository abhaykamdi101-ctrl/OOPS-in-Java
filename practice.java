public class practice{
    public static void main(String args[]){
    manager m = new manager();
    m.Ename("don");
    m.bonus = 555;
    m.salary = 1000;
    m.calculateSalary();

    developer d = new developer() ;
    d.salary = 44444;
    d.projectBonus = 10000;
    d.calculateSalary();
    }
}
class Employee{
    String name;
    int salary;
    void Ename(String name){
          this.name=name;
          System.out.println(name);
    }
    void Esalary(int salary){
        this.salary=salary;
        System.out.println(salary);
    }
    void calculateSalary(){
        this.salary = salary;
        System.out.println(salary);
    }
}
class manager extends Employee{
    int bonus;
    void bonus(int bonus){
        this.bonus = bonus;
        System.out.println(bonus);
    }
    void calculateSalary(){
        this.salary = salary;
        this.bonus = bonus;
        System.out.println("total in hand salary to the manager " + (salary + bonus));
    }
}
class developer extends Employee {
    int projectBonus;
    void projectBonus(int projectBonus){
       this.projectBonus = projectBonus;
    System.out.println("this is project bonus that a developer gets" + projectBonus);
    }
    void calculateSalary(){
        this.salary = salary;
        this.projectBonus = projectBonus;
        System.out.println("total ion hand to the manager " + (salary +projectBonus));
    }
}