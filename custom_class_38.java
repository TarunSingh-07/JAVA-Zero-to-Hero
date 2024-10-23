package com.company;

class Employee{
    int id;          // Attribute 1
    String name;     // Attribute 2
    int salary;      // Attribute 3

    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary() {
        return salary;
    }
}
public class custom_class_38 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee tarun = new Employee();  // Instantiating a new Employee Object
        Employee john = new Employee();   // Instantiating a new Employee Object
        Employee equinox = new Employee();

        // Setting Attributes for tarun
        tarun.id = 12;
        tarun.name = "codeWithTarun";
        tarun.salary = 26000;

        // setting attribute for john
        john.id = 17;
        john.name = "rainy";
        john.salary = 20000;

        // Setting attribute for equinox
        equinox.id = 910;
        equinox.name = "Obito";
        equinox.salary = 30000;

        // Printing the attributes
        tarun.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);

        equinox.printDetails();
        //System.out.println(tarun.id);
        //System.out.println(tarun.name);
    }
}
