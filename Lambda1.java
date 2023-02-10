import java.util.*;
import java.util.stream.Collectors;
public class Lambda1 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i = 1; i <= 10; i++){
            al.add(i);
        }

        al.forEach(n -> System.out.print(n + " "));
        System.out.println();
        al.forEach(n -> {
            if (n % 2 == 0){
                System.out.print(n + " ");
            }
        });

        System.out.println();

        List<Integer> al2 = al.stream().map(p -> p * 2).collect(Collectors.toList());

        System.out.println(al2);

    }
}
