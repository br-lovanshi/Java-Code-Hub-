package Day15;

    import java.util.InputMismatchException;
    import java.util.Scanner;
    class Problem3 {
        public static void main(String args[]) {
            System.out.println("start of main..");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num1");
            int num1 = sc.nextInt();
            System.out.println("Enter num2");
            int num2 = sc.nextInt();
            String message = null;
            try{
                int num3 = num1 / num2;
                if (num3 > 10) {
                    message = "Welcome to Exception Handling ";
                    System.out.println("Message is :"+message.toUpperCase());
                }
            }
            catch (NullPointerException n ){
                System.out.println("String value is null”");


            }catch (InputMismatchException im){
                System.out.println("“Please enter valid number");
            }
            catch (ArithmeticException ar){
                System.out.println("num2 should not be 0”");
            }

            System.out.println("end of main");
        }
    }


