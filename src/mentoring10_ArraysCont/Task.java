package mentoring10_ArraysCont;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

       // String tex="El olduk efendim velhasıl ziyan olduk
        // ziyadesiyle; Yazar: Turgut Uyar";
        //Bu cumlede gecen kelimeleri bir array olusturup
        // element olarak atayiniz
        //Olusan elementlerin icerisinden yazarin isminin
        // kisaltilmis halini yazdiriniz

        String str="El olduk efendim velhasıl ziyan olduk ziyadesiyle; Yazar: Turgut Uyar";

        str=str.replace(";","").replace(":","");
        System.out.println(str);
        String [] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        arr=Arrays.copyOfRange(arr,arr.length-2,arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println((arr[0].substring(0,1) + "." + arr[1].substring(0,1) + "."));


    }
}
