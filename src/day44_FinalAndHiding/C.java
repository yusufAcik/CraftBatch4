package day44_FinalAndHiding;

public class C extends B{
    int c=5;

    static  {
        System.out.println("C statik metodu çalıştı.");
    }

    {
        System.out.println("C instance metodu çalıştı.");
    }

    public C(){
        System.out.println("C constructor ı çalıştı.");
    }
}
