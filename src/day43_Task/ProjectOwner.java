package day43_Task;

public class ProjectOwner extends SoftwareDevelopmentTeam {

    boolean isTechnical;

    public double calculateSalary(){
        return 2000+(workingYear*250)*1.2;
    }

}
