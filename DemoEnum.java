enum Day{
    Mon,Tues,Wed,Thur,Fri,Sat,Sun
}

enum Mobile{
    Realme(25000),iphone(70000),Samsung,Oneplus(40000);

    private int price;

    private Mobile() {
        price=100;
    }

    private Mobile(int price) {
        this.price = price;
        System.out.println(this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}



public class DemoEnum {
    public static void main(String[] args) {
        
        Mobile[] m = Mobile.values();
        // Mobile m=Mobile.iphone;

        // System.out.println(m.getPrice());




        // for(Mobile phone : m){
        //     phone.setPrice(10000);
        // }

        for(Mobile phone :m){
            System.out.println(phone+" : "+phone.getPrice());
        }







        // Day d=Day.Thur;
        // if(d==Day.Mon){
        //     System.out.println("True");
        // }else{
        //     System.out.println("False");
        // }

        // switch (d) {
        //     case Mon:
        //         System.out.println("It is Monday");
        //         break;
        
        //     default:
        //         break;
        // }
        
    }
}
