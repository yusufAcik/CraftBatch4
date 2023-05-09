package day45_FinalAndHiding_2;

public class Daire extends Sekiller{

    double yaricap;
    @Override
    public double alanHesapla() {
        return Math.PI*yaricap*yaricap;
    }
}
