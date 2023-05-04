package day40_Encapsulation;

import day39_ConstructorOverloading.Car;

public class C01_EmployeeObjects {

    // Bir sınıfın sadece değişken ve metodları private olabilir
    // sınıf private olamaz
    public static void main(String[] args) {

        Employee employee1=new Employee("",'P',30,3200);



       // employee1.age // public olmadığı için private olduğu için erişim yok
       // employee1.name  // method yazdık ama methodu çağırmadığımız için name e erişemedik
        System.out.println("employee1.getName() = " + employee1.getName());

        System.out.println("employee1.getGender() = " + employee1.getGender());

        Employee employee2 = new Employee("ümit",'A',20,25000);
        System.out.println("employee2 = " + employee2);
        employee2.setGender('M');
        employee2.setAge(40);
        employee2.setSalary(33000);
        System.out.println("employee2 = " + employee2);

        Employee employee3 = new Employee("",'A',-20,-25000);
        System.out.println("employee3 = " + employee3);
    }
}
