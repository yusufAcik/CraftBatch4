package mentoring05_Loops;

public class For_Loop {

    public static void main(String[] args) {

        for (int i=4; i>0;i--){
            System.out.println("Hi "+i);
        }
        System.out.println();

        // i genelde 0 dan başlatılır

        for (int j = 0; j <= 6; j++) {
            System.out.println("Day "+(j+1));

        }

        for (int k = 0; k <=6 ; k++) {
            System.out.println("Day "+(k+1));
            for (int l = 0; l <=9 ; l++) {
                System.out.println(" "+(l+9)+" - "+(l+10));
            }
        }

    }
}
