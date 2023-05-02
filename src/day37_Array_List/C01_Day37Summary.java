package day37_Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class C01_Day37Summary {

    public static void main(String[] args) {
        Boolean b = Character.isDigit(Integer.toString(100).split("")[0].charAt(0));
        //                           "100"   [1, 0, 0]   "1"       '1'
        System.out.println(b);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

        Integer inW = new Integer(10);  // W wrapperClass
        int inP = 5;   // P = primitive
        // inP. methodu çıkmaz ama inW. methodlar çıkar

        // methodları ezberlemeye gerek yok internetten bakabiliriz

        inP = inW; // unboxing wrapperden çıkarma
        inW = inP; // outoboxing wrappere sokma

        String s = "5";
        Integer k = Integer.valueOf(s); // Integer a döndürür (wrapper)
        int l = Integer.parseInt(s);  //   int a döndürür (primitive)

        int[] arr = new int[10];
        arr[0] = l; // 5,0,0,0,0,0,0,0,0,0
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(l);
        arrayList.get(0); // autoBoxing oldu WrapperClass a girdi

        System.out.println("nameControl(\"yusuf bey\") = " + nameControl("yusuf bey"));

        Scanner scan = new Scanner(System.in);
        System.out.println("isim soy isim giriniz");
        String nameSurname=scan.nextLine();

        if(nameControl(nameSurname)){
            System.out.println("password giriniz");
        }else {
            System.out.println("hatalı isim soyisim tekrar deneyiniz");
        }

    }

    // isim kontrol methodu hatalı isim girişlerini kontrol için

    public static boolean nameControl (String str){
        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i)) || !Character.isLetter(str.charAt(i))){
                if(str.charAt(i)!=' '|| str.charAt(i)!='-'){
                    return false;
                }
            }

        }
        return true;
    }
}
