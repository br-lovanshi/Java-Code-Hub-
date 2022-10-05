package Day16;

class InsufficientFundsException extends Exception {

    InsufficientFundsException(String msg){
        super(msg);
    }
    InsufficientFundsException(){

    }
}
public class Account {
    String accountNumber;
    Double balance;

    void deposit( double amount){
        balance = amount;
    }
        double withdwra(double amount) throws InsufficientFundsException{
        if(amount < balance){
            return amount;
        }
        else {
            InsufficientFundsException ins = new InsufficientFundsException("Sorry your account have insufficient balance");
            throw  ins ;
        }

    }


}


class AccountDemo {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.accountNumber  = "1234567";
        ac.deposit(38550328905395830285903803d);
        try{
            double ans = ac.withdwra(1030945009848328503859038593850938590385038393448494944d);
            System.out.println("Here is your amount sir/ma'am  :" + ans );
        }catch ( InsufficientFundsException ins ){
            System.out.println(ins.getMessage());
        }
    }
}