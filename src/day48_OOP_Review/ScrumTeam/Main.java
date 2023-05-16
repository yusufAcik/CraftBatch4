package day48_OOP_Review.ScrumTeam;

public class Main {

    public static void main(String[] args) {

        Person person=new Person("Ahmet",30,'m');
        System.out.println(person);
        Employee employee = new Employee("Ahmet",30,'M',"Developer",3200,123456,"IT");
        System.out.println(employee.age);
        System.out.println(employee.deparmentName);
        //  employee.salary;  salary private olduğu için buradan göremeyiz
        // getter setter ı olmadığı için ulaşamayız (encapsulation)

        Employee employee1 = new Employee("Ayşe",32,'F',"Developer",3300,123457,"IT");

        employee1.work();
        employee1.eat("Cake");

    }
}
