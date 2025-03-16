import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(101,"Harshal",23,50000,new Department("IT")),
                new Employee(102,"Roshan",24,60000,new Department("Finance")),
                new Employee(103,"Ram",55,40000,new Department("HR")),
                new Employee(104,"Jagrut",23,30000,new Department("ME"))

            );
        // Find the oldest employee (with the highest age)
        Employee oldestEmployee = list.stream().max(Comparator.comparingInt(Employee::getEmpAge)).get();
        System.out.println("Oldest employee: " + oldestEmployee);


    }


}
