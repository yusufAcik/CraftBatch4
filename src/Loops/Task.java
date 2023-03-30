package Loops;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        // Girilen 1vize(%20), 2vize(%20)
        // ve final(%60) notunu okuyarak
        // ortalamayı bulunuz
        //ortalama;
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.


        Scanner scan = new Scanner(System.in);
        System.out.println("1. vize notunu giriniz: ");
        double vize1 = scan.nextDouble();
        System.out.println("2. vize notunu giriniz: ");
        double vize2 = scan.nextDouble();
        System.out.println("Final notunu giriniz: ");
        double finalNotu = scan.nextDouble();

        double ort = ((vize1*2)+(vize2*2)+(finalNotu*6))/10;
        System.out.println("ortalama "+ort);
        if (ort<40){
            System.out.println("F");
        }else if (ort<60){
            System.out.println("E");
        }else if (ort<70){
            System.out.println("D");
        }else if (ort<80){
            System.out.println("C");
        }else if (ort<90){
            System.out.println("B");
        }else{
            System.out.println("A");
        }


        String not=(ort>=90) ? "A" : (ort>=80) ? "B" :
                (ort>=70) ? "C" : (ort>=60) ? "D" :
                 (ort>=40) ? "E" : (0<=ort&&ort<40) ? "F" : "Invalid Note";
        System.out.println("\"not\" = " +not);
    }
}
