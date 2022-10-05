package sb1o1.Day04.Problem03;

public class SleepThrad {

    public static void main(String[] args) {

        Thread newThread =  new Thread(()-> {

            for(int i= 1;i<6;i++){
                System.out.println(i);
            }
//            sleep
            try
            {
                Thread.sleep(5000);
            }catch (InterruptedException e ){
                e.fillInStackTrace();
            }
            for(int j = 6;j<11;j++){
                System.out.println(j);
            }
        });

        newThread.start();
    }
}
