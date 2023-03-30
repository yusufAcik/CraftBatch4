package day12_SwitchCase;

public class C06_Switch_Case {

    public static void main(String[] args) {

    // byte, short, int, String, char tipindeki
        //  değişkenleri karşılaştırmak için kullanılır

        System.out.println("giriş");
        int sayi = 3;
        switch (sayi){
            case 1:
                System.out.println("sayı 1 e eşit");
                break;
            case 2:
                System.out.println("sayı 2 ye eşit");
                break;
            case 3:
                System.out.println("sayı 3 e eşit");
                break;
            default:
                System.out.println("sayı bulunamadı");



        }
    }
}
