package ExceptionHandeling;

public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            // main l1

            try{
//                l2
                try {
                    int ar[] = {1,2,3,4,5};
                    System.out.println(ar[9]);
                }catch (
                        ArithmeticException a
                ){
                    System.out.println(a);
                }
            }
            catch (ArrayIndexOutOfBoundsException abe){
                System.out.println("milgya in l2 ");
            }
        }
        catch (Exception e ){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
