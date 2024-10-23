package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    // Constructor automatically invoke
    public MyMainEmployee(){   // Constructor 1
        id = 45;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){   // Constructor 2
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){   // Constructor 3
        id = 1;
        name = myName;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }

}
public class Constructors_42 {
    public static void main(String[] args) {
//        MyMainEmployee tarun = new MyMainEmployee("CodeWithTarun", 18);  // Constructor 2 is called
        MyMainEmployee tarun = new MyMainEmployee();  // Constructor 1 is called
//        tarun.setName("CodeWithTarun");
//        tarun.getName();
        System.out.println(tarun.getId());
        System.out.println(tarun.getName());
    }
}
