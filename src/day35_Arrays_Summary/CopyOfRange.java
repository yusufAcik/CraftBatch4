package day35_Arrays_Summary;

import java.util.Arrays;

public class CopyOfRange {

    public static void main(String[] args) {

        String [] strArray={"ali","ata","bak"};

       /* String [] yeniArray=new String[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            yeniArray[i]=strArray[i];
        }
        */

        String[]yeniArray= Arrays.copyOfRange(strArray,0,strArray.length);
    }

}
