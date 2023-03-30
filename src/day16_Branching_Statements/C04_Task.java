package day16_Branching_Statements;

import java.util.Scanner;

public class C04_Task {
    public static void main(String[] args) {

        //   Banka menüsü oluşturun 1 para ekle 2 hesabımı gör
        //   3 para çek 4 çıkış  (money=2000)
        //  while işleme devam etmek için 1 e basın
        //  bir üst menü için 2 basın kart iade 3

        Scanner scan = new Scanner(System.in);
        double money=2000;

       ustMenu: while(true){
            System.out.println("1-Para Ekle, 2- Hesabımı Gör, 3- Para Çek, 4- Çıkış");
            int tercih = scan.nextInt();
            if (tercih==1){
              paraYatirma:  while (true){
                    System.out.println("Eklemek istediğiniz para miktarı");
                    double artiMoney = scan.nextDouble();
                    System.out.println("işlem başarılı. bakiyeniz ="+(money+artiMoney));
                    money+=artiMoney;
                    System.out.println("üst menü için 0, tekrak para eklemek için 1, çıkış için 2");
                    int tercih2 = scan.nextInt();
                    if (tercih2==0){
                        break;
                    }else if(tercih2==1){
                        continue paraYatirma;
                    }else {
                        System.out.println("Güvenli çıkış yapıldı.");
                        break ustMenu;
                    }
                }
            } else if (tercih==2){
               bakiyeGorme: while (true){
                    System.out.println("bakiyeniz: "+money);
                    System.out.println("üst menü için 0, tekrak bakiye görmek için 1, çıkış için 2");
                    int tercih2 = scan.nextInt();
                    if (tercih2==0){
                        break;
                    }else if(tercih2==1){
                        continue bakiyeGorme;
                    }else {
                        System.out.println("Güvenli çıkış yapıldı.");
                        break ustMenu;
                    }
                }
            }else if(tercih==3){
               paraCekme: while(true){
                    System.out.println("çekmek istediğiniz para miktarını giriniz: ");
                    double eksiMoney = scan.nextDouble();
                    if(money<eksiMoney){
                        System.out.println("yetersiz bakiye");
                        continue ustMenu;
                    }
                    System.out.println("İşlem başarılı. bakiyeniz: "+(money-eksiMoney));
                    money-=eksiMoney;
                    System.out.println("üst menü için 0, tekrak para çekmek için 1, çıkış için 2");
                    int tercih2 = scan.nextInt();
                    if (tercih2==0){
                        break;
                    }else if(tercih2==1){
                        continue paraCekme;
                    }else {
                        System.out.println("Güvenli çıkış yapıldı.");
                        break ustMenu;
                    }
                }
            }else {
                System.out.println("güvenli çıkış yapıldı");
                break ustMenu;
            }
        }
    }
}
