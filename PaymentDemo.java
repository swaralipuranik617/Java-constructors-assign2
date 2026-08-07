abstract class Payment {
    abstract void makePayment(double amount);

    void paymentMessage() {
        System.out.println("Payment processing...");
    }
}

class CreditCard extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Credit Card.");
    }
}

class UPI extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made using UPI.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();

        p1.paymentMessage();
        p1.makePayment(1500);

        p2.paymentMessage();
        p2.makePayment(800);
    }
}