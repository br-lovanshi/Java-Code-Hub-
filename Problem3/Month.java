package Problem3;

import java.util.Scanner;

public enum Month {
    JAN,FEB,MAR,APR,MAY,JUN,JULY,AGU,SEP,OCT,NOV,DES

}

class Demo {
 public void showDetails(Month m){

     switch (m) {
         case JAN:
             System.out.println("This is the 1st Month of the Year January");
             break;
         case FEB:
             System.out.println("This is the 2nd Month of the Year Febrary");
             break;
         case MAR:
             System.out.println("This is the 3rd Month of the Year January");
             break;
         case APR:
             System.out.println("This is the 4th Month of the Year APRIL");
             break;
         case MAY:
             System.out.println("This is the 5th Month of the Year May");
             break;
         case JUN:
             System.out.println("This is the 6th Month of the Year June");
             break;
         case JULY:
             System.out.println("This is the 7th Month of the Year July");
             break;
         case AGU:
             System.out.println("This is the 8th Month of the Year Agust");
             break;
         case SEP:
             System.out.println("This is the 9th Month of the Year September");
             break;
         case OCT:
             System.out.println("This is the 10th Month of the Year Octobor");
             break;
         case NOV:
             System.out.println("This is the 11th Month of the Year November");
             break;
         case DES:
             System.out.println("This is the 12th Month of the Year Desember");
             break;
         default:
             System.out.println("invalid month name");
     }

 }

    public static void main(String[] args) {
        Demo d = new Demo();
        Scanner sc = new Scanner(System.in);
        System.out.println("inter the moth short name");
        String s = sc.next();
        d.showDetails(Month.valueOf(s));
    }
}