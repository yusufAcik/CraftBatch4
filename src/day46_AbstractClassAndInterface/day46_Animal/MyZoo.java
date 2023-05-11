package day46_AbstractClassAndInterface.day46_Animal;

public class MyZoo {

    public static void main(String[] args) {

       // Animal animal = new Animal("anml","kkkk",'f',25,"medium","black");
        // cannot create objects from abstract class

        Cat cat = new Cat("Cesur","Scottish",'M',9,"Medium","Gray");
        cat.eat();
        cat.meow();
        cat.play();
        cat.setAge(0);
        System.out.println(cat);
        cat.setSize("Large");
        cat.setName("Mırnav");
        System.out.println(cat);


    }
}
