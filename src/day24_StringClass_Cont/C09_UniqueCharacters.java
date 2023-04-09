package day24_StringClass_Cont;

public class C09_UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcdee";
        String result="";
        // bir karakterin ilk indeksi ve son indeksi
        // aynı ise o karakter unique tir

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
