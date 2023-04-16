package day30_Review;

import java.util.Scanner;

public class C02_SwitchSeasons {

 public static void main(String[]args){

     Scanner scan = new Scanner(System.in);
     System.out.println("please enter month number: ");
     int monthNum=scan.nextInt();
     System.out.println("whichSeason("+monthNum+") = " + whichSeason(monthNum));
 }


    public static String whichSeason (int monthNum){
        String season="";
        switch (monthNum){
            case 1,2,12: season="Winter";break;
            case 3,4,5: season="Spring";break;
            case 6,7,8: season="Summer";break;
            case 9,10,11: season="Autumn";
            default:season="yanlış giriş";
        }
        return season;
    }
    // Write a method that takes the month number from the user and returns the season.

}
