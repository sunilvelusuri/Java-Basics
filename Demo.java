import actions.VeryAdvCalc;

public class Demo{
    public static void main(String[] args) {
        int a=1;
        System.out.println(a);

        VeryAdvCalc obj=new VeryAdvCalc();
        int sum=obj.add(5, 4);
        int sub=obj.sub(4, 1);
        int into=obj.mul(4, 4);
        int div=obj.div(20,5);
        double power=obj.power(5, 2);

        // System.out.println(obj.u);

        System.out.println(sum + " : " + sub + " : " + into + " : " + div+ " : "+ power);


    }
}