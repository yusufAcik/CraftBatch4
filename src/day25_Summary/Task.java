package day25_Summary;

public class Task {

    public static void main(String[] args) {

        System.out.println("   merhaba dünyalı   ".trim());
        System.out.println(trim2("   merhaba   uzaylı "));
    }

    // trim(String str) şeklinde bir metot yazın trim gibi çalışsın
    // ve string döndürsün.  İçerisinde string in hazır metodu olan
    // trim metodunu kullanmayın.

    public static String trim2 (String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(0)==' '){
                str=str.replace(" ","");
            }
        }
        return str;
        }


    }

