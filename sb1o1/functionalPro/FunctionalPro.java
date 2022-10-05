package sb1o1.functionalPro;
@FunctionalInterface
public interface FunctionalPro {
//    void greet();

    void greet(String name);
}
class SayHello implements FunctionalPro {



    @Override
    public void greet(String name){
        System.out.println("good moring " + name);
    }
}

class Main {
    public static void main(String[] args) {
        FunctionalPro s = new SayHello();
        s.greet("brajesh");

    }
}