package ExceptionHandeling;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
    }
    public InsufficientFundsException(String msg) {
    super(msg);
    }
}
public class Exeption3 {

    String accountNumber;
    double balance;

    public void withdraw(double cash){
        balance = cash;
    }

    public double diposite(double cash) throws InsufficientFundsException {

        if(cash <= balance){
//            System.out.println("you cash is " + cash);o/
        return cash;
        }
        else {
            InsufficientFundsException ins = new InsufficientFundsException("launch ke baad ana SBI Hai");
            throw  ins;
        }
    }
    public static void main(String[] args) {
        Exeption3 obj = new Exeption3();
        obj.accountNumber = "12435464";
        obj.withdraw(34);
     try
     {
         double ans = obj.diposite(34);
         System.out.println(ans);
     }
     catch (InsufficientFundsException e ){
         System.out.println(e.getMessage());
     }



    }
}
