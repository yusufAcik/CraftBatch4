package day30_Review;

public class C05_ClassLevelVariables {
    /*  Bir Class içerisinde tüm metodların içerisinde bir değişkene
    erişmek istiyorsak onu metodların dışında classın içinde tanımlama gerekir.Class Level

    1. Class içinde taımlanan değişkenin scope u tüm class tır.
    2. Class level değişkenlere ilk değer atanmasa da olur.
    3. Değer atanmadan da bu değişkenler kullanılabilir.
        JAVA bunlara default değerler atar.
    4. Static olarak tanımlanan değişkenler, diğer tüm classlardan Class ismi ile erişilebilir oluyor.
    5. Eğer metod da static ise, içerisine static olmayan hiç birşey almaz.


     */

    static int turkishPI=3;
    static String turkishPizza;
    static boolean bl;
    static char ch;
    static int i;

    int i2;
    boolean bl2;

    public static void main(String[] args) {
        System.out.println("turkishPI = " + turkishPI);
        System.out.println("turkishPizza = " + turkishPizza);
        System.out.println("bl = " + bl);
        System.out.println("ch = " + ch);
        System.out.println("i = " + i);
    //    System.out.println("i2 = " + i2);   // instance variable hata verir
    //    System.out.println("bl2 = " + bl2); // instance

      //  yMethod();  static olmadığı için hata verir
    }

    public void yMethod(){    // methodu static yapmazsak
        i++;                    // static olmayan değişkenleri
        System.out.println(i);  // içine alabilir ama methodumuz static başka bir methodda kullanılamaz
        System.out.println(i2);
        System.out.println("bl2 = " + bl2);
    }

}
