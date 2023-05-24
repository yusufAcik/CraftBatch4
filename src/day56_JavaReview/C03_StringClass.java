package day56_JavaReview;

public class C03_StringClass {
    public static void main(String[] args) {

        // String literal are shared in String Pool
        // String literal is faster than new keyword

        String str= "schoool";
        String str1= "schoool";
        String str2=new String("school");
        String str3=new String("school");

       // StringBuffer stringBuffer = "school";
       // StringBuilder stringBuilder = "schoool";  // String literal(String Pool)
                           // cannot be used in StringBuffer and StringBuilder

        str.toUpperCase(); // "SCHOOL" is new string object, have no reference;
                    // after this line eligible for garbage collection
        System.out.println("str = " + str); // output: schoool ->  strings are immutable

        String str4 = str1.toUpperCase();
        System.out.println("str4 = " + str4);

        StringBuffer stringBuffer = new StringBuffer("schoool");
        StringBuilder stringBuilder = new StringBuilder("schoool");

        str1.concat("garden"); // school garden
        System.out.println("str1 = " + str1);

        // StringBuilder and StringBuffer are mutable
        stringBuilder.append(" garden");
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuffer.append(" garden");
        System.out.println("stringBuffer = " + stringBuffer);

        System.out.println("stringBuilder.reverse() = " + stringBuilder.reverse());
        System.out.println("stringBuffer.reverse() = " + stringBuffer.reverse());


    }
}
