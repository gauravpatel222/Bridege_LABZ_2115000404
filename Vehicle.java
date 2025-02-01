class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Registration Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("GAURAV", "Car");
        Vehicle v2 = new Vehicle("guzz", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(600);
        System.out.println("Updated Registration Fee: $" + Vehicle.registrationFee);
    }
}
