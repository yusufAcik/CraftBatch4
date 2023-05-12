package day48_OOP_Review.ScrumTeam;

public class Employee extends Person{

    public String jobTitle;

    private double salary;

    private int id;

    public String deparmentName;

    public Employee(String name, int age, char gender, String jobTitle, double salary, int id, String deparmentName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        setSalary(salary);
        setId(id);
        this.deparmentName = deparmentName;
    }

   //  private olan değişkenler için getter ve setter yaptık
  //  public double getSalary() {
  //      return salary;        // maaşın görülmesini istemediğimiz için kapattık
  //  }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("Invalid salary");
        }else {
            this.salary = salary;   // muhasebeci maaşı değiştirebilsin diye açık bıraktık
        }
         }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", deparmentName='" + deparmentName + '\'' +
                '}'+super.toString();
    }
}
