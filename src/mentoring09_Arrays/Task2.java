package mentoring09_Arrays;

public class Task2 {
    public static void main(String[] args) {

        // array içinde Honda var mı

        String [] cars={"Toyota","Honda","BMW","Mercedes","Nissan"};

        boolean bl=false;

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equalsIgnoreCase("Honda")){
                bl=true;
            }
        }
        if(bl){
            System.out.println("Bu marka araç bulunmaktadır.");
        }else {
            System.out.println("Bu marka araç bulunmamaktadır.");
        }

        System.out.println("arraydeArama(cars,\"honda\") = " + arraydeArama(cars, "honda"));

        System.out.println("arraydeArama2(cars,\"tesla\") = " + arraydeArama2(cars, "tesla"));
    }

    public static boolean arraydeArama (String[]arr,String arananKelime){
        boolean bl=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(arananKelime)){
                bl=true;
            }
        }
        return bl;
    }

    // string döndüren versiyonu

    public static String arraydeArama2 (String[]arr,String arananKelime){
        String  result="";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(arananKelime)){
                result="Bu marka araç bulunmaktadır";
            }else {
                result="Bu marka araç bulunmamaktadır.";
            }
        }
        return result;
    }
}
