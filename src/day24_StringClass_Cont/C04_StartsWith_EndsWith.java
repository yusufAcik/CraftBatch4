package day24_StringClass_Cont;

public class C04_StartsWith_EndsWith {

    public static void main(String[] args) {
        String str ="Java is cool";
        str.startsWith("J"); // true
        str.startsWith("Ja"); // true
        str.startsWith("Java"); // true
        str.startsWith("java"); // false
        str.startsWith("Java is cool"); // true
        str.startsWith(str); // true
        str.startsWith(""); // true
        str.startsWith(" "); // false

        System.out.println("-------------------------");

        str.endsWith("l"); // true
        str.endsWith("ol"); // true
        str.endsWith("ool"); // true
        str.endsWith("cool"); // true
        str.endsWith(str); // true






    }
}
