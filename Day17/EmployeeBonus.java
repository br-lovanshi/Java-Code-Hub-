package Day17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the joining date in formate dd-MMM-yyyy");
        String joiningDate = sc.next();
//        System.out.println("Enter the ending");
        LocalDate ld = LocalDate.parse(joiningDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(ld);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter dob in this formate dd-MM-yyyy");
//
//        String dob = sc.next();
//
//        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//
//
//        LocalDate ld = LocalDate.parse(dob,f);
//        System.out.println(ld);
    }}
