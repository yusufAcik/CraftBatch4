package day09_OperatorsCont;

import java.util.Scanner;
public class PhoneNumber {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println(" please enter country code ;");
        int countryCode = scan.nextInt();

        System.out.println(" please enter area code : ");
        int areaCode = scan.nextInt();

        System.out.println(" please enter local number : ");
        int localNumber = scan.nextInt();
        System.out.println(" your phone number is +("+countryCode+") "+areaCode+"-"+localNumber);



    }
}
