package javaExampleCopy.deepCopy.firstExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class DeepCopyDemoMain {

    // Declare a deprecation
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create the original employee list
        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        // Add the employee
        employeeArrayList.add(new Employee(1l, "adam", new Date(1982, 02, 12)));
        System.out.println(employeeArrayList);

        // Create a clone employee list
        ArrayList<Employee> employeeListClone = new ArrayList<>();

        Iterator<Employee> iterator = employeeArrayList.iterator();
        while(iterator.hasNext()) {
            employeeListClone.add((Employee)iterator.next().clone());
        }

        employeeArrayList.get(0).setId(2l);
        employeeArrayList.get(0).setName("brian");
        employeeArrayList.get(0).getDob().setDate(13);

        System.out.println(employeeArrayList.toString());
        System.out.println(employeeListClone.toString());
    }
}
