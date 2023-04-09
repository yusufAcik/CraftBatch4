package day24_StringClass_Cont;

import org.w3c.dom.ls.LSOutput;

public class C03_StringIsEmpty {

    public static void main(String[] args) {



    // isEmpty() stringin boş olup olmadığını kontrol ediyor

        String s1 = "Merhaba";
        System.out.println(s1.isEmpty());

        String s2="";
        System.out.println(s2.isEmpty());

        String s3 = " ";
        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());


}
}
