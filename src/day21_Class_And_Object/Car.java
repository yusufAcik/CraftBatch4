package day21_Class_And_Object;

public class Car {

    String marka; // buralara değer atamak doğru değil
    int modelYil;
    int beygir;
    String saseNo;
    boolean isSuv;
    boolean isManuel;

    public void hizlan(){
        System.out.println("Araç hızlanıyor");
    }
    public String beygirKarsilastir(){
        if(beygir>100){
            return "güçlü araç";
        }
        return "zayıf araç";
    }
}
