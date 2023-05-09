package day43_Task;

public class Person {

    String name;
    String surname;
    int id;
    double salary;
    String areatoId;

    int workingYear;

    public double calculateSalary(){
        return 2000+(workingYear*250);
    }
}
