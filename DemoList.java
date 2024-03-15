import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoList {
    public static void main(String[] args) {
        // List <Integer> nums = new ArrayList<Integer>();
        Set<Integer> nums =new TreeSet<Integer>();
        nums.add(5);
        nums.add(8);
        nums.add(10);
        nums.add(1);
        nums.add(8);
        // System.out.println(nums.get(3));
        for(Integer n : nums){
            // int b=(Integer)n;
            System.out.println(n);
        }


    }
}
