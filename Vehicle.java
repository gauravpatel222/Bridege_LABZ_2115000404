class Vehicle {
    static double registrationFee = 5000.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("V123", "Gaurav", "Car");
        Vehicle v2 = new Vehicle("V456", "Guzzars", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        updateRegistrationFee(5500.0);
        System.out.println("After updating registration fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

