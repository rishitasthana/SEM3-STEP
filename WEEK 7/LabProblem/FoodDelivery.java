public class FoodDelivery {

    // Basic delivery: just distance
    public void calculateDelivery(double distance) {
        double cost = 30 + distance * 8;
        System.out.println("Basic Delivery:");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Delivery Cost: ₹" + cost);
    }

    // Premium delivery: distance + priority fee
    public void calculateDelivery(double distance, double priorityFee) {
        double cost = 30 + distance * 8 + priorityFee;
        System.out.println("Premium Delivery:");
        System.out.println("Distance: " + distance + " km, Priority Fee: ₹" + priorityFee);
        System.out.println("Delivery Cost: ₹" + cost);
    }

    // Group delivery: distance + number of orders (discount per extra order)
    public void calculateDelivery(double distance, int numOrders) {
        double baseCost = 30 + distance * 8;
        double discount = (numOrders > 1) ? (numOrders - 1) * 5 : 0;
        double cost = baseCost - discount;
        System.out.println("Group Delivery:");
        System.out.println("Distance: " + distance + " km, Orders: " + numOrders);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Delivery Cost: ₹" + cost);
    }

    // Festival special: distance + discount percentage + free delivery over certain amount
    public void calculateDelivery(double distance, double discountPercent, double freeOverAmount, double orderAmount) {
        double cost = 30 + distance * 8;
        double discount = cost * (discountPercent / 100);
        double finalCost = cost - discount;
        if (orderAmount >= freeOverAmount) {
            finalCost = 0;
            System.out.println("Festival Special Delivery:");
            System.out.println("Order Amount: ₹" + orderAmount + " (Eligible for Free Delivery!)");
        } else {
            System.out.println("Festival Special Delivery:");
            System.out.println("Order Amount: ₹" + orderAmount);
            System.out.println("Distance: " + distance + " km, Discount: " + discountPercent + "% (₹" + discount + ")");
        }
        System.out.println("Delivery Cost: ₹" + finalCost);
    }

    public static void main(String[] args) {
        FoodDelivery fd = new FoodDelivery();

        fd.calculateDelivery(5); // Basic
        System.out.println();

        fd.calculateDelivery(7, 20); // Premium
        System.out.println();

        fd.calculateDelivery(10, 4); // Group
        System.out.println();

        fd.calculateDelivery(8, 25, 500, 600); // Festival (free)
        System.out.println();

        fd.calculateDelivery(8, 25, 500, 300); // Festival (discount)
    }
}