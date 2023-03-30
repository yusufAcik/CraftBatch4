package day17_Methods;

public class C03_Methods_01 {

    // main methodun dışına çıkıyoruz artık
    // farklı metodlar oluşturup gerektiğinde istediğimiz kadar çağırabiliriz
    // medodları iç içe de çağırabiliriz
    //metod:(belirli bir görev için oluşturulmuş kod blokları, ifade toplulukları)

    public static void main(String[] args) {

        message_2(); // 312 yazar

          int x=6;
          if(x==5){
              hello();
          }else if(x==6){
              menu();
          }else {
              System.out.println("herhangi bir tercih yapılmadı");
          }


    }

    public static void hello(){
        System.out.println("Bankamıza hoş geldiniz");
    }

    public static void menu(){
        System.out.println("1.para çekme. 2. para yatırma. 3. bakiye 4. çıkış");
    }



    public static void message_1(){
        message_3();
        System.out.println("1");
    }
    public static void message_2(){
        message_1();
        System.out.println("2");
    }
    public static void message_3(){
        System.out.println("3");

    }


}
