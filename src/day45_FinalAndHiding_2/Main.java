package day45_FinalAndHiding_2;

public class Main extends FinalAndHiding {

    public static void main(String[] args) {
       // A a=new A();
       // B b=new B();
       // System.out.println(a.x);
       // System.out.println(b.x);

        day45_FinalAndHiding_2.A.metod();
        B.metod();


    }



        void metod1 (){
            System.out.println("parent class ın metodunu override edemiyorum."
                    +"isim değişkliği yapmak zorundayım");
        }
    }
