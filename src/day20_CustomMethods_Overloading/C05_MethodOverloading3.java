package day20_CustomMethods_Overloading;

public class C05_MethodOverloading3 {
    public static void main(String[] args) {
        methodX(5, "Ali Osman",true);
        methodX(10,"Ali Osman",false);
        System.out.println("-----------------");
        methodX(10,"Ali Osman");
    }
    public static void methodX(int i, String str, boolean bl){
        if(bl){
            System.out.println(i+str);
        }else{
            methodX(i,str);
        }

    }
    public static void methodX(int num,String str){
        for (int i=1; i<=num; i++){
            System.out.println(str);
        }
    }
}

/*
 * 3 parametreli bir method yazin int ve String ve boolean tipinde 3 parametre alsin
 * Boolean true ise int ve String değeri concat yapsın.
 * false ise başka bir methodu çağırsın ve String değeri int kadar yazdırsın.*/