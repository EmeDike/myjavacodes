package Chapter7;

public class SemiolonStoresProject {
    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
            }

        public String getName() {

            return name;
        }

        public double getPrice() {
            return price;
        }
    }

}