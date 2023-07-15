package EmployeePackage;
import java.util.*;
public class EmployeeDetails {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int choice = 0;
        List<Employee> employeesList = new ArrayList<>();
        Set<Employee> employeesSet = new HashSet<>();
        Map<Integer, Employee> employeesMap = new HashMap<>();
        Vector<Employee> employeesVector = new Vector<>();
        Stack<Employee> employeesStack = new Stack<>();

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Add employee");
            System.out.println("2. Remove employee");
            System.out.println("3. Search employee");
            System.out.println("4. Display all employees");
            System.out.println("5. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Employee emp = getEmployeeDetails();
                    employeesList.add(emp);
                    employeesSet.add(emp);
                    employeesMap.put(emp.getId(), emp);
                    employeesVector.add(emp);
                    employeesStack.push(emp);
                    break;
                case 2:
                    System.out.println("Enter employee ID:");
                    int id = scanner.nextInt();
                    employeesList.removeIf(e -> e.getId() == id);
                    employeesSet.removeIf(e -> e.getId() == id);
                    employeesMap.remove(id);
                    employeesVector.remove(id);
                    employeesStack.pop();
                    break;
                case 3:
                    System.out.println("Enter employee ID:");
                    int searchId = scanner.nextInt();
                    Employee searchedEmp = employeesMap.get(searchId);
                    if (searchedEmp != null) {
                        System.out.println("Employee found:");
                        System.out.println(searchedEmp);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    System.out.println("Employees in list:");
                    displayEmployees(employeesList);
                    System.out.println("Employees in set:");
                    displayEmployees(employeesSet);
                    System.out.println("Employees in map:");
                    displayEmployees(employeesMap.values());
                    System.out.println("Employees in vector:");
                    displayEmployees(employeesVector);
                    System.out.println("Employees in stack:");
                    displayEmployees(employeesStack);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);
    }

    private static Employee getEmployeeDetails() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee ID:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter employee designation:");
        String designation = scanner.nextLine();
        System.out.println("Enter employee salary:");
        int salary = scanner.nextInt();

        return new Employee(id, name, designation, salary);
    }

    private static void displayEmployees(Collection<Employee> employees) {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

class Employee {
    private int id;
    private String name;
    private String designation;
    private int salary;

    public Employee(int id, String name, String designation, int salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return id + ": " + name + " (" + designation + ") - Rs" + salary;
    }
}
