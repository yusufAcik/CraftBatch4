package day44_FinalAndHiding;

public class Main {

    public static void main(String[] args) {

        C c = new C();
        System.out.println("-----------------");
        C c1 = new C();
        System.out.println("-------------------");
        C c2 = new C();

        // A  dan obje oluşturursak sadece A nın statiği ve A nın instance metodu çalışır.
        // B  den obje oluşturursak sadece A ve B nin statiği + A ve B nin instance metodu çalışır.
    }
}
