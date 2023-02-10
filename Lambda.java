@FunctionalInterface
interface LambdaInterface{
    void draw(int x, String y);
}
public class Lambda {
    public static void main(String[] args) {
        LambdaInterface li = (int x, String y) -> {
            System.out.println("Hello World " + x + " " + y);
        };
        li.draw(15,"Siddu");
    }
}
