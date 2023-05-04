package day39_ConstructorOverloading;

public class Pencil {

    public String color;
    public double length;
    public boolean haveEraser;

    public Pencil(){

    }
    public Pencil(String color,double length){
        this.color=color;
        this.length=length;
    }

    public Pencil(String color, double length,boolean haveEraser){
        this(color, length);
        this.haveEraser=haveEraser;
    }

    public String toString(){
        return "Pencil{"+
                " color = '"+color+
                "', length = '"+length+
                "', haveEraser = '"+haveEraser+"'}";

    }
}
