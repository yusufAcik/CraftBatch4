package day40_Encapsulation;


import day39_ConstructorOverloading.CraftBank;

import java.util.Random;
import java.util.Scanner;

public class KraftBank {

    Random rm=new Random();


    private int customerId;
    private String customerFullName;
    private boolean isSms;
    private double customerAccount;
    private String customerToken;

    public KraftBank (int customerId,String customerFullName,boolean isSms){
        this.customerId=customerId;
        this.customerFullName=customerFullName;
        this.isSms=isSms;
        customerAccount=0;
        customerToken=customerId+customerFullName.substring(0,2)+(1000+rm.nextInt(8999));

    }

    public int getCustomerId(){
        return customerId;
    }

    public String getCustomerFullName(){
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName){
        Scanner scan = new Scanner(System.in);
        System.out.println("getCustomerToken() = " + getCustomerToken());
        System.out.println("Token giriniz");
        String customerToken1 = scan.nextLine();
        if(customerToken1.equals(customerToken)){
            this.customerFullName=customerFullName;
        }else {
            System.err.println("invalid token");
        }
    }

    public boolean getIsSms(){
        return isSms;
    }

    public void setSms(boolean isSms){
        this.isSms=isSms;
    }

    public double getCustomerAccount(){
        return customerAccount;
    }

    public String getCustomerToken(){
        return customerToken;
    }

    public double  addMoney ( double money){
        return customerAccount+=money;
    }


}

class KraftBankObjects{

    public static void main(String[] args) {

        KraftBank customer1=new KraftBank(1234,"Ali Veli",true);
        System.out.println("customer1.getCustomerId() = " + customer1.getCustomerId());
        customer1.setSms(false);
        System.out.println("customer1.getIsSms() = " + customer1.getIsSms());
        System.out.println("customer1.getCustomerAccount() = " + customer1.getCustomerAccount());
        //System.out.println("customer1.getCustomerToken() = " + customer1.getCustomerToken());
        System.out.println("customer1.addMoney(2300) = " + customer1.addMoney(2300));
        customer1.setCustomerFullName("Ali Veli Kara");
        System.out.println("customer1.getCustomerFullName() = " + customer1.getCustomerFullName());
    }


}

