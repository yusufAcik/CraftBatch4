package day12_SwitchCase;

import java.util.Scanner;

public class C10_Motel {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen motelimizi tanımak için 1-2-3 bir kat numarası  ve oda adı girin:");
        int kat = scan.nextInt();


            switch (kat) {
                case 1:
                    System.out.println("1. katta Resepsion, Güvenlik ve Oda hizmetler vardır. Lütfen bilgi almak istediğiniz odayı giriniz(ör:R,G,O):");
                    String oda = scan.next();
                    switch (oda) {
                        case "R" :
                            System.out.println("tüm işlemleriniz için bekleriz");
                            break;
                        case "G" :
                            System.out.println("profosyonel bir hizmettir");
                            break;
                        case "O" :
                            System.out.println("temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz");
                            break;
                        default:
                            System.out.println("hatalı giriş");
                    }
                    break;
                case 2:
                    System.out.println("2. katta Yemekhane, Dinlenme salonu ve Room1,Room2 vardır. Lütfen bilgi almak istediğiniz odayı giriniz(ör:Y,D,R1,R2):");
                    String oda2 = scan.next();
                    switch (oda2) {
                        case "Y" :
                            System.out.println("Kahvaltı 08-11\n"+"Öğle yemeği 12-15\n"+"Akşam yemeği 18-21");
                            break;
                        case "D" :
                            System.out.println("24 saat çay servisi ile hizmetinizdedir");
                            break;
                        case "R1" :
                            System.out.println("ekonomik oda");
                            break;
                        case "R2" :
                            System.out.println("ekonomik oda.");
                            break;
                        default:
                            System.out.println("hatalı giriş");

                    }
                    break;
                case 3:
                    System.out.println("3.katta Room3,Room4,Room5,Room6 vardır.Lütfen bilgi almak istediğiniz odayı giriniz(ör:R3,R4,R5,R6):");
                    String oda3 = scan.next();
                    switch (oda3) {
                        case "R3" :
                            System.out.println("standart oda");
                            break;
                        case "R4" :
                            System.out.println("standart oda.");
                            break;
                        case "R5" :
                            System.out.println("özel oda");
                            break;
                        case "R6" :
                            System.out.println("özel oda.");
                            break;
                        default:
                            System.out.println("hatalı giriş");

                    }
                    break;
                default:
                    System.out.println("hatalı giriş");
            }


    }

}
