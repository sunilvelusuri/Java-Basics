import java.net.Socket;

class A{
    int a;
    String model;
    public void show(){
        System.out.println("In A");
    }

    @Override
    public String toString() {
        return "A [a=" + a + ", model=" + model + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + a;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (a != other.a)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return true;
    }

}
class B extends A{
    public void show(){
        System.out.println("In B");
    }
}
public class Demo2 {
    public static void main(String[] args) {
        A obj =new A();
        obj.show();

        obj =new B();
        obj.show();

        obj.a=10;
        obj.model="GTX";

        final int h;
        h=10;
        System.out.println(h);
        // h=15;
        System.out.println(h);

        System.out.println(obj.toString());
        System.out.println(obj.hashCode());

        A obj2=new A();
        obj2.a=10;
        obj2.model="GTX";
        System.out.println(obj.equals(obj2));

    }
}
