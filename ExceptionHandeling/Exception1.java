package ExceptionHandeling;

public class Exception1 {
    public static void main(String[] args) {
        try {
            try {
                String s = null;
                System.out.println(s.length());
                try {
                    int[] ar = {2, 34, 5};
                    System.out.println(ar[5]);
                    try {
                        int a = 10;
                        int b = 0;
                        System.out.println(a / b);
                    } catch (ArithmeticException ae) {
                        System.out.println("can't divide by zero");
                    }
                } catch (ArrayIndexOutOfBoundsException ar) {
                    System.out.println("Array lenght is shorter then input");
                }
            } catch (NullPointerException ae) {
                System.out.println("String is Empty!");
            }
        } catch (Exception e) {
            System.out.println("Next statments");
        }
    }
}
