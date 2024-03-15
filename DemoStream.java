import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4,5,6,7,8,1,3,2);

        // Stream <Integer> s1 = num.stream();

        // Stream <Integer> s2 =s1.filter(n -> n%2==0);

        int result = num.stream()
            .filter(n -> n%2==0 )
            .map(n -> n*3)
            .reduce(0,(c,e)->c+e);
        
        System.out.println(result);



        // result.forEach(n-> System.out.println(n));
    }
}
