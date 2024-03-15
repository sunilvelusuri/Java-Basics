class SunilException extends Exception{
    public SunilException(String e){
        super(e);
    }
}

public class DemoExc {
    public static void main(String[] args) {
        int i=0;
        int j=1;

        try {
            j=20/30;
            if(j==0){
                throw new SunilException("Got zero");
            }
        } catch (ArithmeticException e) {
            j=20/2;
            System.out.println("It is an Arithmetic error " + e );
        } catch (Exception e) {
            System.out.println("Exception error " + e);
        }
        System.out.println(j);
    }
}
