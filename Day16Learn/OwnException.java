package Day16Learn;

public class OwnException extends Exception{
    public OwnException(String massage) {
        super(massage);
    }
    public OwnException(){

    }

}

class DemoOwn {
    int getPantion(int age , int salary) throws OwnException{
        int pention = 0;

        if(age > 40 && age  <100) {
        pention = (age *salary)/100;
        }else{
            OwnException ow = new OwnException("invalid age ");
            throw ow;

    }
        return pention;
}

    public static void main(String[] args) {
        DemoOwn d = new DemoOwn();
        try
        {
            d.getPantion(10,100000);

        }catch (OwnException oe ){
            System.out.println(oe.getMessage());
        }
    }
 }