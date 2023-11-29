import com.workintech.maps.Employee;

import java.util.*;

public class Main {

    public static void employeeMaps() {

        Employee employee1 = new Employee(46532168, "Doğancan ", "Kınık");
        Employee employee2 = new Employee(87153289, "Emre ", "Şahiner");
        Employee employee3 = new Employee(94652356, "Erhan ", "Fırat");
        Employee employee4 = new Employee(98465231, "Gökhan ", "Özdemir");
        Employee employee5 = new Employee(13968435, "Ahmet Can ", "Yalçınkaya");

        List<Employee> employees = new LinkedList<>();
        List<Employee> duplicates = new LinkedList<>();
        Map<Integer, String> unique = new HashMap<>();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee2);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee5);
        employees.add(employee5);

        System.out.println(employees);
        System.out.println("----------------------------");

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            if(employee == null){
                continue;
            }
            if (unique.containsKey(employee.getId())) {
                duplicates.add(employee);
                employeeIterator.remove();
            } else {
                unique.put(employee.getId(), (employee.getFirstName() + employee.getLastName()));
            }
        }

        System.out.println(employees);

        System.out.println("----------------------------");
        System.out.println("Original Employee List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("\nDuplicates List:");
        for (Employee employee : duplicates) {
            System.out.println(employee);
        }

        System.out.println("\nUnique Employee Map:");
        for (Map.Entry<Integer, String> entry : unique.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
    public static void main(String[] args) {

        employeeMaps();

    }
}