package day40_Encapsulation;

public class Tester {

    private String name;

    private double salary;

    private char gender;


    public String getName(){
        if(name==null){
            System.err.println("Name has not been set");
        }
        return name;
    }

    public void setName(String name){
        if(name==null){
            System.err.println("Name cannot be set to null");
        }
        if(name.isEmpty()){
            System.err.println("Name cannot be empty");
        }
        if(name.length()<2){
            System.err.println("Name should be at least two characters");
        }
        this.name=name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if(salary<0){
            System.err.println("Salary cannot be less than 0");
        }
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        if(!(gender=='M' || gender=='m' || gender=='F' || gender=='f' )){
            System.err.println("Please enter a valid gender as 'M', 'm','F','f' ");
            return;
        }
        this.gender=gender;
    }


}

//public class TesterObjects {   // bir sayfada sadece bir tane
                               // public class olabilir
                // birden fazla class olabilir ancak bir tane
// public olabilir onun adı da java file ile aynı olmak zorunda
//}

class TesterObjects{
    public static void main(String[] args) {
        Tester tester1=new Tester();

        tester1.setName("Ali");
        System.out.println("tester1.getName() = " + tester1.getName());

        tester1.setSalary(-2000);
        System.out.println("tester1.getSalary() = " + tester1.getSalary());

        // tester1.getGender('b'); // get metodlarına veri giremeyiz

        tester1.setGender('L');
        System.out.println("tester1.getGender() = " + tester1.getGender());
    }
}
