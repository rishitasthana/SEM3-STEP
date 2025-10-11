public class HotelBooking {

    // Standard booking: room type and nights
    public void calculatePrice(String roomType, int nights) {
        double basePrice = getBasePrice(roomType);
        double total = basePrice * nights;
        System.out.println("Standard Booking:");
        System.out.println("Room: " + roomType + ", Nights: " + nights);
        System.out.println("Total: $" + total);
    }

    // Seasonal booking: room type, nights, seasonal multiplier
    public void calculatePrice(String roomType, int nights, double seasonalMultiplier) {
        double basePrice = getBasePrice(roomType);
        double total = basePrice * nights * seasonalMultiplier;
        System.out.println("Seasonal Booking:");
        System.out.println("Room: " + roomType + ", Nights: " + nights);
        System.out.println("Seasonal Multiplier: " + seasonalMultiplier);
        System.out.println("Total: $" + total);
    }

    // Corporate booking: room type, nights, corporate discount, meal package
    public void calculatePrice(String roomType, int nights, double corporateDiscount, boolean mealPackage) {
        double basePrice = getBasePrice(roomType);
        double subtotal = basePrice * nights;
        double discount = subtotal * corporateDiscount;
        double mealCost = mealPackage ? 20 * nights : 0;
        double total = subtotal - discount + mealCost;
        System.out.println("Corporate Booking:");
        System.out.println("Room: " + roomType + ", Nights: " + nights);
        System.out.println("Corporate Discount: " + (corporateDiscount * 100) + "% (-$" + discount + ")");
        System.out.println("Meal Package: " + (mealPackage ? "Included ($" + mealCost + ")" : "Not Included"));
        System.out.println("Total: $" + total);
    }

    // Wedding package: room type, nights, guest count, decoration fee, catering option
    public void calculatePrice(String roomType, int nights, int guestCount, double decorationFee, boolean catering) {
        double basePrice = getBasePrice(roomType);
        double roomTotal = basePrice * nights;
        double cateringCost = catering ? guestCount * 30 : 0;
        double total = roomTotal + decorationFee + cateringCost;
        System.out.println("Wedding Package Booking:");
        System.out.println("Room: " + roomType + ", Nights: " + nights);
        System.out.println("Guests: " + guestCount);
        System.out.println("Decoration Fee: $" + decorationFee);
        System.out.println("Catering: " + (catering ? "Included ($" + cateringCost + ")" : "Not Included"));
        System.out.println("Total: $" + total);
    }

    // Helper method to get base price per night for room type
    private double getBasePrice(String roomType) {
        switch (roomType.toLowerCase()) {
            case "suite": return 200;
            case "deluxe": return 150;
            case "standard": return 100;
            default: return 80;
        }
    }

    public static void main(String[] args) {
        HotelBooking booking = new HotelBooking();

        booking.calculatePrice("Deluxe", 3);
        System.out.println();

        booking.calculatePrice("Suite", 2, 1.5);
        System.out.println();

        booking.calculatePrice("Standard", 5, 0.1, true);
        System.out.println();

        booking.calculatePrice("Suite", 1, 100, 500, true);
    }
}