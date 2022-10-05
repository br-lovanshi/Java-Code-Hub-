package LemdaExpresstion;

public interface Inter4 {
    public void helo(String name);
}
class main4 {
    public static Inter4 fun1( ){
        return n -> System.out.println("hello " + n );
    }
    public static void main(String[] args) {
        Inter4 i = fun1();

i.helo("brajesh");
    }
}
