package day55_MapAndFinish;

import java.util.*;

public class C04_MapExample {

    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci("yusuf","kara",15);
        Ogrenci ogrenci1 = new Ogrenci("ali","çalışkan",16);
        Ogrenci ogrenci2 = new Ogrenci("veli","akıllı",17);

        List<Ogrenci> list=new ArrayList<>();
        list.add(ogrenci);
        list.add(ogrenci1);
        list.add(ogrenci2);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNo()==17){
                list.get(i).dersEkle("Almanca");
                break; // aradığı öğrenciyi bulunca çıksın;
                        // programı yormasın
            }
        }
        System.out.println(ogrenci2.getDersler());


        Map<Integer,Ogrenci> map = new HashMap<>();

        map.put(ogrenci.getNo(),ogrenci);
        map.put(ogrenci1.getNo(),ogrenci1);
        map.put(ogrenci2.getNo(),ogrenci2);

        map.get(15).dersEkle("Almanca");
        map.get(16).dersEkle("İngilizce");

        System.out.println("map.get(15).getIsim() = " + map.get(15).getIsim());
        System.out.println("map.get(16).getSoyIsim() = " + map.get(16).getSoyIsim());
        System.out.println("map.get(17).getDersler() = " + map.get(17).getDersler());

        System.out.println("map.get(15).toString() = " + map.get(15).toString());

        System.out.println("---------------------");

        Map<Integer,String> yeniMap = new HashMap<>();
        yeniMap.put(12,"yusuf");
        yeniMap.put(2,"mehmet");

        Map<String,Map<Integer,String>> map1=new TreeMap<>();
        // iç içe map modeli
        map1.put("123",yeniMap);
        System.out.println("map1.get(\"123\").get(12).equals(\"yusuf\") = " + map1.get("123").get(12).equals("yusuf"));


    }
}
