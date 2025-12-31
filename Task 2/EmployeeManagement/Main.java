// Employee user interface

import java.util.Scanner; 
public class Main {
    
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit ");
            System.out.print(" Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Enter Department");
                    String dept = sc.nextLine();

                    Employee emp = new Employee(id, name, salary, dept);
                    service.addEmployee(emp);
                    break;

                    case 2:
                        service.viewEmployee();
                        break;

                        case 3:
                            System.out.println("Enter Employee ID to update");
                            int updatedId = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Enter New Name: ");
                            String newName = sc.nextLine();

                            System.out.println("Enter New Salary: ");
                            double newSalary = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("Enter New Department: ");
                            String newDept = sc.nextLine();

                            service.updateEmployee(updatedId, newName, newSalary, newDept);
                            break;

                            case 4: 
                            System.out.println("Enter Employee ID  to delete: ");
                            int deletedId = sc.nextInt();
                            service.deleteEmployee(deletedId);
                            break;

                            case 5: 
                            System.out.println("Exiting");
                            sc.close();
                            return;
                    
            
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
