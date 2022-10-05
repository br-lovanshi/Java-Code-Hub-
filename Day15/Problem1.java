package Day15;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the para");
        String pera = sc.nextLine();
        Pattern p = Pattern.compile("[Jj][Aa][Vv][Aa]");
        int c= 0;
        Matcher m = p.matcher(pera);
        if(m.find()){
            c++;
            System.out.println(m.start()+ " ===== " + m.end() + " ===== " + m.group());

        }
        System.out.println("The no of occurrences: "+c);
    }




}
