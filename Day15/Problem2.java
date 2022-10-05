package Day15;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Problem2 {
}

class Citizen {
   private String  name,
            aadharNumber,
            mobileNumber;

    public Citizen(String name, String aadharNumber, String mobileNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Problem2{" +
                "name='" + name + '\'' +
                ", aadharNumber='" + aadharNumber + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
class  Demo {

    public boolean validate(String name,String addhar,String num){


        boolean name1 = (Pattern.matches("[a-zA-Z]{3,8}",name));
        boolean addhar2 = (Pattern.matches("[0-9]{12}",addhar));
        boolean mobile = (Pattern.matches("[6789]{1}[0-9]{9}",num));

        return name1 && addhar2 && mobile;


        }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        Demo d = new Demo();


        System.out.println("addhar card ");
        String addhar = sc.next();
        System.out.println("mobile n.");
        String num = sc.next();

      boolean value =   d.validate(name,addhar,num);
      if(value){
          Citizen ctzn = new Citizen(name,addhar,num);
          String ans = ctzn.toString();
          System.out.println(ans);
      }else {
          System.out.println( "Please enter the valid details ");
      }


    }

}
