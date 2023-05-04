package day39_ConstructorOverloading;

public class Cat {

    String eyeColor;
    boolean isBreed;
    boolean isFat;
    boolean isPet;

    public Cat(String eyeColor){
        this.eyeColor=eyeColor;
    }
    public Cat (String eyeColor,boolean isBreed){
        this(eyeColor);
        this.isBreed=isBreed;
    }
    public Cat (String eyeColor,boolean isBreed,boolean isFat){
        this(eyeColor,isBreed);
        this.isFat=isFat;
    }

    public Cat (String eyeColor,boolean isBreed,boolean isFat,boolean isPet){
        this(eyeColor,isBreed,isFat);
        this.isPet=isPet;
    }

    public String toString(){
        return "Cat{"+
                " eyeColor = '"+eyeColor+
                "', isBreed = '"+isBreed+
                "', isFat = '"+isFat+
                "', isPet = '"+isPet+"'}";

    }

}
