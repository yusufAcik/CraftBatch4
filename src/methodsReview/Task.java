package methodsReview;

public class Task {


    public static void main(String[] args) {

        System.out.println(isAnagram("Nefes", "Enfes"));

        System.out.println(isAnagram2("Zehraa", "Ezzhar"));

    }

    public static boolean isAnagram (String str1, String str2){
        boolean result=false;
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if (str1.length()!=str2.length()) result=false;

            for (int i = 0; i <str1.length(); i++) {

            if (str2.contains(str1.charAt(i)+"")){

            str2=str2.replaceFirst(str1.charAt(i)+"","");
        }
            }
            if(str2.isEmpty()) result=true;
            else result=false;

        return result;
    }

    public static boolean isAnagram2 (String str1, String str2){

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if (str1.length()!=str2.length()) return false;

        for (int i = 0; i <str1.length(); i++) {
            int index=str2.indexOf(str1.charAt(i));

           if(index==-1) return false;

            str2=str2.substring(0,index)+(str2.substring(index+1));
        }
        return true;
    }
    // iki kelime alın aynı harflerden oluşuyor
    // ve aynı karakter sayısına sahipse true dönsün

}
