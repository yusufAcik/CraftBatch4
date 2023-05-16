package day48_OOP_Review;

import day46_AbstractClassAndInterface.day46_Animal.Animal;
import day46_AbstractClassAndInterface.day46_Animal.Dog;
import day47_Polymorphism.day47_Shapes.*;

public class ReferanceTypeCasting {

    public static void main(String[] args) {



   //  Shape shape = new Shape();  abstract olduğu için nesne oluşturamyaız

    Shape shape = new Circle(5); // polymorphism kullanarak abstract klastan obje ürettik

        System.out.println(shape.area());
        System.out.println(shape.perimeter());
        System.out.println(shape);

       //  Animal animal = new Animal();  // abstract

        Animal animal = new Dog("Karabaş","Sivas Kangalı",'M',5,"X L","Beyaz");

        animal.drink();
        animal.eat();
        ((Dog)(animal)).bark();  // casting
        ((Dog)(animal)).play();

        Shape shape1 = new Square(10);
        System.out.println("shape1.perimeter() = " + shape1.perimeter());
        System.out.println("shape1.area() = " + shape1.area());
        System.out.println("shape1.getName() = " + shape1.getName());

        System.out.println("((Square)(shape1)).getSide() = " + ((Square) (shape1)).getSide());

        Cube cube = new Cube(5);
        cube.setSide(6);
        System.out.println("cube = " + cube);

        shape1=cube;   // polymorphism
        shape1=shape;
        shape1=new Triangle(3,4,5);



    }
}