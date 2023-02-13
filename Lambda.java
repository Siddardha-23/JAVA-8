import java.util.ArrayList;
import java.util.*;

@FunctionalInterface
interface interface1{
    void show();
}

//class A implements interface1{
//
//    public void show() {
//        System.out.println("Lambda Demo");
//    }
//}

class Lambda{

    public static void showcase(){
        System.out.println("Method reference");
    }
    public static void main(String[] args) {


//        interface1 obj = (x,y) -> {
//            System.out.println("Hello demo" + x + y);
//        };                           //Lambda Expression
//        interface1 obj = new interface1(){            //Anonymous classes
//            public void show(){
//                System.out.println("Lambda demo");
//            }
//        };
//        interface1 obj2 = (x,y) -> (x + y);
//        System.out.println(obj2.show(2,3));
//        obj.show(2,5);

        List<Integer> l = new ArrayList<Integer>();
        for(int i = 1; i < 10; i++){
            l.add(i);
        }

        l.forEach(k -> {
            System.out.print(k + " ");
        });

        System.out.println();

        interface1 lam = Lambda::showcase;

        lam.show();
    }
}



//@FunctionalInterface
//interface LambdaInterface{
//    void draw(int x, String y);
//}
//public class Lambda {
//    public static void main(String[] args) {
//
//        LambdaInterface li = (int x, String y) -> {
//            System.out.println("Hello World " + x + " " + y);
//        };
//        li.draw(15,"Siddu");
//    }
//}
