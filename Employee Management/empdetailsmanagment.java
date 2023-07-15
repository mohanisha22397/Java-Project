package EmployeePackage;

import java.util.*;

public class EmployeeDetailsProject {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        List<String> employeesList = new ArrayList<String>();
        Set<String> employeesSet = new HashSet<String>();
        Map<Integer, String> employeesMap = new HashMap<Integer, String>();
        Vector<String> employeesVector = new Vector<String>();
        Stack<String> employeesStack = new Stack<String>();
        int choice = 0;
        String employeeName;
        int employeeId;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Add an employee to the list");
            System.out.println("2. Add an employee to the set");
            System.out.println("3. Add an employee to the map");
            System.out.println("4. Add an employee to the vector");
            System.out.println("5. Add an employee to the stack");
            System.out.println("6. Remove an employee from the list");
            System.out.println("7. Remove an employee from the set");
            System.out.println("8. Remove an employee from the map");
            System.out.println("9. Remove an employee from the vector");
            System.out.println("10. Remove an employee from the stack");
            System.out.println("11. Display all employees in the list");
            System.out.println("12. Display all employees in the set");
            System.out.println("13. Display all employees in the map");
            System.out.println("14. Display all employees in the vector");
            System.out.println("15. Display all employees in the stack");
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
                    if (!employeesList.isEmpty()) {
                        System.out.print("Enter the employee name to remove: ");
                        employeeName = scanner.next();
                        if (employeesList.remove(employeeName)) {
                            System.out.println("Employee removed from the list.");
                        } else {
                            System.out.println("Employee not found in the list.");
                        }
                    } else {
                        System.out.println("List is empty.");
                    }
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
                		System.out.println("Removing employee from the top of the stack: " + employeesStack.pop());
                		} else {
                		System.out.println("Stack is empty.");
                		}
                		break;
                		
                	case 11:
                		if (!employeesList.isEmpty()) {
                		System.out.println("Employees in the list:");
                		for (String employee : employeesList) {
                		System.out.println(employee);
                		}
                		} else {
                		System.out.println("List is empty.");
                		}
                		break;
                	case 12:
                		if (!employeesSet.isEmpty()) {
                		System.out.println("Employees in the set:");
                		for (String employee : employeesSet) {
                		System.out.println(employee);
                		}
                		} else {
                		System.out.println("Set is empty.");
                		}
                		break;
                		case 13:
                		if (!employeesMap.isEmpty()) {
                		System.out.println("Employees in the map:");
                		for (Map.Entry<Integer, String> entry : employeesMap.entrySet()) {
                		System.out.println("Employee id: " + entry.getKey() + " Name: " + entry.getValue());
                		}
                		} else {
                		System.out.println("Map is empty.");
                		}
                		break;
                		case 14:
                		if (!employeesVector.isEmpty()) {
                		System.out.println("Employees in the vector:");
                		for (String employee : employeesVector) {
                		System.out.println(employee);
                		}
                		} else {
                		System.out.println("Vector is empty.");
                		}
                		break;
                		case 15:
                		if (!employeesStack.isEmpty()) {
                		System.out.println("Employees in the stack:");
                		for (String employee : employeesStack) {
                		System.out.println(employee);
                		}
                		} else {
                		System.out.println("Stack is empty.");
                		}
                		break;
                	case 16:
                		System.out.println("Exiting...");
                		break;
                		default:
                		System.out.println("Invalid choice. Please try again.");
                		break;
                		
                		} 
    					}while (choice != 16);
                		System.out.println("Thank you for using the employee management system!");
    }
                	

                	/**

                	This method is used to print the menu of options available to the user.
                	*/
                	public static void printMenu() {
                	System.out.println("Please choose an option:");
                	System.out.println("1. Add employee to the list");
                	System.out.println("2. Add employee to the set");
                	System.out.println("3. Add employee to the map");
                	System.out.println("4. Add employee to the vector");
                	System.out.println("5. Add employee to the stack");
                	System.out.println("6. Clear all data structures");
                	System.out.println("7. Remove employee from the set by name");
                	System.out.println("8. Remove employee from the map by id");
                	System.out.println("9. Remove employee from the vector by name");
                	System.out.println("10. Remove employee from the stack");
                	System.out.println("11. View employees in the list");
                	System.out.println("12. View employees in the set");
                	System.out.println("13. View employees in the map");
                	System.out.println("14. View employees in the vector");
                	System.out.println("15. View employees in the stack");
                	System.out.println("16. Exit");
                	}
                	}
                	
