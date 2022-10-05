package Day17Learn;

import com.sun.corba.se.impl.ior.OldObjectKeyTemplateBase;
import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class DateAPI {
    public static void main(String[] args) {
//        LocalDate ld = LocalDate.now();
////        System.out.println(ld);
//        LocalTime lt = LocalTime.now();
////        System.out.println(lt);
//
//        LocalDateTime ltd = LocalDateTime.now();
////        System.out.println(ltd);
//        LocalDate ld1 = LocalDate.of(2001,05,25);
//        System.out.println(ld1);

//        LocalDate date  = LocalDate.now();
//        LocalDate yesterday = date.minusDays(1);
//        LocalDate tommorow  = yesterday.plusDays(2);
//        System.out.println(date + " " + yesterday + " " +tommorow);

//        LocalDate dat1 = LocalDate.of(2021,05,25);
//        System.out.println(dat1.isLeapYear());
//        LocalDate dat2 = LocalDate.of(2016,5,25);
//        System.out.println(dat2.isLeapYear());


//        LocalDate ld = LocalDate.of(1971,07,25);
//        LocalDateTime ldtime = ld.atTime(12,1,3);
//        System.out.println(ldtime);

//        LocalDateTime ld = LocalDateTime.of(3,18,09);

//        DateTimeFormatter paternDT = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
//        System.out.println(paternDT);

//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern( "dd-MMM-yyyy hh:mm:ss");
//
//        LocalDateTime lcd = LocalDateTime.now();
//        System.out.println(lcd);
//        String ne = lcd.format(dtf);
//        System.out.println(ne);


//        DateTimeFormatter tdf = DateTimeFormatter.ofPattern("H:m:s");
//        LocalTime curr = LocalTime.now();
//        System.out.println(  tdf.format(curr));

//        DateTimeFormatter tdf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        LocalDate ld1 = LocalDate.now();
//        System.out.println(tdf1.format(ld1));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter dob in this formate dd-MM-yyyy");
//
//        String dob = sc.next();
//
//        DateTimeFormatter dtfm = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//
//
//        LocalDate ld = LocalDate.parse(dob,dtfm);
//
//        String result = ld.format(DateTimeFormatter.ofPattern("EEEE"));
////        System.out.println(DateTimeFormatter.ofPattern("EEEE"));
//
//        System.out.println(result);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your dob in this formate dd-MM-yyyy");
//        String dob = sc.next();
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        try
//        {
//            LocalDate ld = LocalDate.parse(dob,dtf);
//            String result = ld.format(DateTimeFormatter.ofPattern("EEEE"));
//            System.out.println(result);
//        }
//        catch (Exception e ){
//            System.out.println("please enter in right fomate");
//        }

//LocalDate curr= LocalDate.now();
//LocalDate dob = LocalDate.of(2001,05,25);
//        Period p = Period.between(curr,dob);
//        System.out.println(p.getYears());


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the dob in dd-MM-yyyy format");
//        String dob = sc.next();
//
//        try {
//            LocalDate l1 = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//            LocalDate curr = LocalDate.now();
//            Period p = Period.between(l1,curr);
//            if(p.getYears() >= 18 ){
//                System.out.println("Your are elibible for vote ");
//            }else {
//                System.out.println("age should be greater then 18");
//            }
//
//        }
//        catch (Exception e ){
//            System.out.println("Please enter Date of birth in valid pattern");
//
//        }
//        System.out.println(3/2);






    }

}
