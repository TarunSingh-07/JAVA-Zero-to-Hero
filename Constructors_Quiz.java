package com.company;
// Here we do a quiz question of constructor
// Overload the employee constructor to initialize the salary to Rs. 10,000

class MyEmployeeTarun{
    private int id;
    private String name;
    private int salary;

    public MyEmployeeTarun(){
        id = 11;
        System.out.println("The id is : " + id);
        name = "equinox";
        System.out.println("The name is : " + name);
        salary = 7000;
        System.out.println("The salary is : " + salary);
    }
    public MyEmployeeTarun(int i, String na, int s){
        System.out.println("The id is : " + i);
        System.out.println("The Name is : " + na);
        System.out.println("The salary is : " + s);
//        id = i;
//        name = na;
//        salary = s;
    }
    public MyEmployeeTarun( String na, int s) {
        System.out.println("The Name is : " + na);
        System.out.println("The salary is : " + s);
    }

    

//    public int getId(){
//        return id;
//    }
//    public String getName(){
//        return name;
//    }
//    public int getSalary(){
//        return salary;
//    }
}
public class Constructors_Quiz {
    public static void main(String[] args) {
        MyEmployeeTarun mint = new MyEmployeeTarun();
        MyEmployeeTarun itachi = new MyEmployeeTarun(12,"Obito",10000);
        MyEmployeeTarun kakashi = new MyEmployeeTarun("Madara",12000);
        System.out.println("hello world");
        System.out.println("hello world");
        

//        MyEmployeeTarun ob = new MyEmployeeTarun(12,"Obito",10000);
//        System.out.println(ob.getId());
//        System.out.println(ob.getName());
//        System.out.println(ob.getSalary());
    }
}
