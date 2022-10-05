package ExceptionHandeling;

import java.io.IOException;

public class TrhoExceptions {

    public  static void valiDate(int age ) throws IOException{
        if (age < 18) {

            throw new IOException("fuck child hai tu");
        }
        else {
            System.out.println("you can vote BRO !");
        }


    }

    public static void main(String[] args) {

        try {
            valiDate(17);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("continue... ");
    }
}
