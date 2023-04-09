package day23_StringClass;

public class C01_StringIntro {

    public static void main(String[] args) {

        String str1="hello"; // literal way -> Heap Memory --> String Pool
        String str2="hello"; // str2 --> String Pooldaki "hello" yu işaret eder
        String str3="Hello"; // String Pool da olmadığı için yeni oluşturuyor
                             // literal way -> Heap Memory --> String Pool

        String str4=new String ("hello"); // literal way yerine new keyword ile oluşturdu
                                                 // String object --> Heap Memory
                                                 // String pool la işi yok
        boolean bl;
        // System.out.println(bl); // Local değişken initialize edilmediği için hata verir yazdırmaz
        bl=str1==str2;      // true döner
        System.out.println(bl);         // true

        bl = str1.equals(str2);
        System.out.println("bl: "+bl); // true


        bl=str1==str3;
        System.out.println(bl);         // false

        bl = str1.equals(str3);
        System.out.println("bl: "+bl);  // false

        System.out.println("--------------------");

        bl = str1==str4;
        System.out.println("bl: "+bl); // false since different objects with different reference variables

        bl=str1.equals(str4);
        System.out.println("bl: "+bl);  // true çünkü referansları karşılaştırmıyor,
                                        // farklı object olması ile ilgilenmiyor
                                        // sadece string içeriğini karşılaştırıyor





    }

}
