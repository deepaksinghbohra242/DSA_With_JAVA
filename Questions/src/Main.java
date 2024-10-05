import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"HR" , 2000));
        emp.add(new Employee(4,"HR" , 2000));
        emp.add(new Employee(5,"HR" , 2050));
        emp.add(new Employee(6,"HR" , 2000));
        emp.add(new Employee(2,"Food" , 3000));
        emp.add(new Employee(7,"fashion" , 3000));
        emp.add(new Employee(3, "fashion" , 200));

        double avgSalry = emp.stream()
                            .filter((e)-> e.getDepartment().equals("HR"))
                            .mapToDouble(Employee::getSalary)
                            .average()
                            .orElse(0);

        System.out.println(avgSalry);

        emp.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ))
                .forEach((d , e)->System.out.println("department " + d + " " + e.toString()));


    }

}

 class Employee{
    int id;
    String department;
    float salary ;

     public Employee(int id, String department, float salary) {
         this.id = id;
         this.department = department;
         this.salary = salary;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getDepartment() {
         return department;
     }

     public void setDepartment(String department) {
         this.department = department;
     }

     public float getSalary() {
         return salary;
     }

     public void setSalary(float salary) {
         this.salary = salary;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "id=" + id +
                 ", department='" + department + '\'' +
                 ", salary=" + salary +
                 '}';
     }
 }


//     select e.emp_id as employee_id,
//        e.emp_name as employee_name,
//        m.emp_name as manager_name
//        from employee e
//        left join employee m on e.manager_id = m.emp_id;

//Arraylist
//r = 1
//i = 1 end  n middle
//d = 1 end n middle

// linked list
//r = n
//i = n end 1 if doubly
//d = n end 1 if doubly

//hashmap
//r = 1
//i = 1
//d = 1

// how GC works and how Heap memory area divided