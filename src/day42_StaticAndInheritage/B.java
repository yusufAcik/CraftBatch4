package day42_StaticAndInheritage;

public class B {

    public static int s=3;
    // class a ilk girişte çalışır
    // daha sonra çağırılana kadar bekler

    public int n;

   static {
       System.out.println("Static blok çalıştı");
   }
   // statik bloklar sadece 1 kez yapılan işlemler için kullanılır
    // şifre girme dataBase e girme chrome a girme vs


    {

        // bu blok her obje oluştuğunda 1 kez çalışır
        // constructor görmeden çalışmaz
        System.out.println("Blok 1 çalıştı.");

    }
    {
        System.out.println("Blok 2 çalıştı");
    }
    public B(){
        System.out.println("Boş konstructor çalıştı");
    }
    public B(int n){
        this();
        this.n=n;
        System.out.println("Dolu constructor çalıştı");
    }
}
