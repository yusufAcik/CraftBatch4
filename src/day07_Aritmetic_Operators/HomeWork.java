package day07_Aritmetic_Operators;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args){

      /*  Scanner scan=new Scanner(System.in);
        System.out.print("dairenin yarıçapı : ");
        double r=scan.nextDouble();
        double PI=3.14;
        double alan=(PI*r*r);
        double cevre=(2*PI*r);
        System.out.println("dairenin alanı : " +alan );
        System.out.print("dairenin çevresi :" +cevre+ " dir");


        Scanner scan=new Scanner(System.in);
        System.out.print("fahrenheit : ");
        double f=scan.nextDouble();
        double c=((f-32)/1.8);
        System.out.print(f+" fahrenheit "+c+" celciustur");


        Scanner scan=new Scanner(System.in);
        System.out.print("salondaki sıra sayısı :");
        int sira=scan.nextInt();
        System.out.print("her sıradaki koltuk adeti :");
        int siraKoltuk=scan.nextInt();
        System.out.print("katılımcı sayısı :");
        int katilimci=scan.nextInt();

        int kapasite=(sira*siraKoltuk);
        int bosKoltuk=(kapasite-katilimci);
        int oturulanSira=(katilimci/siraKoltuk+1);
        int bosSira=(sira-oturulanSira);
        int otSiBosKoltuk=(siraKoltuk-katilimci%siraKoltuk);

        System.out.println("kapasite : "+kapasite);
        System.out.println("boş koltuk : "+bosKoltuk);
        System.out.println("oturulan sıra : "+oturulanSira);
        System.out.println("oturulan sıra : "+oturulanSira);
        System.out.println("tamamen boş sıra : "+bosSira);
        System.out.println("oturulan sıradaki boş koltuk : "+otSiBosKoltuk);
*/

        Scanner scan=new Scanner(System.in);
        System.out.print("saniye : ");
        int sn= scan.nextInt();
        int saat=sn/60/60;
        int dk=(sn-saat*60*60)/60;
        int sn2=sn%3600%60;
        System.out.print(sn+" saniye "+saat+" saat "+dk+" dakika "+sn2+" saniyedir.");









    }
}
