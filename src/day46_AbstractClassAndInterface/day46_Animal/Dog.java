package day46_AbstractClassAndInterface.day46_Animal;

public class Dog extends Animal implements Playable {

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void eat(){
        System.out.println(getName()+" is eating bone");
    }
    public void play(){
        System.out.println(getName()+" is playing with ball");
    }
    public void bark(){
        System.out.println(getName()+" is barking");
    }
}
