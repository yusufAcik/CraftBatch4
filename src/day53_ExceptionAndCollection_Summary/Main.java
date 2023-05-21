package day53_ExceptionAndCollection_Summary;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Insan yusuf = new Insan();
        // bu şekilde polymorphism kullanmayarak tüm metodlara erişiriz
        yusuf.egitim();
        yusuf.harclikVer();
        yusuf.ogutVer();
        yusuf.sinayYap();
        yusuf.yemekYe();
        yusuf.uyu();

        Ogretmen ali = new Insan();
        // polymorphism kullandığımızda
        // sadece istediğimiz clasın metodlarına erişiriz
        ali.egitim();
        ali.sinayYap();

        Baba mehmet = new Insan();
        mehmet.harclikVer();
        mehmet.ogutVer();

        List <String > list = new LinkedList<>();
        Deque<String > list1 = new LinkedList<>();
    }
}
