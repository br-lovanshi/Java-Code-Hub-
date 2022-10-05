package Day15;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter the ingeger value");
        try{
            String str = sc.next();
            int ans = Integer.parseInt(str);
            System.out.println(ans*ans);
        }catch (NumberFormatException n ){
            System.out.println("Entered input is not a valid format for an integer.");
        }
        System.out.println("next statments...");
    }

}
