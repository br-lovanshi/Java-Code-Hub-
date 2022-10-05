package Evolution5.problem2;

//import java.time.LocalDate;
//import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DOB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date of birth in dd-MM-yyyy format");
        String dob = sc.next();



                try{

                    LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    LocalDate c1 = LocalDate.now();
                    Period p = Period.between(d1,c1);
                    String day= d1.format(DateTimeFormatter.ofPattern("dd"));
                    String dayNow= c1.format(DateTimeFormatter.ofPattern("dd"));
//                    System.out.println(day+ " " + dayNow);

                    if(p.getYears() >= 18)
                        System.out.println("You are Eligible to Vote");
                   else if(p.getYears()>=18 && dayNow.equals(day)){
                        System.out.println("Happy Birthday, You are eligible to cast your vote");
                    }
                   if(p.getYears()<0 &&p.getMonths()<0&& p.getDays()<0){
                        System.out.println("Date of birth should not be in future");
                    }
                    if(p.getMonths()<0){
                        System.out.println("Date of birth should not be in future");
                    }
                    if(p.getDays()<0){
                        System.out.println("Date of birth should not be in future");
                    }
//                   else if(p.getYears() <18)
//                    {
//                        System.out.println("Sorry you are not eligible to Vote");
//                    }

                }catch (Exception e) {
                    System.out.println("please pass the date in the\n" +
                            "proper format");
                }
    }
}
