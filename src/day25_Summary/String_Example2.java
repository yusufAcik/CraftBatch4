package day25_Summary;

public class String_Example2 {

    public static void main(String[] args) {

        String str="Merhaba";
        String str2= "ErMan";
        if(ikinciKelimedeVarMi(str,str2)>0){
            System.out.println("ikinci kelimede var ve "+ikinciKelimedeVarMi(str,str2)+" indeksinde yer alıyor");
        }else {
            System.out.println("ikinci kelimede yer almıyor");
        }

    }

    public static int ikinciKelimedeVarMi(String str1,String str2){
        return str2.indexOf(str1.trim().charAt(0));
    }

    // Kullanıcıdan 2 kelime yazmasını isteyin ilk kelimenin baş harfi
//2. kelimede varsa index ini alın.

}
