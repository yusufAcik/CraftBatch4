package day41_StaticAndInheritance;

import java.util.Random;

public class BankaMusteri {

    String adSoyad;
    private String hesapNo;
    double bakiye;
    private static int count=1;  // sadece ilk objede kullanılır
                            // çağırılana kadar kullanılmaz

    static private  final String SIFRE="şafak";
    {
        this.hesapNo=hesapNoOlustur();  // her objede çalışır
    }
    public BankaMusteri(){
      //  this.hesapNo=hesapNoOlustur();
    }
    public BankaMusteri(String adSoyad){
        this.adSoyad=adSoyad;
      //  this.hesapNo=hesapNoOlustur();
    }

    public BankaMusteri(double bakiye) {
        this.bakiye = bakiye;
    }

    public BankaMusteri(String adSoyad, double bakiye){
        this.adSoyad=adSoyad;
        this.bakiye=bakiye;
       // this.hesapNo=hesapNoOlustur();
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo,String sifre){
        if(sifre.equals(SIFRE)){
            this.hesapNo=hesapNo;
        }
    }

  //  public void setHesapNo(String hesapNo) {
    //    this.hesapNo = hesapNo;
   // }
    //
    //
    // hesap no private olduğu için setter ını sildik

    public double getBakiye() {
        return bakiye;
    }

  //  public void setBakiye(double bakiye) {
  //      this.bakiye = bakiye;
  //  }
    // set bakiye yerine paraEkle methodu oluşturduk

    public void paraEkle(double para){
        this.bakiye=bakiye+para;
    }

    public void paraCek(double para){
        if(this.bakiye>para){
            this.bakiye=bakiye-para;
        }
    }
    public static String hesapNoOlustur(){  // private static -> herkes ulaşamaz
                                             // class a ait method
        Random random=new Random();
        int x=random.nextInt(9000)+1000;
        String hesapNo=count+""+2023+x;
        count++;
        return hesapNo;
    }
}
