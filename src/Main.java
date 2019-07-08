public class Main {

    public static void main(String[] args) {

        DiscountSample ds = new DiscountSample();
        boolean rtn = ds.priceCheck(50000);

        if(rtn == true) {
            System.out.println("割引対象です!!");
        }else{
            System.out.println("割引対象外です!!");
        }

    }

}
