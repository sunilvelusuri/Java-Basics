// interface A{
//     public void display();
// }

// interface B extends A{
//     public void show();
// }

// class x implements B{
//     public void display(){
//         System.out.println("In x class");
//     }
//     public void show(){
//         System.out.println("Show calling from x");
//     }
// }

interface Computer{
    void code();   
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Can code only in office");
    }
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Can code Remotely");
    }
}

class Devloper{
    public void devApp(Computer comp){
        comp.code();
    }
}



public class DemoInterface {
    
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk =new Desktop();
        Devloper sunil =new Devloper();
        
        sunil.devApp(lap);



                            // B obj = new x();
                            // obj.display();
                            // obj.show();
    }
}
