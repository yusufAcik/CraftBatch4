package day46_AbstractClassAndInterface.day46_Animal;

public final class Tiger extends Animal implements Wild{
    // alt klas üretilmesin diye final yaptık//
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void eat(){
        System.out.println(getName() + " is eating deer");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts a deer");
    }
}
