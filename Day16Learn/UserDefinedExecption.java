package Day16Learn;

public class UserDefinedExecption extends Exception{

    public UserDefinedExecption(String str){
        super(str);
    }
    public UserDefinedExecption(){

    }
}

class HaiKya {
    public void   drink(int age ) throws UserDefinedExecption {
        if(age > 18 ){
            System.out.println("You can dude !");
        }
        else {
            UserDefinedExecption ue = new UserDefinedExecption("Bhag BSDK");
            throw ue;
        }
    }

    public static void main(String[] args) throws UserDefinedExecption {
        HaiKya hk = new HaiKya();
      try {
          hk.drink(12);
      }catch (UserDefinedExecption ue ){
          System.out.println(ue.getMessage());
      }

    }
}