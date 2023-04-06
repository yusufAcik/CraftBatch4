package day22_ClassAndObject_Memory;

public class JavaMemory {

    public static int variable(int x, int y){

        int z=x+y;
        return z;
    }

    public static void main(String[] args) {
        System.out.println(variable(5, 6));
       // System.out.println(z); // kendi alanı dışında hükmü olmadığı için
                                // z yi çağıramayız


        // == operatörü referansları karşılaştırır
        // equals() dataları karşılaştırır

    }

}
