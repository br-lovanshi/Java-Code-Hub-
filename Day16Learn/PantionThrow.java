package Day16Learn;

public class PantionThrow {
    public static  int  getPention(int age , int salary) throws ArithmeticException{
        int pan = 0;
        if(age > 40 && age < 100 ){
            pan = (age*salary)/100;
        }else {
//            ArithmeticException ae = new ArithmeticException("invalid age ");
//            throw ae;
            throw new ArithmeticException("invalid");
        }
        return pan;
    }

    public static void main(String[] args) {
      try {
          int ans =  getPention(0,4999999);
          System.out.println(ans);
      }catch (ArithmeticException a){
          System.out.println(a.getMessage());
      }
        System.out.println("newxt");

    }
}
