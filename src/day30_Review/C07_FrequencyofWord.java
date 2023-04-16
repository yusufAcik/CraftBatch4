package day30_Review;

public class C07_FrequencyofWord {

    public static void main(String[] args) {
        System.out.println(frequencyOfWord("JavaJavaJavaPython", "Java"));
    }

    public static int frequencyOfWord (String sentence, String word){
        int frequency=0;

        while (sentence.contains(word)){
           sentence= sentence.replaceFirst(word,"");
            frequency++;
        }

        return frequency;
    }
}
// metinde geçen kelime sayısı