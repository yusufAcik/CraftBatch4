package day16_Branching_Statements;

public class Task2 {
    public static void main(String[] args) {

        // 0-100 arasını yazdıralım ama 30-50 olmasın

        for (int i = 0; i < 101; i++) {

            if(30<=i&&i<=50){
                continue;
            }
            System.out.print(i+" ");

        }
// 0-100 arasını yazdıralım ama 13 e bölünenler olmasın
        System.out.println();
        System.out.println("------------");

        for (int j = 0; j < 101; j++) {
            if(j%13==0){
                continue;
            }
            System.out.print(j+" ");
        }
    }
}
