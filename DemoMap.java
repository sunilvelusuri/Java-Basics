import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        
        Map<String, Integer> students=new HashMap<>();

        students.put("Anil", 10);
        students.put("Sunil", 20);
        students.put("Kiran", 30);
        students.put("Lakshmi", 40);

        for(String key : students.keySet()){ 
            System.out.println(key + " : " + students.get(key));
        }

    }
}
