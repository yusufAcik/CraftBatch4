package day25_Summary;

public class Math2 {

    public static int sum (int x, int y){
        return x+y;
    }
    public static int sum (int x, int y, int z){
        return x+y+z;
    }
    public static int pow(int taban, int us){
        if(taban==0){
            return 0;
        }
        int result=1;
        for (int i = 0; i < us; i++) {
            result*=taban;
        }
        return result;
    }

    // buradaki methodlar static olmazsa bunları kullanabilmek
    // için dışarıdaki bir mainde
    // bu classtan bir obje oluşturmak gerekir

    public static int min(int x, int y){
        if(x<y) {
            return x;
        }else return y;
    }

    public static int max(int x, int y){
        if(x>y){
            return x;}
            else return y;
    }

    int deger;
    public int multiple(int x, int y){
        return x*y;
    }
}
