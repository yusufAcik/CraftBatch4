package day17_Methods;

import java.util.Scanner;

public class C01_Bank_Question {

    public static void main(String[] args) {

        double money = 2000;
        Scanner scan = new Scanner(System.in);
        outerLoop:while (true){
            System.out.println("1. para ekle, 2. para çek, 3. bakiye, 4. çıkış");
            int tercih = scan.nextInt();
            switch (tercih){
                case 1 :
                    while (true){
                        System.out.println("eklemek istediğiniz para miktarı: ");
                        double para = scan.nextDouble();
                        money+=para;
                        System.out.println("üst menü 1, devam 2 ");
                        int tercih2 = scan.nextInt();
                        if (tercih2==1){
                            break;
                        }else if (tercih2==2){
                            continue;
                        }else {
                            System.out.println("hatalı işlem kart iade");
                            break outerLoop;
                        }
                    }
                    break;

                case 2 :
                    while (true){
                        System.out.println("çekmek istediğiniz para miktarı: ");
                        double para = scan.nextDouble();
                        if(para>money){
                            System.out.println("yetersiz bakiye");
                            break;
                        }
                        money-=para;
                        System.out.println("üst menü 1, devam 2 ");
                        int tercih2 = scan.nextInt();
                        if (tercih2==1){
                            break;
                        }else if (tercih2==2){
                            continue;
                        }else {
                            System.out.println("hatalı işlem kart iade");
                            break outerLoop;
                        }
                    }
                    break;

                case 3 :
                    System.out.println("bakiyeniz: "+money);
                    break;
                case 4:
                    break outerLoop;
                default:
                    System.out.println("hatalı işlem");
            }
        }
    }

}
