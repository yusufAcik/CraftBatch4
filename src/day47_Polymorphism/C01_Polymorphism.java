package day47_Polymorphism;

import day46_AbstractClassAndInterface.day46_Animal.Animal;
import day46_AbstractClassAndInterface.day46_Animal.Cat;
import day46_AbstractClassAndInterface.day46_Animal.Dog;
import day47_Polymorphism.day47_Shapes.Circle;
import day47_Polymorphism.day47_Shapes.Shape;

import java.util.Arrays;

public class C01_Polymorphism {
    public static void main(String[] args) {

        Animal animal = new Dog("Rex","Golden",'M',9,"Medium","Yellow");
        Dog dog = new Dog("Lessie","Golden",'M',9,"Medium","Yellow");

        boolean isAnimal=animal instanceof Animal;
        boolean isDog=animal instanceof Dog;
        boolean isCat=animal instanceof Cat;
        System.out.println(isAnimal);
        System.out.println(isDog);
        System.out.println(isCat);

        animal.eat();
        animal.drink();  // animal nesnesini Animal clasını refere ederek oluşturduğumuz için (Animal animal)
      //  animal.bark();  // sadece animal clasında tanımlanan metodlara erişebiliriz.
                        // Dog clasının kendine has metodlarına erişemeyiz

        ((Dog)(animal)).bark();
        ((Dog)(animal)).play();    // explicit casting yaparak animal ı Dog clasına indirgedik
                                // bu şekilde Dog clasının kendine has metodlarına erişebildik

        animal = new Cat("Rex","Golden",'M',9,"Medium","Yellow");
        ((Cat) animal).meow();  // üstte Dog klasına cast ettiğimiz animal ı burada Cat clasına cast ettik

        Cat cat = new Cat("maviş","Van",'M',9,"Medium","White");
      //  cat = new Dog("maviş","Van",'M',9,"Medium","White"); Cat clasında oluşturduğumuz cat i
        //  Dog clasına cast edemiyoruz

        Animal animal1=cat; // Cat sınıfında oluşturduğumuz cat objesini
                        // Animal sınıfında oluşturduğumuz animal ın içine attık
        System.out.println(animal1);  // kedi özellikleri yazar
        animal1.eat();  // metodu Cat den aldığı için eat liver yazar
        animal.drink();

        animal1=dog;   // cat olan animal1 i dog a çevirdik
        System.out.println(animal1); // köpek özellikleri yazar




        /*
*** polymorphism in uygulamada kullanımı->
*
* WebDriver driver;
* driver=new ChromeDriver()
* driver.get(amazon)
*
* driver=new FireFoxDriver();
* driver.get(google)
*
* parent classtan tek bir nesne oluşturarak
* duruma göre o nesneyi alt sınıflara cast ederek
* alt sınıfların özelliklerini esnek bir şekilde kullanmak

 */
        Circle circle = new Circle(5);
        circle.setRadius(9);
        System.out.println(circle.getRadius());
        System.out.println(circle.area());
        System.out.println(circle);

        Shape shape=new Circle(12);
        System.out.println(shape.perimeter());
        shape.area();
        System.out.println(shape.getName());
        System.out.println(shape);

        System.out.println(shape.getClass());
        System.out.println(shape.getClass().getName());

        System.out.println("--------------------------");

        String str="Golden globe";
        int a=3;
        double b =12.5;

        Object [] objectArray = {str,a,b,shape,animal,cat};

        System.out.println(Arrays.toString(objectArray));
    }
}
