package day29_FullReview;

public class C05_FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println("frequencyOfChar(\"aaabbbcccddd\",'a') = " + frequencyOfChar("aaabbbcccddd", 'a'));
    }

    public static int frequencyOfChar (String str, char ch){
        int result=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                result++;
            }
        }
        return result;
    }

    ///Write a method that can return the frequency of a char from a String
    //              Ex:  str = "AAABBBC" ch = 'A'
    //            Output:3/
    //
}
