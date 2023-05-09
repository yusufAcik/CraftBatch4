package day43_Task;

public class Developer extends  SoftwareDevelopmentTeam{

    String softWareLanguage;

    public double  calculateSalary(){
        return 2000+(workingYear*250)*1.1;
    }
}
