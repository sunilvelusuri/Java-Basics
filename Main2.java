abstract class Car{
    public abstract void drive();

    public void music(){
        System.out.println("Play music");
    }
}

class Tata extends Car{
    public void drive(){
        System.out.println("Drive");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car obj = new Tata();
        obj.music();
        obj.drive();
        
        // System.out.println("HI");
    }
}
