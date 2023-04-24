package day31_Arrays_1;

public class C02_Array_1 {

    public static void main(String[] args) {
        String x="Yusuf";
        String[] y = new String[6];
        int z[]=new int[3];

        int t[];
        t=new int[8];

        int k[]=new int[5];
        k[0]=105;
        k[1]=89;
        k[2]=63;
        k[3]=56;
        k[4]=107;
    //    k[5]=110;  // hata verir

        System.out.println(k[1]);

        String l[]=new String[3];
        l[0]="Ali ";
        l[1]="ata ";
        l[2]="bak.";

        System.out.println(l[0].concat(l[1]).concat(l[2]));

        String str[]={"Ali ","ata ","bak."}; // kapasiteyi girilen veri sayısına göre artırır.
        // String[] str=new String[3];
        // str[0]="Ali ";
        // str[1]="ata ";
        // str[2]="bak ";

        // 2 değer alan int array oluşturup bunları toplayın

        int m[]=new int[2];
        m[0]=3;
        m[1]=5;
        int toplam=m[0]+m[1];
        System.out.println(toplam);

        int n[]= {12,23};

        int toplam2=n[0]+n[1];
        System.out.println(toplam2);


    }

}
