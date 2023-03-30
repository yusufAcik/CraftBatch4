package day09_OperatorsCont;

public class C04_ShortHandOperators {

    public static void main(String[] args) {

        int number = 10;
        number=20;
        System.out.println("number = " + number);

        String word = "Java Programming Language";
        word="Phyton Programming Language";
        System.out.println("word = " + word);

        System.out.println("-------------------");

        int x = 100;
        System.out.println("x = " + x);

        x +=100;
        System.out.println("x = " + x);

        String str = "Golden";
        str +=" Globe";

        System.out.println("str = " + str);

        double num1=3.5;
        num1 +=6.5;

        System.out.println("num1 = " + num1);

        double bakiye= 3520.50;
        bakiye +=1500;
        System.out.println("bakiye = " + bakiye);

        bakiye -=2200;
        System.out.println("bakiye = " + bakiye);

        double maas=42500;
        maas*=2;
        System.out.println("maas = " + maas);

        double gramAltin = 0.001;
        gramAltin *=120;
        System.out.println("gramAltin = " + gramAltin);

        System.out.println("--------------------");

        double maas2= 50000.0;
        maas2 /=2;
        System.out.println("maas2 = " + maas2);

        System.out.println("------------------");

        double num2 = 100;
        num2 %=3;
        System.out.println("num2 = " + num2);

        System.out.println("------------");

        int odenecekTutar = 1130; // kaç 200 lük kaç 100 lük vs
        int ikiYuzluk = 1130/200;

        odenecekTutar %=200;

        System.out.println("odenecekTutar = " + odenecekTutar);
        int yuzluk=odenecekTutar/100;
        odenecekTutar %=100;
        int yirmilik=odenecekTutar/20;
        odenecekTutar %=20;
        int onluk=odenecekTutar/10;
        odenecekTutar %=10;

        System.out.println("1130 TL için "+ikiYuzluk+" tane ikiyüzlük "+yuzluk+" tane yüzlük "+yirmilik+" tane yirmilik "+onluk+
                " tane onluk banknot ödemeniz gerekmektedir");



    }
}
