package StringClass;

public class StringMethods {

    public static void main(String[] args) {
        String s1="Kraft Technologie";

        // toUpperCase
        System.out.println(s1.toUpperCase()); //KRAFT TECHNOLOGİE

        // toLowerCase()
        String s2=s1.toLowerCase();
        System.out.println(s2); //kraft technologie

        // length()
        int i=s1.length();
        System.out.println(i);

        // isEmpty()
        String s3="";
        String s4=" ";
        System.out.println(s3.isEmpty()); // true
        System.out.println(s4.isEmpty()); // false


        // charAt()
        String s5="abcda";
        char c =s5.charAt(3);
        System.out.println(c); // d
        // System.out.println(s5.charAt(7)); // hata verir

        // indexOf()
        System.out.println(s5.indexOf('a')); // 0
        System.out.println(s5.lastIndexOf('a')); // 4
        System.out.println(s5.indexOf('f')); // -1

    }
}
