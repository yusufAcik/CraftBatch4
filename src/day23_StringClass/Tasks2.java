package day23_StringClass;

import java.util.Scanner;

public class Tasks2 {

    public static void main(String[] args) {

        String s = "     hello java world     ";
        System.out.println(trimTheString(s));

        System.out.println("-------------------------");

        System.out.println("18/10/2022 20:50:55".replace("/", "").replace(" ", "").replace(":", ""));

        System.out.println("----------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("1. Kelime: ");
        String word1 = scan.nextLine();
        System.out.println("2. Kelime: ");
        String word2 = scan.nextLine();
        String ilkHarf= word1.trim().substring(0,1);


        if(word2.contains(ilkHarf)){
            System.out.println(word2.indexOf(ilkHarf));
        }




}
    public static String trimTheString(String str){
        return str.trim();
    }
}
// Bir method yazın ve verilen string in önünde ve arkasında
//boşluk varsa boşlukları alıp geri döndürsün.

// 18/10/2022 20:50:55 tarih bildirimini tarih damgasına
//döndürün 18102019145055

// Kullanıcıdan 2 kelime yazmasını isteyin ilk kelimenin baş harfi
//2. kelimede varsa index ini alın.