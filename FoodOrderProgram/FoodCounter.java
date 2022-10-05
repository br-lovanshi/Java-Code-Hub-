package FoodOrderProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodCounter {
    public static void main(String[] args) {
        ArrayList<FoodItems> orderDijiye = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int c =1;
        while(true){
            System.out.println("enter detail of Item  " + c);
            System.out.println("enter name of itme");
            String name = sc.next();
            System.out.println("enter the size(small,large,big) ");
            String size = sc.next();
            System.out.println("Do you want coldrink (yes/ no )");
            String coldrink = sc.next();


            FoodItems costumerOrder = new FoodItems(coldrink,name,size);
            orderDijiye.add(costumerOrder);

            System.out.println("Do you want more (y/n) ? ");
            String choise = sc.next();
            if(choise.equalsIgnoreCase("n")){
                break;
            }

        }

            for(FoodItems ready:orderDijiye){
                System.out.println("your order is ready == ");
                System.out.println(ready.getName());
                System.out.println(ready.getSize());
                System.out.println(ready.getColdrink());
                System.out.println(ready.getPrice());
                System.out.println("Thank you === ");

        }
    }
}
