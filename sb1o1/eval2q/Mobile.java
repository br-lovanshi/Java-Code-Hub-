package sb1o1.eval2q;

import Problem2.Arr;
import sb1o1.Problem2.InvalidMobileException;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;

public class Mobile {
    HashMap<String , ArrayList<String >> mobile = new HashMap<>();
    public String addMobile(String company,String model){
    if(mobile.containsKey(company)){
        ArrayList<String > al = mobile.get(company);
        al.add(model);
        mobile.put(company,al);
    }
    else{
        ArrayList<String > al = new ArrayList<>();
        al.add(model);
        mobile.put(company,al);
    }
        return "Mobile added successfully";
    }

    public List<String> getModels(String company)throws InvalidMobileException{

        if(mobile.containsKey(company)){
            return mobile.get(company);
        }else{
            throw new InvalidMobileException("ENvalid exception");
        }
    }

    public static void main(String[] args) throws InvalidMobileException {

        Mobile m1 = new Mobile();
        m1.addMobile("Apple","iphone");
        m1.addMobile("Apple","ipad");
        m1.addMobile("OnePlus","One5");

        try{
            List<String > mobilesGet = m1.getModels("OnePlu");
            mobilesGet.forEach(System.out::println);

        }catch (InvalidMobileException e ){
            System.out.println(e.getMessage());
        }
    }
}
