public class lesson5 {
    public static void main(String[] args) {
        double price1 = 5.0;
        double price2 = 0.2;
        double price3 = 1.2;
        double price4 = 2.2;
        double price5 = 3.2;

        double high = price1;
        double low = price1;

        if(high < price2) {
            high = price2;
        }
        if(high < price3) {
            high = price3;
        }
        if(high < price4) {
            high = price4;
        }
        if(high < price5) {
            high = price5;
        }

        if(low > price2) {
            low = price2;
        }
        if(low > price3) {
            low = price3;
        }
        if(low > price4) {
            low = price4;
        }
        if(low > price5) {
            low = price5;
        }

        System.out.println(high);
        System.out.println(low);
    }
}
