package Day16Learn;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try");

            System.out.println(Integer.parseInt("heloo"));
        }
        catch (Exception e ){
            System.out.println(e);
        }
        finally {
            System.out.println("finaly will alway executes ");
          }
        System.out.println("rest of the code ");
    }
}
