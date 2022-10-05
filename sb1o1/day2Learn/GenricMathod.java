package sb1o1.day2Learn;


public class GenricMathod {

    public  static <E> void printArray(E[] el){
        for(E i : el ){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,5,56};
        int [] ar = {1,3,4,5,6,7,8};
        String[] str = {"one","two","three"};
        printArray(str);
    }
}