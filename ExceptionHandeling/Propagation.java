package ExceptionHandeling;

public class Propagation {

    void m(){
        int  a = 29/0;
        System.out.println(a);
    }
    void n(){
        int arr[] = new int[3];
        System.out.println(arr[8]);
        m();
    }
    void p(){
        try
        {
            n();
        }catch (Exception x ){
            System.out.println("Handeled here " + x);
        }
    }

    public static void main(String[] args) {
        Propagation  p = new Propagation();
        System.out.println("continue..");
        p.p();
        System.out.println("next statment");
    }
}

