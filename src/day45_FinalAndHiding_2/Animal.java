package day45_FinalAndHiding_2;

public abstract class Animal extends Canlilar {  // hem bu class tan obje oluşturulamasın
                                // hem de diğer class lar bu classı extend edebilsin

    // extend ettiği üst classın zorunlu metodunu içermek zorunda değil.
    // çünkü kendisi de abstract klass
    // bu görevi kendi alt sınıflarına havale edebilir
    // ancak kendisi bu metodu içerirse alt sınıflar için zorunluluk kalkar

  //  private Animal(){}  // Animal clasından obje oluşturulmasını engelledik
                        // boş cons u private yaptığımız için diğer classlar
                        // Animal class ını extend edemez

    public abstract void konus();  // Animal clasını extend eden tüm classları
                                   // konus() metodu içermeye zorladık
                                   // abstract metodlarda body zorunlu değil
                                   // abstract metodlar final,private olamaz
                                    // çünkü değişmek zorunda

    // constructor şartı da getirip belirli parametreleri zorunlu kılabiliriz

}
