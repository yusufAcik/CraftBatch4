package mentoring21_Exceptions;

public class Demo {
    public static void main(String[] args) {

        int i=4;
        int j=0;

        String str=null;

        int [] nums = new int[5];

        try { // java, burası benim için kritik; burayı handle et
            j=25/i;  // i=0 için kritik ifade
               // java.lang.ArithmeticException: / by zero
            System.out.println("str.length() = " + str.length());
            System.out.println(nums[0]); // 0 verir
            System.out.println(nums[5]); // hata verir
        }catch (ArithmeticException e){
            System.out.println("Can not divide by zero. "+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Limitlerde bir değer giriniz. "+e);
        }catch (Exception e){
            System.out.println("Something went wrong."+e);
        }
        System.out.println(j);
    }
}
