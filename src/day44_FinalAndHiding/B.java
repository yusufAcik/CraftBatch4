package day44_FinalAndHiding;

public class B extends  A{

    int b=10;

    static  {
        System.out.println("B statik metodu çalıştı.");
    }

    {
        System.out.println("B instance metodu çalıştı.");
    }

    public B(){
        System.out.println("B constructor ı çalıştı.");
    }
}
