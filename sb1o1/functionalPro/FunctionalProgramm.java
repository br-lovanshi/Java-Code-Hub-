package sb1o1.functionalPro;

interface intr {
    void hello(String name);
        }
        class SayHelo implements intr {
            @Override
            public void hello(String name) {
                System.out.println("Good morning " + name);
            }
        }
public class FunctionalProgramm {
    public static void main(String[] args) {
        intr fp = new SayHelo();
        fp.hello("brajesh");
    }
}
