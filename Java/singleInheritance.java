class Employee{
    int salary= 50000;
}

class Engineer extends Employee{
    int benefits = 10000;
}

public class singleInheritance {
    public static void main(String args[]){
        Engineer E1 = new Engineer();
        System.out.println("Salary: " + E1.salary + " Benefits: " + E1.benefits);
    }
}
