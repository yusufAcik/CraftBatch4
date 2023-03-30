package day11_ControlFlowStatements_IF;

public class C07_If_If_Else {

    public static void main(String[] args) {

      /*  int a=30;
        int b=20;
        if(a>b){
            System.out.println("A büyüktür B den");
        }else if(a==b){ //istediğimiz kadar else if kullanabiliriz
            System.out.println("A ve B eşittir");
        }else {
            System.out.println("B büyüktür A dan");
        }




        System.out.println("A");
        if (false){
            System.out.println("B");
        }else if(false){
            System.out.println("C");
        }else if(false){
            System.out.println("D");
        }else if(true){
        System.out.println("E");
        }else if(true){
        System.out.println("F");
        }else{
            System.out.println("G");
        }
        System.out.println("H");

   // bir program yazın x=10 ise y=20, x=20 ise y=30,
        //  x=30 ise y=40 değil ise y=0 atansın

        int x=20,y=0;
        if(x==10){
            y=20;
        }else if(x==20){
            y=30;
        }else if(x==30){
            y=40;
        }
        System.out.println("y = " + y);
   String str = null;
        int degree = 19;
        if(degree>=20){
            str="butterfly flies";
        }else{
            str="";

        }
        System.out.println("str = " + str);

        // ayşenin parası 5 liradan az ise babası 10 lira versin

        int aysePara=6;

        if(aysePara<5){
            aysePara+=10;
        }
        System.out.println("ayşenin parası: "+aysePara);

    // 2 sayının eşit olup olmadığını kontrol eden program

        int x =10;
        int y=15;
        if(x==y){
            System.out.println("sayılar eşit");
        }else {
            System.out.println("sayılar eşit değil");
        }
    // 2 sayıdan büyük olanı veren program

        int x = 20;
        int y = 30;
        if(x>y){
            System.out.println(x);
        }else if(x==y){
            System.out.println("sayılar eşit");
        }else{
            System.out.println(y);
        }
    // a b c değişkeni atayalım a+b c den büyükse
        // a ve b nin farkını c ye atasın

        int a,b,c;
        a=20;
        b=30;
        c=30;
        if((a+b>c)){
            c=a-b;
            // c yi hep + istiyorsak if parantezinin
            // içine başka if parantezi açabiliriz
            // c=Math.abs((a-b)); mutlak değer alır
            // c=Math.max(a,b)-Math.min(a,b);
            if((a-b)>=0){
                c=a-b;
            }else{
                c=-(a-b);
            }
        }
        System.out.println(c);


     // 3 adet iç açının üçgen olup olmadığını kontrol etsin

         int x,y,z;
         x=60;
         y=80;
         z=60;
         if (x+y+z==180){
             System.out.println("bu bir üçgendir");

         }else{
             System.out.println("üçgen değildir");
         }
*/
        // üç açıdan biri 90 ise bu dik üçgendir desin

        int a,b,c;
        a=60;
        b=60;
        c=60;
       /* if(a==90){
            System.out.println("bu bir dik üçgendir");
        }else if(b==90){
            System.out.println("bu bir dik üçgendir");
        }else if(c==90){
            System.out.println("bu bir dik üçgendir");
        }else{
       System.out.println("bu bir dik üçgen değildir");
       */
        if(a+b+c==180){
            if(a==90||b==90||c==90){
            System.out.println("bu bir dik üçgendir");
            }else{
                System.out.println("bu bir dik üçgen değildir");
            }
        }else{
            System.out.println("bu bir üçgen değildir");
        }
    }
    }

