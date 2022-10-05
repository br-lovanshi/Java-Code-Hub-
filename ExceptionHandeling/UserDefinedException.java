package ExceptionHandeling;

public class UserDefinedException {


    public static void main(String[] args) {
        try{
//                throw new myExeception(8);
                }
        catch (Exception e ){
            System.out.println(e);
        }



    }

    class myExeception extends Exception {
        int a;

        myExeception(int b) {
            a = b;
        }

        @Override
        public String toString() {
            return "myExeception{" +
                    "a=" + a +
                    '}';
        }
    }

}

