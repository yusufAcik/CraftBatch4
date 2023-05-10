package mentoring09_Arrays;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        // günler array i oluşturalım.
        // konsoldan index alıp günü yazdıralım

        String days [] = new String[7];
        days [0]="Monday";
        days [1]="Tuesday";
        days [2]="Wednesday";
        days [3]="Thursday";
        days [4]="Friday";
        days [5]="Saturday";
        days [6]="Sunday";

        Scanner scan = new Scanner(System.in);
        System.out.println("1 - 7 arası bir sayı giriniz. ");
        int tercih = scan.nextInt();

        switch (tercih){
            case 1:
                System.out.println(days[0]);
                break;
            case 2:
                System.out.println(days[1]);
                break;
            case 3:
                System.out.println(days[2]);
                break;
            case 4:
                System.out.println(days[3]);
                break;
            case 5:
                System.out.println(days[4]);
                break;
            case 6:
                System.out.println(days[5]);
                break;
            case 7:
                System.out.println(days[6]);
                break;
            default:
                System.out.println("Hatalı giriş.");
        }

        System.out.println(days[tercih-1]);

    }
}
