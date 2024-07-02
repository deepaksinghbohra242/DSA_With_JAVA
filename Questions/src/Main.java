import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("a",10));
        emp.add(new Employee("b" , 12));
        emp.add(new Employee("c" ,13));

        Collections.sort(emp , new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });

        for(Employee e : emp){
            System.out.println(e.getName() + " " + e.getAge());
        }
    }

}

 class Employee{
    String name;
    int age ;

    Employee(String n , int a){
        name = n;
        age = a;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }