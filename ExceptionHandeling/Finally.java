package ExceptionHandeling;

import java.sql.SQLOutput;

public class Finally {
  public void throwException(int age ) throws ArithmeticException{
      System.out.println("throws exception");
      throw new ArithmeticException("demo");
  }
    public static void main(String[] args) {

Finally f = new Finally();
    try {
        f.throwException(39);
    }finally {
        System.out.println("finally will always execute");
    }
    }
}
