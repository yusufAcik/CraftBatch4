package day42_StaticAndInheritage;

public class Bird extends Animal {  // extends Animal diyerek
                // Animal classının private olmayan bütün özelliklerini aldık
                // bir class sadece 1 klassa extend yapabilir
    int kanatUzunluğu;
    String gagaRengi;


    public void uc(){
        System.out.println("Kuş uçuyor.");
    }

}
