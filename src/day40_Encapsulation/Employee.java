package day40_Encapsulation;

public class Employee {

    private String name;
    private char gender;

    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary){
        setName(name);
       // this.name=name; set methodu olduğu için bunu kullanmıyoruz
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Enter a valid name.");
            return;             // void methodda return demek hata olduğunu belirtir
        }
        this.name=name;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        if(!(gender=='M' || gender=='m' || gender=='F' || gender=='f' )){
            return;
        }
        this.gender=gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age<16 || age>90){
            return;
        }
        this.age=age;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if(salary<0){
            return;
        }
        this.salary=salary;
    }

    public String toString (){
        return "Empoyee{"+
                " name='"+name+
                "', gender='"+gender+
                "', age='"+age+
                "', salary='"+salary+"'}";
    }

}
