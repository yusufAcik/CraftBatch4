package day44_FinalAndHiding;

public class A {

    int a=20;

   static  {
        System.out.println("A statik metodu çalıştı.");
    }  // önce A nın statiği, sonra B nin statiği, sonra C nin statiği çalışır
        // daha sonra diğer metodlar


    {
        System.out.println("A instance metodu çalıştı.");
    }  // cons çalıştığı anda instance bloğu çağırır
    public A(){
        System.out.println("A constructoru çalıştı");
    }
}
