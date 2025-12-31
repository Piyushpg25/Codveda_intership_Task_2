// CURD (CREATE,UPDATE,READ,DELETE) Logic

import java.util.ArrayList;
public class EmployeeService {
    
    private ArrayList<Employee> employeeList = new ArrayList<>();

    // Add Employee
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("Employee added successfully");
    }

    // View All Employees
    public void viewEmployee() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees found");
            return;
        }
        for(Employee emp: employeeList) {
            emp.displayEmployee();
        }
    }

    // Update Employee
    public void updateEmployee(int id, String name, double salary, String department) {
        for(Employee emp: employeeList) {
            if(emp.getId() == id) {
                emp.setName(name);
                emp.setSalary(salary);
                emp.setDeparment(department);
                System.out.println("Employee updated successfully");
                return;
            }
        }
        System.out.println("Empolyee not found");
    }

    // Delete Employee
    public void deleteEmployee(int id) {
        for(Employee emp: employeeList){
            if(emp.getId() == id) {
                employeeList.remove(emp);
                System.out.println("Employee deleted successfully");
                return;
            }
        }
        System.out.println("Employee not found");
    }
}
