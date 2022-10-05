package Day16;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inter two integer");
        int one =sc .nextInt();
        int two = sc.nextInt();

        try{
            int quetion = one/two;
            System.out.println("the quetion is : " +quetion);
        }
        catch (ArithmeticException ae ){
            System.out.println(ae.getMessage());
        }finally {
            System.out.println("finally will always executed");
        }
    }
}
