package day39_ConstructorOverloading;

public class CraftBankObject {

    public static void main(String[] args) {

        CraftBank customer1=new CraftBank(12334,"Ali Veli",true);

        System.out.println("customer1 = " + customer1);
        customer1.addMoney(customer1,34000);
        System.out.println("customer1.customerAccount = " + customer1.customerAccount);
        System.out.println("customer1 = " + customer1);

    }
}
