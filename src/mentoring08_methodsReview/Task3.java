package mentoring08_methodsReview;

public class Task3 {

    public static String enCokTekrarEdenHarf (String str){
        char ch;
        int tekrar=1;
        for (int i = 0; i < str.length(); i++) {
        if (str.substring(i+1).contains(str.charAt(i)+"")){
            str=str.substring(i+1).replaceFirst(str.charAt(i)+"","");
            tekrar++;
            }
        }
        return "";
    }

    // bir kelime içerisindeki en çok tekrar eden harfi döndüren method

}
