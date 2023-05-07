package day42_StaticAndInheritage;

public class ChildClass extends ParentClass{

    String meslek;

    public ChildClass(String name,String meslek){
        super(name);  // parent class ta name zorunlu olduğu için
                      // burada da tanımlamak zorundayız
        this.meslek=meslek;
    }
}
