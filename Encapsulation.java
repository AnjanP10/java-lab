class Employee {
    private String name;
    private int age;
    private double salary;
    private double Total;

    Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void Increase () {
        Total = salary + 0.1 * salary;
    }
    
    void Display(){
        System.out.println("Name " + name + " age " + age + " Increased Salary by 10% is " + Total);
    }
}


public class Encapsulation {
    public static void main(String args[]){
        Employee Emp1 = new Employee("Anjan", 22, 250000);
        Employee Emp2 = new Employee("kalu", 35, 1500);

        Emp1.Increase();
        Emp2.Increase();
        Emp1.Display();
        Emp2.Display();


    }
}