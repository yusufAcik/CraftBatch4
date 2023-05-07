package day42_StaticAndInheritage;

public class Animal {

    String name;
    int boy;  // variable lardan birini private yaparsak
              // Child klasslardan erişimi engellenir
    boolean isTuylu;

    public void yemekYe (){
        System.out.println(name+" yemek yiyor.");
    }
}
