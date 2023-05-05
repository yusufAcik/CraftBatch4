package day41_StaticAndInheritance;

public class BankaMain {
    public static void main(String[] args) {
        BankaMusteri yusuf = new BankaMusteri(1000);
        yusuf.setAdSoyad("yusuf yusuf");
        BankaMusteri ali = new BankaMusteri();
        ali.setAdSoyad("Ali Veli");

        System.out.println("ali.getHesapNo() = " + ali.getHesapNo());

        yusuf.paraEkle(500);
        yusuf.paraCek(800);
        yusuf.paraCek(200);
        yusuf.paraEkle(5000);
        yusuf.paraCek(10000);

        ali.paraCek(100);
        ali.paraEkle(500);
        ali.paraEkle(100);

        System.out.println("yusuf.getBakiye() = " + yusuf.getBakiye());
        System.out.println("ali.getBakiye() = " + ali.getBakiye());

        System.out.println("ali.getHesapNo() = " + ali.getHesapNo());
        ali.setHesapNo(BankaMusteri.hesapNoOlustur(),"şafak");
        System.out.println("ali.getHesapNo() = " + ali.getHesapNo());
    }
}
