package day29_FullReview;

public class C03_RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println("removeCharacters(\"aaabbbcccdefg\") = " + removeCharacters("aaabbbcccdefg"));
        System.out.println("removeDuplicates(\"aaaaabbbbbcccccdddddeeeeffghı\") = " + removeDuplicates("aaaaabbbbbcccccdddddeeeeffghı"));
    }

    public static String removeCharacters (String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            result+=str.charAt(i);
            str=str.replace(str.charAt(i),' ');
        }
        return result.replace(" ","");
    }

    public static String removeDuplicates(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            String ch=str.charAt(i)+"";  // ch String olarak ifade edilmiş oldu
            if (!result.contains(ch)){  // eğer result stringinde ch karakteri yoksa
                result+=ch;            // char ı Stringe ekle
            }
        }
        return result;
    }

}

// /Write a method that can remove the duplicated characters from a String

//       Ex:        input:      AABBCCBC
//             Output:        ABC
//
// Hint: You can add each character of the string into another String
// Condition: the character is not contained in the other String yet before you are adding/
