package mentoring08_methodsReview;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(ikiKelimeKarsilastir(" Ankara  Ankara ile Bursa arası 500 km. ","Ankara","Bursa"));
    }


    public static boolean ikiKelimeKarsilastir (String cumle, String kelime1, String kelime2){
        boolean result=false;
        int kelime1Num=0;
        int kelime2Num=0;

        while (cumle.contains(kelime1)){
            cumle=cumle.replaceFirst(kelime1,"");
            kelime1Num++;
        }
        while (cumle.contains(kelime2)){
            cumle=cumle.replaceFirst(kelime2,"");
            kelime2Num++;
        }
        if (kelime2Num==kelime1Num && kelime1Num!=0) result=true;
        else result=false;

        return result;
    }

    //  Bursa ile Ankara kelimeleri cümlenin içerinde aynı sayıda dönüyorsa true
    //  farklı sayılarda dönüyorsa false yazdıran metodu yazınız.
    //  Ankara ile Bursa arası 500 km. True
    //  Ankara Bursa kadar yeşil değil. Bursa bir başka. False
    //  İstanbul çok uzak. false
}
