package day57_JavaReview;

import java.util.Arrays; // regular import statement java.util -> package name; Arrays -> classname

import static java.util.Arrays.sort; // static import -> sort u Arrays. yazmadan direkt çağırabiliriz

import static java.lang.Math.PI;

public class C02_ImportStatements {

    public static void main(String[] args) {
        String [] group = {"Ali","Veli","Ahmet","Ayşe","Fatma"};
        Arrays.sort(group);
        System.out.println("Arrays.toString(group) = " + Arrays.toString(group));

        sort(group);

        System.out.println("PI = " + PI); // PI yi import ettiğimiz için direkt çağırabiliriz

        // RestAssured, HamcrestMatchers -> otomasyonda static import kullanılan bazı alanlar
    }
}
