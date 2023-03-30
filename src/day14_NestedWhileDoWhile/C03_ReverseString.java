package day14_NestedWhileDoWhile;

public class C03_ReverseString {

    public static void main(String[] args) {

     /*   String name = "Ali";
        //             012
        System.out.println(name.length()); // stringin karakter sayısı
        System.out.println(name.charAt(0)); // 1. karakter
        System.out.println(name.charAt(1)); // 2. karakter
        System.out.println(name.charAt(2)); // 3. karakter
        System.out.println(name.charAt(3)); // !! hata verir
*/
        String str = "teneke";
        String reversed = "";
        //            012345
        System.out.println(str.length()); // 6
      //  System.out.println(str.charAt(0));
      //  System.out.println(str.charAt(1));
      //  System.out.println(str.charAt(5));

        // döngüyle yazdıralım

        for(int i=0; i<str.length();i++){
            System.out.println(str.charAt(i));
        }

    // tersten yazdırma

        reversed+=str.charAt(5);
        reversed+=str.charAt(4);
        reversed+=str.charAt(3);
        reversed+=str.charAt(2);
        reversed+=str.charAt(1);
        reversed+=str.charAt(0);
        System.out.println(reversed);

        reversed=""; // yukarda yazdığımız için içini boşalttık


        // for döngüsüyle

        for(int i=str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);

    }
}
