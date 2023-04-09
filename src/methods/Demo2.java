package methods;

class Computer {
    public void playMusic(){
        System.out.println("Music Playing");
    }
    public String getMeAPen(int cost){
        if(cost>=10)
            return "Pen";
        else
        return "Nothing";
    }
}


public class Demo2 {
    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.playMusic();
        System.out.println(obj.getMeAPen(0));
    }
}
