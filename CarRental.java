class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 50.0;

   
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void displayRentalDetails() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Guzzar", "Toyota Camry", 5);
        rental.displayRentalDetails();
    }
}
