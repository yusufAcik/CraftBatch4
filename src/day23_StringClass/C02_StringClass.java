package day23_StringClass;

public class C02_StringClass {
    public static void main(String[] args) {

        // length
        String programmingLanguage = "java"; // String pool içerisinde bir obje oluşturdu
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());

        programmingLanguage = "python"; // Stringler immutable, java yı işaret ediyordu,
                                        // String pool da yeni bir obje oluşturdu
                                        // o objenin içine phyton yazdı
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());

        System.out.println("------------------------");
        // TOUPPERCASE(),   tolowercase()

        System.out.println("programmingLanguage.toUpperCase() = " + programmingLanguage.toUpperCase()); // BÜYÜK HARFLERLE YAZAR
        System.out.println("programmingLanguage = " + programmingLanguage); // tekrar küçük harf yazar, çünkü stringler immutable

        System.out.println("------------------------");

        programmingLanguage=programmingLanguage.toUpperCase();
        System.out.println("programmingLanguage = " + programmingLanguage);  // şimdi büyük yazar, assign ettik heap memory de "PHYTON" oluşturdu

        System.out.println("programmingLanguage.toLowerCase() = " + programmingLanguage.toLowerCase()); // küçük yazar
        System.out.println("programmingLanguage = " + programmingLanguage); // büyük yazar

        System.out.println("------------------");

        // charAt()
        System.out.println("programmingLanguage.charAt(0) = " + programmingLanguage.charAt(0)); // P yazar
        System.out.println("programmingLanguage.charAt(5) = " + programmingLanguage.charAt(5)); // N yazar
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-1) = " +
                "" + programmingLanguage.charAt(programmingLanguage.length() - 1));
        //System.out.println("programmingLanguage.charAt(programmingLanguage.length()) = " +
          //      "" + programmingLanguage.charAt(programmingLanguage.length()));
            // bu şekilde yazarken java hata vermez ama sonucu bulamayınca hata verir

        System.out.println("programmingLanguage.charAt(2) = " + programmingLanguage.charAt(2)); // T
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-4) = "
                + programmingLanguage.charAt(programmingLanguage.length() - 4));    // T

        System.out.println("------------------------------");

        // concat()

        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.concat(\" Programlama Dili Java dan daha kolaydır.\") = "
                + programmingLanguage.concat(" Programlama Dili Java dan daha kolaydır."));

        System.out.println("---------------------------");

        programmingLanguage=programmingLanguage.concat(" Programlama Dili Java dan daha kolaydır.");
        System.out.println("programmingLanguage = " + programmingLanguage);

        System.out.println("-------------------------");

        // contains()
        System.out.println("programmingLanguage.contains(\"Dili\") = " + programmingLanguage.contains("Dili"));
        System.out.println("programmingLanguage.contains(\"python\") = " + programmingLanguage.contains("python"));
        System.out.println("programmingLanguage.contains(\"P\") = " + programmingLanguage.contains("P"));
        System.out.println("programmingLanguage.contains(\"W\") = " + programmingLanguage.contains("W"));
        System.out.println("programmingLanguage.contains(\" Dili J\") = " + programmingLanguage.contains(" Dili J"));

        System.out.println("----------------------");

        // trim() Stringin önündeki ve sonundaki boşlukları alır

        String s= "    Hello     World      ";
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s); // tekrar boşluklu yazdırır (stringler immutable)

        String trimedS = s.trim();
        System.out.println(trimedS);
        s = s.trim();

        System.out.println("---------------");


        // replace()

        System.out.println("s.replace(\"Hello\", \"Big Big\") = " + s.replace("Hello", "Big Big"));
        System.out.println("s.replace(\"Hel\",\"\") = " + s.replace("Hel", ""));

        System.out.println("----------------------");

        // indexOf
        System.out.println("s.indexOf(\"Hello\") = " + s.indexOf("Hello"));
        System.out.println("s.indexOf(\"Hell\") = " + s.indexOf("Hell"));
        System.out.println("s.indexOf(\"World\") = " + s.indexOf("World"));

    }
}
