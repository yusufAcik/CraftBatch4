package day38_Constructors;

public class C01_StrongPassword {

    public static void main(String[] args) {
        String password="WEwporksaopıfdoı039w48239750&/((";
        String password2="Ab12345";
        String password3="Ab12345-";

        System.out.println("isStrongPassword(password) = " + isStrongPassword(password));
        System.out.println("isStrongPassword(password2) = " + isStrongPassword(password2));
        System.out.println("isStrongPassword(password3) = " + isStrongPassword(password3));
    }


    public static boolean isStrongPassword(String password){
        // Password must be at least have 8 characters long,and should not contain space
      boolean r1=  password.length() >=8 && !password.contains(" ") ;
        //
      boolean r2 = false;
      boolean r3 = false;
      boolean r4 = false;
      boolean r5 = false;
              
              
             char [] chars = password.toCharArray();

        for (char eachChar : chars) {
            if(Character.isUpperCase(eachChar)){
                r2=true;
            } else if (Character.isLowerCase(eachChar)) {
                r3=true;
            } else if (Character.isDigit(eachChar)) {
                r4=true;
            }else {
                r5=true;
            }

        }
        boolean isStrongPassword= r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }

}

/*  Write a method that can verify if a password  is a strong password.
    Characteristics of strong password are:
    1.1 Password must be at least have 8 characters long, and should not contain space
    1.2 Password should at least contain one upper case letter
    1.3 Password should at least contain one lower case letter
    1.4 Password should at least contain a digit
    1.5 Password should at least contain one special characters

 */
