package day54_LoopsAndMap;

import mentoring09_Arrays.ArraysDataTypes;

import java.util.*;

public class C01_Loops {

    public static void main(String[] args) {

        String [] arr={"Yusuf","Ahmet","Mehmet"};

        for (String str:arr) {
            System.out.println(str);
        }
        System.out.println("---------------");
        for(int i=0; i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }

        System.out.println("-------------------");

        Set set1 = new HashSet(); // en eski kullanım
        Set<Integer> set2 = new HashSet<Integer>(); // 2. nesil kullanım
        Set<Integer> set3 = new HashSet<>(); // güncel kullanım

        System.out.println("---------------");

        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(35);
        list.add(8);
        list.add(14);

        for (Integer sayi:list) {
            System.out.print(sayi+" ");
        }
        System.out.println("---------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

        System.out.println("-------------");
        // 25 ten küçük sayıları sil list i ekrana yazdır

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<25){
                list.remove(i);
                i--;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

        System.out.println();
        System.out.println("-----------------");

       Set<Integer> set = new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(8);
        set.add(14);

        for (Integer sayi : set) {
            System.out.print(sayi+" ");
        }
        // hash set i for i ile yazamayız
        // çünkü index no getiremeyiz
        System.out.println();

        // set içerisinde 25 ten küçük olanları silip seti ekrana yazdıralım
        // for i ile yapamayacağımız için for kullanıp yeni oluşturduğumuz bir setin
        // içine istediğimiz sayıları atarız

        Set<Integer> yeniSet=new HashSet<>();
        for (Integer sayi:set){
            if(sayi>=25){
                yeniSet.add(sayi);
            }
        }
        System.out.println(yeniSet);

        System.out.println("--*****--");

        // seti değiştirmeden aynı işlemi yapalım
        // for ile yapamayız o yüzden iterator kullanıyoruz
        // iterator = objeler arasında gezer önündeki objeyi gösterip sıradakine gider
        // iterator genelde while ile kullanılır
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer sayi = it.next();
            System.out.print(sayi+" ");
        }
        System.out.println("*********");


        Iterator<Integer> ite = set.iterator();


        while (ite.hasNext()){
            Integer sayi = ite.next();
            if(sayi<25){
                ite.remove();
            }
        }
        System.out.print(set);

        System.out.println();

        List<String> list5 = Arrays.asList("Yusuf","Ali","Veli");
        Iterator itr = list5.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
       // System.out.println(itr.next()); // hata verir
        System.out.println(itr.hasNext());

        System.out.println("-----------------");

        // forEach method kısa ve hızlı işlemlerde

        set.forEach(x-> System.out.println(x));
        list5.forEach(y-> System.out.println(y));
        List<Integer> list6 = new ArrayList<>();
        set.forEach(z-> list6.add(z));
        System.out.println(list6);

        /*
        Iterator ile forEach loop arasındaki farklar
        * iterator kullanırken iterotor objesi oluşturmak gerekir
            for each loop ta geçici değişken kullanılır
        * iterator kullanırken loop içindeki objeler kaldırılabilir
            foreach loop ta objeler kaldırılamaz
         */
    }
}
