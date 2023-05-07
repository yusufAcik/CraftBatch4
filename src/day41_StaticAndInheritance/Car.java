package day41_StaticAndInheritance;

import java.util.Scanner;

public class Car {

    String marka; // buralara değer atamak doğru değil
    int modelYil;
    int beygir;
    private String saseNo; // şase no ya herkes erişemesin
    boolean isSuv;
    boolean isManuel;
    private final String sifre="yusuf";
    // final olduğu için class içinde dahi değiştirilemez
    static int tekerlekSayisi=4; // Car sınıfındaki tüm araçlara otomatik atandı


    // kullanıcı yeni bir obje oluştururken
    // kolaylık olması için constructor oluşturuyoruz
    // constructor olmazsa her obje oluşturmada
    // field ismi girmek zorunda car1.modelyil=1999 gibi

    public String getSaseNo(){
        return this.saseNo;
    }

    public int getBeygir (){
        return this.beygir;
    }
    public void setBeygir(int beygir){
        if(beygir<100&&isSuv==true){
            return;
        }
        this.beygir=beygir;
    }
    public void setSaseNo(String yeniSaseNo){
        Scanner scan = new Scanner(System.in);
        System.out.println("şifre giriniz");
        String sifre=scan.nextLine();
        if(sifre.equals(this.sifre)){
            saseNo=yeniSaseNo;
            System.out.println("işlem başarılı");
            return;
        }
        System.out.println("hatalı şifre");
    }

    public Car(){}
    public Car(String marka){
        this.marka=marka;  // ilk marka class ın marka sı
                           // 2. marka bizim constructora yazdığımız marka
                           // 2. marka yerine istediğimiz bir ifade yazıp
                           //  onu class ın markasına eşitleyebiliriz ama
                           // teamül iki ismin de aynı yazılıp this ile eşitlenmesidir

    } // bunu vermek zorunda değiliz
    // this demek = bu class ın demektir
    public Car(String marka,int modelYil){
        this(); // class ın constructor unu da çağırabiliriz
                 // içini dolu da çağırabiliriz
                // this() en başta kullanılmak zorunda
    }
    public Car(String marka,int modelYil,int beygir){}
    public Car(String marka,int modelYil,int beygir,String saseNo){}
    public Car(String marka,int modelYil,int beygir,String saseNo,boolean isSuv){}
    public Car(String marka,int modelYil,int beygir,String saseNo,boolean isSuv,boolean isManuel){}

    public int getTekerlekSayisi(){
        return tekerlekSayisi;
        // static olmayan metodda statik değişken çağırılabilir
    }

    public static int beygir(){
        return tekerlekSayisi;
      //  return this.beygir;
        // static methodda statik olmayan değişken çağrılamaz
        // sadece statik değişken çağrılabilir
    }
}
