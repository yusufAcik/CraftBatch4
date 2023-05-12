package mentoring16_StaticVariablesAndStaticBlock;

class Mobile {

    String brand;
    int price;
  //  String name; bu şekilde objenin name i
    static String name; // bu şekilde objenin değil class taki tüm objelerin name i oldu
                    // tüm objelerde ortak olan özellikler için
                // değişkeni static tanımlamak  bellekte yer tasarrufu sağlar
            // her objenin içinde ayrı değişken tanımlama zorunluluğu kalkar

    // atamayı başka klas yerine burda yapmak istersek constructor kullanıyoruz

    static {
        name="Phone";
    }
    public Mobile(){
        brand="";
        price=2000;
      //   name="Phone"; name static olduğu için
        //   burda yazmak mantıklı değil
        // onun için bir statik blok oluşturup
        // orada atama yaparız
    }

    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
    // static ve non static değişkenler non static değişkenler kullanılabilir

    public static void show1(){
     //   System.out.println(brand+" "+price+" "+name);
        // static metod içinde static olmayan değişkenler kullanılamaz
        // brand ve price hata verir
        // non staticleri kullanmak için metoda obje girmemiz gerekir
    }

    public static void show2(Mobile obj){
        System.out.println(obj.brand+" "+obj.price+" "+name);
    }

}

public class Demo{

    public static void main(String[] args) {
        // main metod static olmazsa main metodun olduğu class için obje oluşturmak gerekir
        // başka yerde oluşturamayacağımız için main metoda ulaşamayız
         Mobile obj1 = new Mobile();
         obj1.brand="Apple";
         obj1.price=1500;
         obj1.name="Smart Phone";



        Mobile obj2 = new Mobile();
        obj1.brand="Samsung";
        obj1.price=1700;
        obj1.name="Smart Phone";

        obj1.show();
        obj2.show();

        Mobile.show1();  // statik metod class a ait olduğu için
                    // class ismi ile çağrılabilir obje oluşturma zorunluluğu yok

        Mobile.show2(obj1);
    }
}
