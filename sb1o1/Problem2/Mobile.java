package sb1o1.Problem2;

import java.util.*;

public class Mobile {

    static HashMap<String, String> mobiles = new HashMap<>();

    public static String addMobile(String company, String model){

        String a = company;
        String b = model;
                mobiles.put(a,b);
        return "Mobile added successfully";

//        Map<String ,String > mm  =new TreeMap<>();
//        mm.put(a,b);
//        return String.valueOf(mm);
//        return a;
    }

    public  static List<String> getModels(String company)throws InvalidMobileException{

        List<String> a = null;
        try{


                for (Map.Entry<String ,String > i : mobiles.entrySet()){

                    if(company .equals(i.getKey())){
                        return  a  =  Collections.singletonList(i.getValue());
                    }

                }
        }catch (Exception e ){
        boolean InvalidMobileException = false;
//            System.out.println(InvalidMobileException);
        return (List<String>) e;
        }
        return a;
    }
    public static void main(String[] args) throws InvalidMobileException {
        addMobile("MI" , "NOTE5");
        addMobile("Nokia" , "3310");
        addMobile("realme","6i");
        addMobile("realme","3pro");
        System.out.println(getModels("3"));
        System.out.println(getModels("realme"));


    }
}
