package day19_Custommethods_Return;

import java.util.Locale;

public class C07_Initials {

    public static void main(String[] args) {
        System.out.println("initials(\"ahmet\",\"ozturk\") = " + initials("ahmet", "ozturk"));
    }

    //1. Create a method that can display the initials of the person.
    // initials(String firstName, String lastName)

    public static String initials(String firstName, String lastname){
        String result;
        result=firstName.charAt(0)+" - "+lastname.charAt(0);
        result=result.toUpperCase();
        return result;
    }
}
