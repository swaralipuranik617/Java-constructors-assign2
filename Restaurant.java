public class Restaurant {

    static int totalorders = 0;

    //for takeaway
    float bill(float amount ,float packingcharges) {
        totalorders++;
        return amount+packingcharges;
    }
    //for dine in
    float  bill(float amount) {
        totalorders++;
        return amount;
    }

    //for delivery
    float  bill(float amount , float deliverycharges , float packingcharge){
        totalorders++;
        return amount+deliverycharges+packingcharge;
    }


     static void totalorders() {
        System.out.println("Total orders: " +totalorders);
    }


public static void main(String[] args) {
        
    Restaurant r1 = new Restaurant();
    System.out.println("Dinein: " +r1.bill((float)2500));
    System.out.println("------------------------------------------");
    System.out.println("Takeaway: " +r1.bill((float)2200 , (float)50));
    System.out.println("------------------------------------------");
    System.out.println("Delivery: " +r1.bill(1000,30,50));
    System.out.println("------------------------------------------");
    Restaurant.totalorders();
    System.out.println("------------------------------------------");
   
}
}