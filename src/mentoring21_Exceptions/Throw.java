package mentoring21_Exceptions;

class DataBaseException extends Exception
{
    public DataBaseException(String str){
super(str);
    }
}
public class Throw {

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1500);
        int i=27;
        int j=0;


        try { //
            j=25/i;
            if(j==0)
                throw new DataBaseException("That's the default output");
        }catch (ArithmeticException e){
            j=25/1;
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Something went wrong."+e);
        }
        System.out.println(j);

        Thread.sleep(4300);
    }
}
