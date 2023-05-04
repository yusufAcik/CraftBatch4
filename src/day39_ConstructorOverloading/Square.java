package day39_ConstructorOverloading;

public class Square {

    double sideLength;

    public Square (double sideLength){
        this.sideLength=sideLength;
    }

    public double calcArea(){
        return sideLength*sideLength;
    }

    public double calcPerimeter(){
        return sideLength*4;
    }

    public String toString(){
        return "Square{"+
                " sideLength = '"+sideLength+
                "', area = '"+calcArea()+
                "', perimeter = '"+calcPerimeter()+"'}";

    }
}
