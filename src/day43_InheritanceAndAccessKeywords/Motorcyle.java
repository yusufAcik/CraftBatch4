package day43_InheritanceAndAccessKeywords;

public class Motorcyle extends Vehicle {
   private int cc;   // get methodu ile gelsin istiyorsak private yaparız

    public void changeCc(int yeniCc){
        cc=yeniCc;
    }
    public int getCc(){
        return cc;
    }
    public void start(){  // method overriding
        System.out.println("Motor çalıştı");
    }

    public static Motorcyle motorsikletOlustur(){
        return new Motorcyle();
    }
}
