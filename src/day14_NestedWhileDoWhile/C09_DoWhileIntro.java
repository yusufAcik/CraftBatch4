package day14_NestedWhileDoWhile;

public class C09_DoWhileIntro {

    public static void main(String[] args) {

        // for, while, do While hepsi birbirinin yerine kullanılabilir

        boolean a = false; // true yaparsak hepsi sonsuz döngüye girer
        for (int i=0; a;){
            System.out.println("Hello"); // condition false olduğu için
                                        // konsola hiç bir şey yazmaz
        }

        System.out.println("--------------------------");


        while (a){
            System.out.println("hello");    // // condition false olduğu için
                                            // konsola hiç bir şey yazmaz
        }

        System.out.println("------------------------------");

        do{
            System.out.println("hello"); // 1 kez hello yazar
        }while(a);


    }
}
