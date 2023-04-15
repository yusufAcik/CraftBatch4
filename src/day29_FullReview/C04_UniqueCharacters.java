package day29_FullReview;

public class C04_UniqueCharacters {

    public static void main(String[] args) {
        System.out.println("uniqueCharacters(\"aaabbcdefg\") = " + uniqueCharacters("aaabbcdefg"));
        System.out.println("uniqueCharacters2(\"aaabbcdefsgaş\") = " + uniqueCharacters2("aaabbcdefsgaş"));
    }

    public static String uniqueCharacters (String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        return result;
    }

    public static String uniqueCharacters2 (String str){
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                result+=ch;
            }
        }
        return result;
    }


    // Write a method that can return the unique characters from a String
    //             Ex:   input: AABCCD
    //                output:BD
    //Hint: You will need indexOf() and lastIndexOf()
    // if the first and last index numbers of the character are same,
    // then it's unique
}
