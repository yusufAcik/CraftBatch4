package day43_Task;

public class HumanResources extends Person{

    String areaResponsibility;

    public double calculateSalary(){
        return 2000+(workingYear*250)*1.05;
    }
}
