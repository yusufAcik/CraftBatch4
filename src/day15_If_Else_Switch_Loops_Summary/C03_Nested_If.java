package day15_If_Else_Switch_Loops_Summary;

public class C03_Nested_If {

    public static void main(String[] args) {
        // alinin cebinde 100 tl ve zamanı varsa sinemaya gitsin
        // yoksa evde kalsın

        int aliPara = 220;
        boolean zaman = true;

      /*  if (aliPara>=100){
            if(zaman){
                System.out.println("sinemaya gidebilir");
            }else{
                System.out.println("parası var ama zamanı yok gidemez");
            }
        }else{
            System.out.println("parası yok gidemez");
        }
*/
        if(aliPara>=100&&zaman){
            System.out.println("sinemaya gidebilir");
        }else{
            System.out.println("sinemaya gidemez");
        }
    }
}
