// All classes in one file: PaymentTest.java

interface PaymentGateway {
    // Declare method pay(double amount)
    void pay(double amount);

    // Declare method refund(double amount)
    void refund(double amount);
}

class CreditCardPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund " + amount + " to Credit Card");
    }
}

class UPIPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund " + amount + " to UPI");
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        // PaymentGateway reference -> CreditCardPayment
        PaymentGateway pg1 = new CreditCardPayment();
        pg1.pay(500);
        pg1.refund(200);

        // PaymentGateway reference -> UPIPayment
        PaymentGateway pg2 = new UPIPayment();
        pg2.pay(300);
        pg2.refund(100);
    }
}