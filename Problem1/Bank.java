package Problem1;

import java.util.Scanner;

public class Bank {
    String branchName;
    String IFCCode;
   public void displayDetails(){
       System.out.println("Branch name: " + branchName);
       System.out.println("IFC: "  + IFCCode);
   }

}
class AxisBank extends Bank {
    double rateOfIntrest = 7;

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("rateOf intrest is : "  + rateOfIntrest);

    }
    void  getCreditCard(){
        System.out.println("Get the Credit Card from the Axis bank");
    }
}
class ICICIBank extends Bank{

    double rateOfIntrest =9 ;
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("rateOf intrest is : "  + rateOfIntrest);
    }
}
class Demo {
    public static Bank getBank(String bank){
String a = "axis";
        if(a.equals(bank)){
            Bank b1 = new AxisBank();
            b1.branchName = "Axix bank Indore";
            b1.IFCCode = "34646";

return b1;
        }
        else if( bank.equals("icic")){
            Bank b2 = new ICICIBank();
            b2.branchName =  "icic bank ";
            b2.IFCCode = "135446";
            return b2;

        }
        else  return  null;
    }

    public static void main(String[] args) {
//        Bank b = new Bank();


//        Demo d = new Demo();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bank name");
        String name = sc.next();
       Bank ans =  getBank(name);
       if(ans instanceof  AxisBank){
        ((AxisBank) ans).getCreditCard();

       }
       ans.displayDetails();
    }

}