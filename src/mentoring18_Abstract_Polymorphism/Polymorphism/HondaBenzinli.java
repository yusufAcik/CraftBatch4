package mentoring18_Abstract_Polymorphism.Polymorphism;

public class HondaBenzinli extends Honda {

    public void motor(){
        System.out.println("Honda benzinli motor çalışır.");
    }
    public void yakit(){ // OVERRIDING
        System.out.println("Honda benzin aldı.");
    }

    public void yakit(double maxTuketim){
        System.out.println("Honda yakıt tüketimi ="+maxTuketim);
    }
}
