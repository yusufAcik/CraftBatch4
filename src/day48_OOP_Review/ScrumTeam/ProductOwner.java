package day48_OOP_Review.ScrumTeam;

public class ProductOwner extends Employee {

    public ProductOwner(String name, int age, char gender,  double salary, int id, String deparmentName) {
        super(name, age, gender, "Product Owner", salary, id, deparmentName);
    }
}
