 abstract class A{
    int a=10;
    public abstract void show();
    public abstract void run();
    public abstract void jump();

}
public class DemoAbs {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In Anonymous Class");
            }
            public void run(){
                System.out.println("Running ");
            }
            @Override
            public void jump() {
                System.out.println("Jump");
            }
        };
        obj.show();
        obj.run();
        obj.jump();
    }
}
