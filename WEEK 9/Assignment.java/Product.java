class Product {
    private int productId;
    private String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    // Override equals() to compare by productId
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // reference check
        if (obj == null || getClass() != obj.getClass()) return false;
        Product other = (Product) obj;
        return this.productId == other.productId;
    }

    @Override
    public String toString() {
        return "Product [ID: " + productId + ", Name: " + productName + "]";
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop");
        Product p2 = new Product(101, "Notebook");
        Product p3 = p1;

        // Reference comparison
        System.out.println("p1 == p2: " + (p1 == p2)); // false
        System.out.println("p1 == p3: " + (p1 == p3)); // true

        // Content comparison
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // true
    }
}