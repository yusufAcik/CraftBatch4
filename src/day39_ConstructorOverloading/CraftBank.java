package day39_ConstructorOverloading;

import java.util.Random;

public class CraftBank {

    Random rm=new Random();


    public int customerId;
    public String customerFullName;
    public boolean isSms;
    public double customerAccount;
    public String customerToken;

    public CraftBank (int customerId,String customerFullName,boolean isSms){
        this.customerId=customerId;
        this.customerFullName=customerFullName;
        this.isSms=isSms;
        this.customerAccount=0;
        this.customerToken=customerId+customerFullName.substring(0,2)+(1000+rm.nextInt(8999));

    }

    public double  addMoney (CraftBank customer,double money){
        return customerAccount+=money;
    }

    public String toString(){
        return "Customer{"+
                " customerId = '"+customerId+
                "', customerFullName = '"+customerFullName+
                "', isSms = '"+isSms+
                "', customerAccount = '"+customerAccount+
                "', customerToken = '"+customerToken+"'}";

    }

}
