package day06_Type_Casting;

public class Example {

    public static void main(String[] args){

      /*  int toplamSoruAdeti=60;
        double oran=4;
        int yanlisAdet=20;

        double net=toplamSoruAdeti-yanlisAdet-yanlisAdet/oran;

        System.out.print(net);



        int sinifMevcudu=18;
        int hakem=1;
        int oyuncuSayisi=14;

        int oyunDisiKalan=sinifMevcudu-oyuncuSayisi-hakem;

        System.out.print(oyunDisiKalan);


       */

        // kodları yazarken önemli olan
        // tekrar kullanılabirlik(reusability)

        int okulMevcudu=188;
        int hakem=1;
        int takimoyuncuSayisi=7;

        int oyunDisiKalan=okulMevcudu%(takimoyuncuSayisi*2+hakem);

        System.out.print(oyunDisiKalan);

    }

}
