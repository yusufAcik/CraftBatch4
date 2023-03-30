package day12_SwitchCase;

public class C01_Summary {

    public static void main(String[] args) {

        System.out.println("A");
        if((!(5>10)&&true)&&false){
            System.out.println("B");
            // if bloğunun içinde tanımlanan değişken
            // sadece burada geçerlidir
            // dışarda aynı adla başka değişken tanımlanabilir
        }else if(true){
            System.out.println("C");
        }else if(true){
            System.out.println("D");
        }
        System.out.println("E");
    }
}
