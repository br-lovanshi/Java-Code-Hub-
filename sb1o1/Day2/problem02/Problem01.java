package sb1o1.Day2.problem02;
/*
* Question 1:
Create your own Generic Class and use a Demo class to implement it. (Refer Notes
for clarification)
* */

class MyGen <T> {
    T sum;




    void add(T sum ){
        this.sum = sum;
    }

    T get(){
        return sum;
    }
}
public class Problem01 {

    public static void main(String[] args) {
        MyGen<String > str = new MyGen<>();
        str.add("hello");
        System.out.println(str.get());

        MyGen<Integer> num = new MyGen<>();
        num.add(10);
        System.out.println(num.get());




    }
}
