package mentoring20_Interfaces;

class Developer {
    public void devApp(Computer compu){
        compu.code();
    }
}
interface Computer{  // bütün kodları abstract oluğu için abstract klası
                    // interface e çevirdik
     void code();  // interface de public abstract yazmaya gerek yok zaten default
}
class Laptop implements Computer {  // interface e extends edilmez implement edilir
    public void code(){
        System.out.println("code, compile, run..");
    }
}

class Desktop implements Computer {
    public void code(){
        System.out.println("code, compile, run: Faster..");
    }
}

public class Demo {

    public static void main(String[] args) {
        Developer ali = new Developer();
        Computer comp = new Laptop();
        Computer comp1 = new Desktop();
        ali.devApp(comp);
        ali.devApp(comp1);

    }

}
