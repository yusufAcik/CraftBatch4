package day07_Aritmetic_Operators;

public class Aritmetic_Operators {

    public static void main(String[] args){

   /* int x=4;
    int y=10;
    double z=(double) x/y;
    System.out.print(z);


    int dogumYil=1990;
    int yas=(2023-dogumYil);

    System.out.print("Ahmet yas: "+(yas-5));

    double yaricap= 2;
    double PI=3.14;

    double cevre=2*yaricap*PI;
    double alan=PI*yaricap*yaricap;
    double alan2= Math.PI*Math.pow(yaricap,2);
// hiç biryerde değişmeyecek şeyler BÜYÜK yazılır PI gibi
    System.out.println("cevre: "+cevre);
    System.out.println("alan: "+alan);
    System.out.println("alan2: "+alan2);
    //System.out.print(Math.); matematik işlemlerinde yardımcı olur


        double f=300;
        double c=(f-32)/1.8;
        System.out.print(f+" fahrenheit "+c+" celciusdur");

        double c=32;
        double f=(c*1.8)+32;
        System.out.print(c+" celcius"+f+" fahrenheittır");


        double f=92;
        double k=90;
        double m=89;
        double ort= (f+k+m)/3;
        System.out.println(ort);
        boolean isPass=ort>80;
        System.out.print("Ali sınıfı geçti mi: "+isPass);
*/
        int toplamKisi= 113;
        int sira=15;
        int herSiradakiKoltukSayisi=12;
        int kapasite=sira*herSiradakiKoltukSayisi;
        System.out.println(kapasite);

        int bosKoltuk=kapasite-toplamKisi;
        System.out.println("bosKoltuk = " + bosKoltuk);

        int oturulanSira=toplamKisi/herSiradakiKoltukSayisi+1;
        System.out.println("oturulanSira = " + oturulanSira);

        int bosSira=sira-oturulanSira;
        System.out.println("bosSira = " + bosSira);

        int oturulanSiradakiBosKoltuk=herSiradakiKoltukSayisi-(toplamKisi%herSiradakiKoltukSayisi);
        System.out.println("oturulanSiradakiBosKoltuk = " + oturulanSiradakiBosKoltuk);


    }




}
