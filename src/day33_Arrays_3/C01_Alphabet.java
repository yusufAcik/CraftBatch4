package day33_Arrays_3;

import java.util.Arrays;

public class C01_Alphabet {
    public static void main(String[] args) {

        char[] alphabet;
        alphabet=new char[26];

      //  alphabet[0]='Z';  //90
      //  alphabet[1]='Y';  //89
      //  alphabet[2]='X';  //88

        char ch='a';

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i]=ch;
            ch++;
        }


        System.out.println();

        System.out.println("Arrays.toString(alphabet) = " + Arrays.toString(alphabet));

        // In a char[] write all the alphabet in reversed order
    }
}
