package day43_Task;

public class Main {

    public static void main(String[] args) {
        SoftwareDevelopmentTeam team1 = new SoftwareDevelopmentTeam();
        team1.domain="123000afafa";
        team1.numberOfPersonel=12;

        Tester tester1 = new Tester();
        tester1.name="Ali";
        tester1.workingYear=3;

        System.out.println("tester1.calculateSalary() = " + tester1.calculateSalary());
    }
}
