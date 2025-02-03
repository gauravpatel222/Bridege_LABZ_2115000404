class Employee {

    static String companyName = "GUZZZARs";
    static int totalEmployees = 0;   
    final int id;
    String name;
    String designation;

  
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++; 
    }

  
    public void displayEmployeeDetails() {
        if (this instanceof Employee) { 
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
       
        }
    }

   
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
      
        Employee e1 = new Employee(3096, "Gaurav", "PRADHAN");
        Employee e2 = new Employee(3096, "ayush", "PEON");

        Employee.displayTotalEmployees();
        
        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        Employee.displayTotalEmployees();

        
    }
}
