package day48_OOP_Review.ScrumTeam;

public class Tester extends Employee implements DevTeam{

    public String programmingLanguage;

    public Tester(String name, int age, char gender,  double salary, int id, String deparmentName, String programmingLanguage) {
        super(name, age, gender, "Tester", salary, id, deparmentName);
        this.programmingLanguage = programmingLanguage;
    }

    public void coding(){
        System.out.println(jobTitle+" "+name+" is coding in testing framework using"+programmingLanguage);
    }

    public void createTicket(){
        System.out.println(jobTitle+" "+name+" is finding bugs");
    }
}
