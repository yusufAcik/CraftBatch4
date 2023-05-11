package day46_AbstractClassAndInterface.day46_Animal;

public class Cat extends Animal implements Playable{
// önce extend sonra implement olmalı; sıralamayı değiştiremeyiz
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println(getName()+" is eating liver");
    }

  /*  public void drink(){
        System.out.println(getName()+" is drinking water");
    }
*/          // drink metodunu Animal clasında final yaptığımız için
            // burada override edemeyiz

    public void meow(){
        System.out.println(getName()+" is meowing");
    }

    public void play(){
        System.out.println(getName()+" is playing with mouse");
    }
    // implement ettiğimiz Playing klasından gelen zorunlu metod
}
