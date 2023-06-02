package mentoring22_CollectionAPI;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {


        Map<String,Integer> students = new HashMap<>();

        // add value
        students.put("Ayşe", 95);
        students.put("Hatice", 98);
        students.put("Emine", 92);
        students.put("Serkan", 98);
        students.put("Ayşe", 100); // key e ait value değiştirdik

        // tamamını yazdırdık
        System.out.println(students); //{Ayşe=95, Emine=92, Hatice=98, Serkan=98}

        // tek bir key e ait değeri getirelim
        System.out.println(students.get("Ayşe")); //100

        System.out.println(students.keySet()); // bütün keyleri alır [Ayşe, Emine, Hatice, Serkan]

        System.out.println(students.values());

        for (String key : students.keySet()){
            System.out.println(key+" : "+students.get(key));
        }


    }
}
