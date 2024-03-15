import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DemoPrlSt {
    public static void main(String[] args) {
        int size=10_000;
        List<Integer> nums =new ArrayList<>(size);
        Random ran =new Random();

        for(int i=0 ; i<=size; i++){
            nums.add(ran.nextInt(1000));
        }

        // int sum1 =nums.stream()
        //             .map(i-> i*2)
        //             .reduce(0, (c,e) -> c+e);

        long sst=System.currentTimeMillis();

        int sum2 =nums.stream()
                    .map(i->{
                        try {
                            Thread.sleep(1);
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                        return i*2;
                    } )
                    .mapToInt(i->i)
                    .sum();
        long set=System.currentTimeMillis();
        long pst=System.currentTimeMillis();
        int sum3 =nums.parallelStream()
                    .map(i->{
                        try {
                            Thread.sleep(1);
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                        return i*2;
                    } )
                    .mapToInt(i->i)
                    .sum();
        long pet=System.currentTimeMillis();
        System.out.println(sum2 + " : "+sum3);
        System.out.println("seq : " + (set-sst));
        System.out.println("par : "+ (pet-pst));
    }
}
