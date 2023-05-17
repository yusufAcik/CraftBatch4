package mentoring17_Inheritance;

public class Calc {  // parent - super - base


    public int sum(int a,int b){
        return a+b;
    }

    public int subt(int a,int b){
        return a-b;
    }
}

// bu yaptığımız single level inheritance
// multiple inheritance mümkün değil (except interface)
// (parentlarda aynı isimde metod olursa child hangisini kullanacak sorunu var )
// multi-level inheritance mümkün (torun)

class AdvCalc extends Calc { // child - sub - derived
 // extends -> is a / AdvCalc extends Calc = AdvCalc is a Calc
    public int mult(int a,int b){
        return a*b;
    }

    public int div(int a,int b){
        return a/b;
    }


}

 class Demo {

     public static void main(String[] args) {

         // java da tekrar suçtur.
         // her şeyi ortak paranteze almak esas
         // bir kodu geliştirmek için baştan yazmak yerine
         // extends kullanarak ağı geliştirmek


         AdvCalc obj = new AdvCalc();
         System.out.println(obj.sum(3,4));
         System.out.println(obj.mult(3,4));


     }
}


