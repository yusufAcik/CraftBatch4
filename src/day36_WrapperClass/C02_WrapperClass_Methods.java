package day36_WrapperClass;

public class C02_WrapperClass_Methods {
    public static void main(String[] args) {

        // valueOf()  int ve string alır, çağrıldığı metoda göre değer oluşturur.

        String s="123";
        int x = Integer.valueOf(s);
        int y=x+5;
        System.out.println(y);

        // parseInt() -> parametre olarak string alır ve int e çevirir

        int z=Integer.parseInt("123");
        System.out.println(z);

        Integer t= Integer.valueOf("123");
        int m = t.intValue();
        System.out.println(m);

        String str="Bugün hava 25 derece";
        // hava sıcaklığı 10 derece daha artar ise hava sıcaklığı kaç derece olur?

        String[] strArray=str.split(" ");
        System.out.println("strArray[2] = " + strArray[2]);
        int result=Integer.parseInt(strArray[2])+10;
        System.out.println(result);

        System.out.println("-----------------");

        String str2="Bugün hava 40 derece;Bugün hava çok sıcak";
        // 40 derece ve üzeri ise "Bugün hava çok sıcak"
        // Altında ise "bugün hava mevsim normallerinde."

        String havaSicakligi=str2.split(" ")[2];
        System.out.println("havaSicakligi = " + havaSicakligi);

        int havaSicakligi2=Integer.parseInt(havaSicakligi);
        int a=havaSicakligi2+5;
        System.out.println(a);

        String expectedResult1="Bugün hava çok sıcak";
        String expectedResult2="Bugün hava mevsim normallerinde";
        String actualResult=str2.split(";")[1];

        if(havaSicakligi2>=40){
            System.out.println(expectedResult1.equalsIgnoreCase(actualResult));
        }else {
            System.out.println(expectedResult2.equalsIgnoreCase(actualResult));
        }

        // "Ali'nin doğum yılı 1996" ise 10 yıl sonra Ali kaç yaşında olur?
        // Ali 37 yaşında olur.

        String str3="Ali'nin doğum yılı 1996";
        String name=str3.split("'")[0];
        String [] str3Array=str3.split("'");
        String name1=str3Array[0];

        String [] str3ArrayYil=str3.split(" ");
        String yil=str3ArrayYil[str3ArrayYil.length-1];
        int onYilSonrakiYas=2023-Integer.parseInt(yil)+10;

        System.out.println(name+" "+onYilSonrakiYas+" yaşında olur.");




    }
}
