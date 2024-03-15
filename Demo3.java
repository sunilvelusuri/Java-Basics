class A{
    public void show1(){
        System.out.println("In Show-1");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In Show-2");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show1();
        B obj2 = (B) obj;
        
        obj2.show2();
    }
}
