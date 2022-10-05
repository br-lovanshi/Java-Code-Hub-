package Day16;

import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidCountryException extends Exception {
    public InvalidCountryException (String msg){
        super(msg);
    }
    public InvalidCountryException(){

    }
}
public class UserRegstration {

    public void registerUser(String userName,String countryName) throws InvalidCountryException{

        if(countryName.equals("india") | countryName.equals("India") | countryName.equals("INDIA")){
 System.out.println("User registration done successfully");
        }

//        if(Pattern.matches("[india]",countryName)){
//            System.out.println("User registration done successfully");
//        }
        else {
            InvalidCountryException ine = new InvalidCountryException("User Outside India cannot be registered");
            throw ine ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name");
        String userName = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter your country");
        String userCountry = sc.nextLine();

        UserRegstration uae = new UserRegstration();
        try {
            uae.registerUser(userName,userCountry);
        }catch (InvalidCountryException inv) {
            System.out.println(inv.getMessage());
//            inv.getMessage();
        }
    }
}

