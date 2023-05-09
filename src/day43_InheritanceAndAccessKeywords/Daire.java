package day43_InheritanceAndAccessKeywords;

public class Daire extends  Sekiller {

    protected int degisken=10;  // public yerine private yaparsak
                             // sadece bu class içinde kullanabiliriz
                             // default yaparsak sadece package içinden ulaşabiliriz
                             // protected aynı package ve diğer package lerdeki
                            // extended classlardan ulaşılabilir

    public int alanHesapla(){
        return (int)(super.yariCap*pi*yariCap); // sekillere extend olduğu için
                                                // super kullanmasak da olur
    }

}
