class Product<T> {
    private String name;
    double price;
        private T category;
    
        public Product(String name, double price, T category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }
    
        public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
            double discount = product.price * (percentage / 100);
        product.price -= discount;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ") - Category: " + category;
    }
}
