package mentoring03_reviewSecondWeek;

public class IntToString {

    public static void main(String[] args) {

        String girilenBilgi = "65"; // bu haliyle sayısal işleme giremez

        int girilenSayi = 65;

        // kelimenin sayıya çevrilmesi

        int girilenBilgininSayiHali = Integer.parseInt(girilenBilgi);

        System.out.println("girilenBilgininSayiHali = " + girilenBilgininSayiHali);

        // sayının kelimeye çevrilmesi

        String girilenSayininKelimeHali = Integer.toString(girilenSayi);
        System.out.println("girilenSayininKelimeHali = " + girilenSayininKelimeHali);


    }
}
