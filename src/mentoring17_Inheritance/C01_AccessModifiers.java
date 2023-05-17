package mentoring17_Inheritance;

public class C01_AccessModifiers {

    /*
    public      : her yerden ulaşılabilir.
    private     : normal şartlarda aynı klas içinde erişime açık.
                  ancak encapsulatin (getter setter ile)
                  diğer classlardan ulaşma imkanı sağlanır.
    default     : aynı package dan ulaşılabilir.
    protected   : farklı package dan **sadece extend edilerek** ulaşılabilir.

     */

    // Pillars of java - encapsulation,inheritance,abstraction,polymorphism
    // polymorphism ile interfaceden obje oluşturabiliriz

    /*
                *** final keyword *****
          1. değişken final ise   -  DEĞİŞTİRİLEMEZ (PI gibi)
          2. Clas final ise       -  INHERIT EDİLEMEZ -- kısırdır
          3. Metod final ise      -  OVERRIDE EDİLEMEZ
     */


    /*
                                 PUBLİC          PRİVATE     Protected           Default

    1. same class                 Yes              Yes          Yes             Yes

    2. same package               Yes             No
        subclass                  Yes             No          Yes             yes
        non subclass              Yes             No          Yes             yes

    3. different package          Yes             No
        subclass                  Yes             No          Yes             No
        non subclass              Yes             No          No              No

     */
}
