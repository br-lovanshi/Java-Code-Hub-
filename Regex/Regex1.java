package Regex;

import java.util.regex.Pattern;

public class Regex1 {


    public static void main(String[] args) {

        {//        Pattern p = Pattern.compile("BRajesh Lovanshi");
//        Matcher m = p.matcher("BRajesh Lovanshi");

//        System.out.println(m.find());
//        int count = 0;
//        Pattern p = Pattern.compile("ab");
//        Matcher m = p.matcher("abbbabbaba");
//
//        while(m.find()){
//            count++;
//            System.out.println(m.start() + " ==== " + m.end() + " === " + m.group());
//
//        }
//        System.out.println(count);
//
//        Pattern p = Pattern.compile("[a-z0-9]");
//        Matcher m = p.matcher("12abs $@( cd");
//
//        while(m.find())
//        {
//            System.out.println(m.start() +  " === == "+ m.group());
//
//        }
//        System.out.println(Pattern.matches("[amn]" , "n"));
//        System.out.println(Pattern.matches("[amn]","a"));

//        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
//        System.out.println(Pattern.matches("[789]{1}[0-9]{9}" ,"9123423122"));
//        System.out.println(Pattern.matches("[B][a-z]","Brajesh"));
//        System.out.println(Pattern.matches("[987][0-9]{9}","9235467878"));
    }

    Pattern p = Pattern.compile("\\s");
        String st[] = p.split("Hello bro just CHILL") ;
        for(String i : st){
            System.out.println(i);
        }

    String s = "hello bro just chill";
        String [] str  = s.split("\\s");
        for(String i : str){
//            System.out.println(i);
        }
    }
}
