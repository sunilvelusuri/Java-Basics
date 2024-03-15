import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [marks=" + marks + ", name=" + name + "]";
    }

    public int compareTo(Student that){
        return this.marks>that.marks ? 1:-1;
    }


}

public class DemoComp {

    public static void main(String[] args) {
        Comparator <Student> comp = (Student i, Student j) -> i.marks>j.marks ? 1:-1;
        // Comparator <Integer> comp = (Integer i, Integer j) -> i>j ? 1:-1;

        List<Student> stud=new ArrayList<>();
        stud.add(new Student(93, "Sunil"));
        stud.add(new Student(48, "Anil"));
        stud.add(new Student(27, "Kiran"));

        // List<Integer> n=new ArrayList<>();
        // n.add(23);
        // n.add(46);
        // n.add(71);
        // Collections.sort(n,comp);
        
        // for(Integer num : n){
        //     System.out.println(num);
        // }

        

        Collections.sort(stud);
        for(Student s : stud){
            System.out.println(s);
        }
    }

    
}