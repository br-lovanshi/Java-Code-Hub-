package ExceptionHandeling;

import java.security.spec.RSAOtherPrimeInfo;

public class ErroOne {
    public static void main(String[] args) {
//       ArithmeticException
        try {
            int d = 100 / 0;
            System.out.println(d);
        }
        catch ( ArithmeticException e ){
            System.out.println(e);
        }
        System.out.println("hwllo bro");
        int a = 20;
        int b = 39;
        int sum = a+b;
        System.out.println(sum);

//NullPointerException
   try     {
            String s = null;
            System.out.println(s.length());
        }
   catch (NullPointerException n){
       System.out.println(n);
   }
        System.out.println("CHILL BRO");
        System.out.println(10-9);

//        NumberFormatException
        try{
            int s1 =939;
            int i = Integer.parseInt(String.valueOf(s1));
            System.out.println(i);
        }catch (NumberFormatException n ){
            System.out.println(n);
        }
        System.out.println("Sahi hai bro");

    }
}
