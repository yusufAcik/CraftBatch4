package day25_Summary;

public class C02_MethodsCont {
    public static void main(String[] args) {


        String str="yusuf";
        System.out.println(ucEKle(str));

        System.out.println("contain(str,\"u\") = " + contain(str, "u"));

        String str1=ucEKle(str).substring(0,3);
        System.out.println(str1);

        int sayi1=5;
        int sayi2=10;

        // toplamları max değerin 4 katı mı kontrol edin

        System.out.println(4 * max(sayi1, sayi2) == sum(sayi1, sayi2));


    }

    public static int max(int a,int b){
        if(a>b){return a;}
        else return b;
    }

    public static int sum(int x, int y){
        return x+y;
    }

    public static String ucEKle(String str){
        return str+"3";
    }

    public static boolean contain(String str, String deger){
        return str.contains(deger);
    }
}
