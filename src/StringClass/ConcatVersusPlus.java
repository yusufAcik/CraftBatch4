package StringClass;

public class ConcatVersusPlus {
    public static void main(String[] args) {
        String s1="Kraft";
        String s2="Technologie";

        System.out.println("merhaba".concat("dünya"));
        System.out.println(s1+s2+5+3); // KraftTechnologie53
        System.out.println(s1.concat(s2).concat("5")); // int concat edemeyiz
                                        // sadece "" içinde kabul eder

        // Stringlerin eşitliği == yerine equals ya da equalsIgnoreCase ile ölçülür



    }
}
