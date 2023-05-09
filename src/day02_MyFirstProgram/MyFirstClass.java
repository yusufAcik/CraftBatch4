package day02_MyFirstProgram;

import day43_InheritanceAndAccessKeywords.Daire;

public class MyFirstClass extends Daire {
    public static void main(String[] args){

        System.out.println("Merhaba");
        System.out.print("dünya");
        System.out.println();
        System.out.println("Bugün");

        Daire daire1=new Daire();
      //  System.out.println(daire1.degisken);


    }
    void metod(){
        System.out.println("degisken = " + degisken);
    }
}
