class Sum{
    int i=10;
    int j=0;
    public void arth() throws Exception{

            j=i/0;
            System.out.println(j);

        // try {
        //     j=i/0;
        //     System.out.println(j);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        
    }
}

public class DemoThrows {
    public static void main(String[] args) {
        Sum obj =new Sum();
        try {
            obj.arth();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
