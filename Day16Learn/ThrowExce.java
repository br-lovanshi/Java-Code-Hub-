package Day16Learn;

import java.io.IOException;

public class ThrowExce {
    public  static void validate(int age ) throws  IOException {
        if(age < 18){
            throw  new IOException("enter more then 18");
        }else {
            System.out.println("you are eligible for vote");
        }
    }

    public static void main(String[] args) {
       try {
            validate(13);
        } catch (IOException e) {
           e.printStackTrace();
       }
        System.out.println("rest of the code");
    }

}
