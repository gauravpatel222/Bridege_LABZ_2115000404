import java.util.Scanner;

class Employee {
    String name;
    int id;
    String dept;
    int age;
    int salary;
    Employee next;

    public Employee(String name, int id, String dept, int age, int salary) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.age = age;
        this.salary = salary;
        this.next = null;
    }
}

interface Service {
    void add(String name, int id, String dept, int age, int salary);
    void update(int id, String name, int age, int salary);
    void delete(int id);
    void display();
}

class EmployeeService implements Service {
    Employee head;

    public EmployeeService() {
        this.head = null;
    }

    public void add(String name, int id, String dept, int age, int salary) {
        Employee e = new Employee(name, id, dept, age, salary);
        if (head == null) {
            head = e;
        } else {
            Employee temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = e;
        }
    }

    public void update(int id, String name, int age, int salary) {
        Employee temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.name = name;
                temp.age = age;
                temp.salary = salary;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public void delete(int id) {
        if (head == null) {
            System.out.println("No employees to delete.");
            return;
        }

        if (head.id == id) {
            head = head.next;
            return;
        }

        Employee temp = head;
        Employee prev = null;

        while (temp != null && temp.id != id) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Employee with ID " + id + " not found.");
            return;
        }

        prev.next = temp.next;
    }

    public void display() {
        if (head == null) {
            System.out.println("No employees to display.");
            return;
        }

        Employee temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.name + " " + temp.dept + " " + temp.age + " " + temp.salary);
            temp = temp.next;
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
          EmployeeService service = new EmployeeService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Department: ");
                    String dept = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter Salary: ");
                    int salary = scanner.nextInt();
                    service.add(name, id, dept, age, salary);
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Employee ID to Update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Age: ");
                    int newAge = scanner.nextInt();
                    System.out.print("Enter New Salary: ");
                    int newSalary = scanner.nextInt();
                    service.update(updateId, newName, newAge, newSalary);
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = scanner.nextInt();
                    service.delete(deleteId);
                    break;

                case 4:
                    service.display();
                    break;

                case 5:
                    System.out.println("Exiting Employee Management System.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
