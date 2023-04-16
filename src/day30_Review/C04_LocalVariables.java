package day30_Review;

public class C04_LocalVariables {
    /*
    1. Bir metod içerisinde oluşturulan bir değişkenin
    scope u(etki alanı) o metodon içidir. Başka bir yerde
    o değişkeni kullanamayız, çağıramayız. Bu tip değişkenlere
    LOCAL DEĞİŞKEN denir.
    2. For, while etc döngülerinde kendi scope ları vardır.
    Loop dışında kullanamayız.
    3. Local değişkenler değer atamadan oluşturulabilir.
        Ancak değer atamadan bu değişkenleri kullanamayız.
    4. Aynı scope içinde aynı isimle 2 değişken olmaz.


     */
    public static void main(String[] args) {
        String isim;
      //  System.out.println(isim);  initialize edilmediği için kullanılamaz

        int i;
       // i++;  initialize edilmediği için kullanılamaz hata verir

        {
            int i2=5;
            System.out.println(i2); // hata vermez
        }
      //  System.out.println(i2); // hata verir out of scope

        // başka class C05 ten nesne çağırma

        System.out.println("C05_ClassLevelVariables.TurkishPI = " + C05_ClassLevelVariables.turkishPI);

        System.out.println("C05_ClassLevelVariables.turkishPizza = " + C05_ClassLevelVariables.turkishPizza);
    }
}
