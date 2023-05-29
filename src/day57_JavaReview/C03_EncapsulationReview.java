package day57_JavaReview;


class Employee {
private  String name;
private double salary;
private char gender;

    public Employee(String name, double salary, char gender) {
        setName(name);
        setSalary(salary);
        setGender(gender);
    }  // constructoru setlere göre dizayn etmezsek setter lardaki kurallar uygulanmaz


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            throw new RuntimeException("Salary can not be set to zero or a negative number");
        }
        if(salary<=10000){
            throw new RuntimeException("Insufficient Salary");
        }
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M'|| gender=='m'|| gender=='F'|| gender=='f')){
            throw new RuntimeException("invalid gender");
        }
        this.gender = gender;
    }

    public String getName() {
        if(name==null){
            throw new RuntimeException("Name has not been set!");
        }
        return name;
    }

    public void setName(String name) {
        if(name==null){
            throw new RuntimeException("Name can not be set to NULL!");
        }
        if(name.isEmpty()){
            throw new RuntimeException("Name can not be empty!");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
public class C03_EncapsulationReview {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Serka",27000,'m'); // default constructor
       // System.out.println("employee1.name = " + employee1.name);
        // name private olduğu için hata verir
        employee1.setName("Serkan");
        System.out.println("employee1.getName() = " + employee1.getName());

        Employee employee2 = new Employee("Ali",50000,'M');
        employee2.setSalary(50000);
        employee2.setGender('m');
        System.out.println(employee2);


    }
}
