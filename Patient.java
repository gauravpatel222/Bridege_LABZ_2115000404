class Patient {
    static String hospitalName = "Kosi kalan Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            
        }
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient(201, "aaaa", 30, "fsdfsd");
        Patient p2 = new Patient(202, "csdsd", 45, "Fractursdssds");

        p1.displayPatientDetails();
        p2.displayPatientDetails();
        Patient.getTotalPatients();
    }
}
