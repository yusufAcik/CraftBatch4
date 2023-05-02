package day36_WrapperClass;

public class C03_WrapperClass_Characters {

    public static void main(String[] args) {

        // Character.isLetter()  -> harf olup olmadığını kontrol eder
        // Characters.isDigit()   -> sayı/rakam olup olmadığını kontrol eder
        // Character.isAlphabetic() -> harf olup olmadığını kontrol eder
        // is letter, is alpha dan daha kapsamlı

        System.out.println("Character.isLetter('ç') = " + Character.isLetter('ç'));
        System.out.println("Character.isAlphabetic('ş') = " + Character.isAlphabetic('ş'));

        String s="merhaba 3 nasılsın 10,neler23yapıyorsun?";
        // sayıları toplayıp ekrana döndüren method yazalım.

      //  System.out.println("textSayilariTopla(s) = " + textSayilariTopla(s));

        // String içerisindeki gömülü kelimeyi bulunuz.
        String str1="^+!j4546*/-a_|v-:!a ???()&+";
        String result="";
        for (int i = 0; i <str1.length() ; i++) {
            if(Character.isLetter(str1.charAt(i))){
                result+=str1.charAt(i);
            }
        }
        System.out.println(result);

        // String içerisindeki gömülü cümleyi çıkartın.

        String str2 ="|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>" +
                ">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n*" +
                "*-<<||l|>>012345679--a**//##++34r``~~((ı[234]+||";

        String result2="";
        for (int i = 0; i < str2.length(); i++) {
            if(Character.isLetter(str2.charAt(i))||str2.charAt(i)==' '){
                result2+=str2.charAt(i);
            }
        }
        System.out.println(result2);

        // str2 içerisindeki harf, sayı ve karakterleri bir string içine atalım

        String harf="";
        String sayilar="";
        String karakter="";

        for (int i = 0; i < str2.length(); i++) {
            if(Character.isLetter(str2.charAt(i))){
                harf+=str2.charAt(i);
            }else if (Character.isDigit(str2.charAt(i))){
                sayilar+=str2.charAt(i);
            }else {
                karakter+=str2.charAt(i);
            }
        }
        System.out.println("harf = " + harf);
        System.out.println("sayilar = " + sayilar);
        System.out.println("karakter = " + karakter);


    }

  /*  public static int textSayilariTopla(String str){
        int sum=0;

        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i)));
            sum+=Integer.valueOf(str.charAt[0]);
        }
        return sum;
    }
*/
}
