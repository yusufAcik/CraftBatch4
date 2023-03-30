package day07_Aritmetic_Operators;

public class Aritmetic_Operators_3 {
    public static void main(String[] args){

       /* int dk=4500;
        int s= dk/60;
        System.out.println("s = " + s);


    // 4321dk saat dk ve saniye
        // çevrildikten sonra saniyeyi ekrana yazdırın

        int sn=4321;
        System.out.println(4321%60);
*/
        // 31502 saniye kaç saat kaç dk kaç sn dir

        int toplamSaniye=31502;
        int saat=toplamSaniye/60/60;
        //int dk=(toplamSaniye-saat*3600)/60;
        int dk=(toplamSaniye%3600)/60;
        int sn=toplamSaniye%60;

        System.out.print(toplamSaniye+" saniye "+saat+" saat "+dk+" dakika "+sn+" saniyedir.");



    }

}
