package mentoring18_Abstract_Polymorphism.Polymorphism;

public class CarSeller {

    public static void main(String[] args) {

        CarSeller obj = new CarSeller();
        obj.motor();
        obj.yakit();

        System.out.println("------------------");

        Honda obj1 = new Honda();
        obj1.motor();
        obj1.yakit();


        System.out.println("-------------");

       // HondaBenzinli obj2 = new HondaBenzinli();
                    // =
          Honda obj2 = new HondaBenzinli();

        obj2.motor();
        obj2.yakit();
        ((HondaBenzinli)obj2).yakit(6.8);
        // metod child class a ait olduğu ve objeyi parent
        // klastan oluşturduğumuz için  metod hata verdi
        // objeyi downcasting yaparak sorunu çözdük

    }


    public void motor(){
        System.out.println("Honda benzinli motor çalışır.");
    }
    public void yakit(){ // OVERRIDING
        System.out.println("Honda benzin aldı.");
    }
}

/*
ENCAPSULATION = DATA HIDING, PRIVATE, GETTER-SETTER

POLYMORPHISM= OVERLOADING+OVERRIDING(inheritance)

POLYMORPHISM= aynı eylemi bir çok farklı şekilde
              gerçekleştirmemizi sağlayan concept

 */
