package day37_Array_List;

import java.util.ArrayList;

public class C02_ArrayList {

    // ArrayList içeriğin belirli olmadığı durumlarda
    // esnek depolama imkanı sunar.
    // Objeleri (obje=data+method) tutar.

    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>();
        // kapasite belirtmezsek 10 kapasite ile başlar
        // kapasite belliyse baştan belirtmek performansı artırır.
        // her eklemede kapasite artırmak süreci uzatır


        System.out.println(arrList.add("Yusuf"));
        arrList.add("ali");
       // arrList.clear();  // tüm arraylist in içini boşaltır
        System.out.println(arrList.get(0));
        System.out.println(arrList.get(1));  // get obje getirir
      //  System.out.println(arrList.get(2)); // index hatası verir
        System.out.println(arrList.get(arrList.size()-1)); // length yerine size kullanıyoruz
        System.out.println("arrList.isEmpty() = " + arrList.isEmpty());

        // arrayList te add yada remove yaptığımızda
        // diğer indexler kayarak boşlukları doldurur.

        arrList.add(0,"ahmet");
        System.out.println(arrList);
        arrList.add(1,"ayşe");
        System.out.println(arrList);
        System.out.println("arrList.get(2) = " + arrList.get(2));
        arrList.remove(1);
        System.out.println(arrList.get(1));
        arrList.set(0,"mehmet"); // içeriği değiştirir (kaydırma yok)
        System.out.println(arrList);

        // indexOf nesnenin kaçıncı indexte olduğunu getirir

        System.out.println(arrList.indexOf("Yusuf"));
        System.out.println(arrList.indexOf("mahmut")); // -1 verir




    }
}
