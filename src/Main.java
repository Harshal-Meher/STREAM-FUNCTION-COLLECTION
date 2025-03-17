import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(101,"Harshal",23,50000,new Department("IT")),
                new Employee(102,"Roshan",24,60000,new Department("IT")),
                new Employee(103,"Ram",55,40000,new Department("HR")),
                new Employee(104,"Jagrut",23,30000,new Department("ME"))

            );
        // Find the oldest employee (with the highest age)
        Employee oldestEmployee = list.stream().max(Comparator.comparingInt(Employee::getEmpAge)).get();
        System.out.println("Oldest employee: " + oldestEmployee);

        //Total number of employee indivisual department
        Map<String, Long> totalNoEmp = list.stream()
                .collect(Collectors.groupingBy(e -> e.getDept().getDeptName(), Collectors.counting()));

        System.out.println("Total number of employees in each department:");
        totalNoEmp.forEach((department, count) ->
                System.out.println("Department: " + department + " | Total Employees: " + count)
        );

        // 3.1) List older employees for a particular department (like IT)
        String departmentToFilter = "IT";
        System.out.println("Older employees in department: " + departmentToFilter);

//       list.stream().filter(e -> e.getDept().getDeptName().equalsIgnoreCase("IT"))
//                .sorted(Comparator.comparingInt(Employee::getEmpAge).reversed())
//                .forEach(e -> {
//                    System.out.println(e);
//                });

       List<Employee> res = list.stream().filter(e -> e.getDept().getDeptName().equalsIgnoreCase(departmentToFilter))
                .sorted(Comparator.comparingInt(Employee::getEmpAge).reversed()).collect(Collectors.toList());
       res.forEach(employee -> {
           System.out.println(employee);
       });

       }
    }

