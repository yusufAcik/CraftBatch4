package day57_JavaReview;

class Person {
    public String name;
    public  char gender;
    public int age;

    public Person (String name){
        this.name=name;
    }
    public Person (){};

    public Person(String name, char gender, int age) {
        this.name = name; // this(name); bu şekilde de tanımlanabilir
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
public class C01_ClassReview {
    public static void main(String[] args) {

        Person person = new Person(); // default constructor sayesinde obje oluşturabiliyoruz
                        // ancak classta boş constructor yoksa sonradan hata verir

        Person person1 = new Person("yusuf");
        person1.name="ali";
        person1.age=35;
        person1.gender='m';

        System.out.println("person1.name = " + person1.name);

        System.out.println("person1 = " + person1); // will print out reference to the console without toString() method

        Person person2 = new Person("veli",'m',22);
        Person person3 = new Person("ayşe",'f',29);
        Person person4 = new Person("ahmet",'m',44);

        System.out.println("person2 = " + person2);
        System.out.println("person3 = " + person3);
        System.out.println("person4 = " + person4);

    }
}
