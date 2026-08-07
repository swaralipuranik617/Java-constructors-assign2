abstract class FoodOrder {
    double foodPrice;

    FoodOrder(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {

    DineInOrder(double foodPrice) {
        super(foodPrice);
    }

    @Override
    void calculateBill() {
        double serviceCharge = foodPrice * 0.10;
        double total = foodPrice + serviceCharge;

        System.out.println("Order Type: Dine-In");
        System.out.println("Food Price: ₹" + foodPrice);
        System.out.println("Service Charge: ₹" + serviceCharge);
        System.out.println("Total Bill: ₹" + total);
    }
}

class TakeAwayOrder extends FoodOrder {

    TakeAwayOrder(double foodPrice) {
        super(foodPrice);
    }

    @Override
    void calculateBill() {
        double packagingCharge = 50;
        double total = foodPrice + packagingCharge;

        System.out.println("Order Type: Take-Away");
        System.out.println("Food Price: ₹" + foodPrice);
        System.out.println("Packaging Charge: ₹" + packagingCharge);
        System.out.println("Total Bill: ₹" + total);
    }
}

public class FoodOrderDemo {
    public static void main(String[] args) {

        FoodOrder dineIn = new DineInOrder(500);
        FoodOrder takeAway = new TakeAwayOrder(500);

        dineIn.calculateBill();

        System.out.println();

        takeAway.calculateBill();
    }
}