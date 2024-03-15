package actions;
public class Advcalc extends Calc {
    
    public Advcalc(){
        System.out.println(u+" In constructor");
    }

    public int mul(int n1, int n2){
        return n1 * n2;
    }
    public int div(int n1, int n2){
        return n1 / n2;
    }
    
}
