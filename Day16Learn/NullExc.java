package Day16Learn;

import java.util.InputMismatchException;

public class NullExc {
    public static void main(String[] args) {
        try
        {
            String  a = null;
            System.out.println(a.length());

        }catch (ArithmeticException |NullPointerException | InputMismatchException | ArrayIndexOutOfBoundsException e ){
            System.out.println(e);
        } catch (Exception e ){
            System.out.println("CHILL DUDE");
        }
    }
}
