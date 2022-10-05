package LemdaExpresstion;

import javax.swing.*;

@FunctionalInterface
public interface shortLemda {
    public  void  sayHi(String  name);
}
class Main2 {
    public static void main(String[] args) {
        shortLemda i = n ->
                System.out.println("hey " + n);
        i.sayHi("brajseh");

    }
}
interface Multi {
    public void sum(int s1 , int s2 , int s3);

    public static void main(String[] args) {
        Multi  m = (n,n1,n2) ->
        {
            System.out.println((n + n1) * n2);
        };
        m.sum(29,20,2);
    }
}
interface Inter1 {
    int sum (int n , int n1);

    public static void main(String[] args) {
        Inter1 i = (n,n1) -> {
            return n+n1;
        };
        System.out.println(i.sum(10,20));
        Inter1 i1 = (n,n1) -> n+n1;
        System.out.println(i1.sum(10,20));
        System.out.println(i1.sum(2,34));
    }
}
