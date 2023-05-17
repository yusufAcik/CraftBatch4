package day50_Exception_Collection;

import day43_Task.Person;

import java.util.ArrayList;

public class C07_Collection_1 {

    public static void main(String[] args) {

        // Collection -> objelerin bir arada bulunduğu yapı
        // farklı türler; size sınırı yok
        // her yerde collection kullanılmaz (performans-kapasite problemi)
        // collectionlar primitive data type almaz
        // array ler hem primitive hem obje alır
        // Collection nesne tutma türleri
        // 1. List - liste halinde
        // 2. Queue - sıralı
        // 3. Set  - küme (her eleman en fazla 1 kez)

        // collection interface olduğu için polymorphism ile nesne üretilebilir

        /*      **** LIST INTERFACE ****
        * Duplicates are allowed (aynı nesneden birden fazla adet kabul eder)
        * verileri ekleme sırasına göre sıralı depolar

        */

        ArrayList<Person> arrayList=new ArrayList<>();

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);


        ArrayList<Integer> arrayList1=new ArrayList<>();

        arrayList1.add(25);
        arrayList1.add(35);

        System.out.println(arrayList1.size());
        System.out.println(arrayList1.contains(35));

        ArrayList<Integer> arrayList2=new ArrayList<>();

        arrayList2.add(45);
        arrayList2.add(55);
        arrayList2.add(55);

        arrayList1.addAll(arrayList2);  // istenen collection ın eklenip eklenmediğini boolean döndürür;

       // arrayList1.isEmpty();  // boş mu
       // arrayList1.clear();   // hepsini siler boşaltır
        arrayList1.retainAll(arrayList2);  // 1 in içinde bulunan 2 ye ait elemanlardan hepsini siler(tüm 45 leri ve tüm 55 leri)
        arrayList1.containsAll(arrayList2); // bir elemandan 2 de 2, 1 de 1 tane olsa bile true döndürür




    }
}
