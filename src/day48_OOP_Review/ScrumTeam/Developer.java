package day48_OOP_Review.ScrumTeam;

public class Developer extends Employee implements DevTeam{

    public String programmingLanguage;

    public Developer(String name, int age, char gender,  double salary, int id, String deparmentName, String programmingLanguage) {
        super(name, age, gender, "Developer", salary, id, deparmentName);
        this.programmingLanguage = programmingLanguage;
    }

    public void fixBug (){
        System.out.println(jobTitle+" "+name+" is fixing bugs");
    }
    public void coding(){
        System.out.println(jobTitle+" "+name+" is programming"+programmingLanguage);
    } // devTeam interface inin abstract metodu





    // job title ve name i inheritance sayesinde burada alabiliyoruz.

}
