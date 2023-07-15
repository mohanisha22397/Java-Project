package EmployeePackage;
import java.util.*;
public class EmpManagement {
    @SuppressWarnings("unused")
	public static void main(String[] args) {

        List<String> employeesList = new ArrayList<>();
        Set<String> employeesSet = new HashSet<>();
        Map<Integer, String> employeesMap = new HashMap<>();
        Vector<String> employeesVector = new Vector<>();
        Stack<String> employeesStack = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        int choice, employeeId;
        String employeeName, employeeDesignation;
        double employeeSalary;

        do {
            System.out.println("\n Employee Details Management System");
            System.out.println("1. Add employee details to list");
            System.out.println("2. Add employee details to set");
            System.out.println("3. Add employee details to map");
            System.out.println("4. Add employee details to vector");
            System.out.println("5. Add employee details to stack");
            System.out.println("6. Display employees by collection type");
            System.out.println("7. Remove employee from set");
            System.out.println("8. Remove employee from map");
            System.out.println("9. Remove employee from vector");
            System.out.println("10. Remove employee from stack");
            System.out.println("11. Display employees in list");
            System.out.println("12. Display employees in set");
            System.out.println("13. Display employees in map");
            System.out.println("14. Display employees in vector");
            System.out.println("15. Display employees in stack");
            System.out.println("16. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the employee name: ");
                    employeeName = scanner.next();
                    employeesList.add(employeeName);
                    System.out.println("Employee added to the list.");
                    break;
                case 2:
                    System.out.print("Enter the employee name: ");
                    employeeName = scanner.next();
                    employeesSet.add(employeeName);
                    System.out.println("Employee added to the set.");
                    break;
                case 3:
                    System.out.print("Enter the employee id: ");
                    employeeId = scanner.nextInt();
                    System.out.print("Enter the employee name: ");
                    employeeName = scanner.next();
                    employeesMap.put(employeeId, employeeName);
                    System.out.println("Employee added to the map.");
                    break;
                case 4:
                    System.out.print("Enter the employee name: ");
                    employeeName = scanner.next();
                    employeesVector.add(employeeName);
                    System.out.println("Employee added to the vector.");
                    break;
                case 5:
                    System.out.print("Enter the employee name: ");
                    employeeName = scanner.next();
                    employeesStack.push(employeeName);
                    System.out.println("Employee added to the stack.");
                    break;
                case 6:
                    System.out.println("Employees by collection type:");
                    System.out.println("List: " + employeesList);
                    System.out.println("Set: " + employeesSet);
                    System.out.println("Map: " + employeesMap);
                    System.out.println("Vector: " + employeesVector);
                    System.out.println("Stack: " + employeesStack);
                    break;
                case 7:
                    if (!employeesSet.isEmpty()) {
                        System.out.print("Enter the employee name to remove: ");
                        employeeName = scanner.next();
                        if (employeesSet.remove(employeeName)) {
                            System.out.println("Employee removed from the set.");
                        } else {
                            System.out.println("Employee not found in the set.");
                        }
                    } else {
                        System.out.println("Set is empty.");
                    }
                    break;
                case 8:
                	if (!employeesMap.isEmpty()) {
                		System.out.print("Enter the employee id to remove: ");
                		employeeId = scanner.nextInt();
                		if (employeesMap.containsKey(employeeId)) {
                		employeesMap.remove(employeeId);
                		System.out.println("Employee removed from the map.");
                		} else {
                		System.out.println("Employee not found in the map.");
                		}
                		} else {
                		System.out.println("Map is empty.");
                		}
                		break;
                		case 9:
                		if (!employeesVector.isEmpty()) {
                		System.out.print("Enter the employee name to remove: ");
                		employeeName = scanner.next();
                		if (employeesVector.remove(employeeName)) {
                		System.out.println("Employee removed from the vector.");
                		} else {
                		System.out.println("Employee not found in the vector.");
                		}
                		} else {
                		System.out.println("Vector is empty.");
                		}
                		break;
                		case 10:
                		if (!employeesStack.isEmpty()) {
                		String removedEmployee = employeesStack.pop();
                		System.out.println("Employee removed from the stack: " + removedEmployee);
                		} else {
                		System.out.println("Stack is empty.");
                		}
                		break;
                		case 11:
                		System.out.println("Employees in the list:");
                		for (String employee : employeesList) {
                		System.out.println(employee);
                		}
                		break;
                		case 12:
                		System.out.println("Employees in the set:");
                		for (String employee : employeesSet) {
                		System.out.println(employee);
                		}
                		break;
                		case 13:
                		System.out.println("Employees in the map:");
                		for (Map.Entry<Integer, String> entry : employeesMap.entrySet()) {
                		System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
                		}
                		break;
                		case 14:
                		System.out.println("Employees in the vector:");
                		for (String employee : employeesVector) {
                		System.out.println(employee);
                		}
                		break;
                		case 15:
                		System.out.println("Employees in the stack:");
                		for (String employee : employeesStack) {
                		System.out.println(employee);
                		}
                		break;
                		case 16:
                		System.out.println("Exiting...");
                		break;
                		default:
                		System.out.println("Invalid choice. Please enter a number between 1 and 16.");
                		}} while (choice != 16);

        scanner.close();
    } }
            
