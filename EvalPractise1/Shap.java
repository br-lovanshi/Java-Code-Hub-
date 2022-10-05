package EvalPractise1;

import java.util.ArrayList;
import java.util.List;

public class Shap {
    public void draw(){
        System.out.println("shape");
    }
}

class Ractangel extends Shap{
    public  void draw(){
        System.out.println("ractangesl draw");
    }
}
class Circle extends Shap {
    public void draw() {
        System.out.println("circle draw");
    }
}

class main{
    public static void printDraw(List<? extends Shap> list ){

        for(Shap s : list){
          s.draw();
        }
    }


    public static void main(String[] args) {
        List<Ractangel> r = new ArrayList<>();
        r.add(new Ractangel());
        List<Circle>  c = new ArrayList<>();
        c.add(new Circle());
        printDraw(r);
        printDraw(c);

    }
}