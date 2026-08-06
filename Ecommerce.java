public class ECommerce {

    // Interface
    interface Product {
        void displayProduct();
    }

    // Parent class
    class ECommerceProduct {

        String name;
        double price;

        ECommerceProduct(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    // Electronic inherits parent and implements interface
    class Electronic extends ECommerceProduct implements Product {

        Electronic(String name, double price) {
            super(name, price);
        }

        public void displayProduct() {
            System.out.println("Product Type: Electronic");
            System.out.println("Product Name: " + name);
            System.out.println("Price: Rs. " + price);
        }
    }

    // Clothing inherits parent and implements interface
    class Clothing extends ECommerceProduct implements Product {

        Clothing(String name, double price) {
            super(name, price);
        }

        public void displayProduct() {
            System.out.println("Product Type: Clothing");
            System.out.println("Product Name: " + name);
            System.out.println("Price: Rs. " + price);
        }
    }

    // Grocery inherits parent and implements interface
    class Grocery extends ECommerceProduct implements Product {

        Grocery(String name, double price) {
            super(name, price);
        }

        public void displayProduct() {
            System.out.println("Product Type: Grocery");
            System.out.println("Product Name: " + name);
            System.out.println("Price: Rs. " + price);
        }
    }

    public static void main(String[] args) {

        ECommerce e = new ECommerce();

        Electronic electronic =
                e.new Electronic("Laptop", 55000);

        Clothing clothing =
                e.new Clothing("T-Shirt", 999);

        Grocery grocery =
                e.new Grocery("Rice", 1200);

        System.out.println("--- Electronic Product ---");
        electronic.displayProduct();

        System.out.println("\n--- Clothing Product ---");
        clothing.displayProduct();

        System.out.println("\n--- Grocery Product ---");
        grocery.displayProduct();
    }
}