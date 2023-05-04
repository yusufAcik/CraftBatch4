package day39_ConstructorOverloading;

public class Car {
    String marka;   // başına public yazmayınca erişim default oluyor
    String model;
    String renk;
    int hiz;

    boolean otomatikMi;

    public Car()
    {
    }

    public Car(String marka){
        this.marka=marka;
        // parametre ismi instance variable ile aynı değilse direk atama yapabiliriz
        // aynı olursa this kullanmak gerekli
    }

    public Car(String marka,String model){
        this.marka=marka;
        this.model=model;
    }

    public Car(String marka,String model,String renk){
        this.marka=marka;
        this.model=model;
        this.renk=renk;
    }

    public Car(String marka,String model,String renk,int hiz){
        this.marka=marka;
        this.model=model;
        this.renk=renk;
        this.hiz=hiz;
    }

    public Car(String marka,String model,String renk,int hiz, boolean otomatikMi){
        this.marka=marka;
        this.model=model;
        this.renk=renk;
        this.hiz=hiz;
        this.otomatikMi=otomatikMi;
    }

    public String toString(){
        return "Car{"+
                "marka= '"+marka+
                "', model= '"+model+
                "', renk= '"+renk+
                "', hız= '"+hiz+
                "', otomatik mi= '"+otomatikMi+"'}";
    }

    public static Car renkSec(Car car,String renk){
        car.renk=renk;
        return car;
    }

}
