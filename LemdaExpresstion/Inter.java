package LemdaExpresstion;

public interface Inter {

    void sayHello(String name);
}
class Hey implements Inter {
    public void sayHello(String name){
        System.out.println("hello " + name);
    }
}

class Main{
    public static void main(String[] args) {
//        Inter i = (String name ) -> System.out.println("hey "  + name);
//        i.sayHello("brajesh");

       Inter s = new Hey();

        s.sayHello("Brajesh");

    }
}
