package LemdaExpresstion;

import java.security.PublicKey;

interface  Focus {
    void focus(String name , int days);
}

class Main11 {
    public static void main(String[] args) {
        Focus i = (String name ,int days) ->
                System.out.println("hello " + name + "focus on caree " + days);
        i.focus("brajesh", 365);
    }
}