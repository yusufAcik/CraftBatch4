package day37_Array_List;

import java.util.ArrayList;

public class C03_ArrayList3 {
    
     
    //5,10,15,15,20,25,25,100,100,500 rakamlarını listOfNums isimli
    // bir ArrayListe atın ve
   // printListNumbers(listOfNums); methodu ile yazdıralım.

    public static void main(String[] args) {
        ArrayList<Integer> listOfNums=new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(500);

        printListOfNumbers(listOfNums);
        System.out.println();
        System.out.println(sum(listOfNums));
        System.out.println();
        System.out.println(duplicate(listOfNums));
        System.out.println();
        System.out.println(squared(listOfNums));


    }
    
    public static void printListOfNumbers (ArrayList arrList){
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i)+" ");
        }
    }
    // sum(listOfNums); methodu ile de toplam değeri döndürelim

    public static int sum(ArrayList<Integer> arrList){
        // return edebilmek için arraylist in tipini belirtmek gerekir
        // eskiden arraylistler her tipten veri alabilirken
        // artık tür belirtip o tipten veri giriyoruz
        // eski tip arraylistler de kullanımda ancak hatalara sebep olur
        int result=0;
        for (int i = 0; i < arrList.size(); i++) {
            result+=arrList.get(i);
        }
        return result;
    }

    // duplicate(listOfNums); methodu ile de değerleri dublicate
    //edip list i döndürelim

    public static ArrayList<Integer> duplicate (ArrayList<Integer> arrList){
        ArrayList<Integer> arrListYeni=new ArrayList<>();
        for (int i = 0; i < arrList.size(); i++) {
            arrListYeni.add(arrList.get(i));
            arrListYeni.add(arrList.get(i));
        }
        return arrListYeni;
    }

    // squared(listOfNums); methodu ile de değerleri kendi ile
    //çarpıp list i döndürün.

    public static ArrayList<Integer> squared (ArrayList<Integer> arrList){
        ArrayList<Integer> arrListYeni=new ArrayList<>();
        for (int i = 0; i < arrList.size(); i++) {
            arrListYeni.add(arrList.get(i)*arrList.get(i));
        }
        return arrListYeni;
    }


}
