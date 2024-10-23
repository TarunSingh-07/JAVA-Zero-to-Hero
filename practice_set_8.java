package com.company;
//Question on OOPS , Vid- 39

// Class 1
class Employee1{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

// Class 2
class Cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling mukul...");
    }
}
    // Class 3
    class Square{
        int side;
        public int area(){
            return side*side;
        }
        public int perimeter(){
            return 4*side;
        }
    }

    // Class 4
    class Rectangle{
        int length;
        int breadth;
        public int area(){
            return length*breadth;
        }
        public int perimeter(){
            return 2*(length + breadth);
        }
    }

    // Class 5
    class Tommyvecetti{
        public void hit(){
            System.out.println("Hitting the enemy");
        }
        public void run(){
            System.out.println("Running from  the enemy");
        }
        public void fire(){
            System.out.println("Firirng on the enemy");
        }
    }

    // Class 6
    class Circle{
        int r;
        double pie;
        public double area(){
            return pie*(r*r);
        }
        public double perimeter(){
            return 2*pie*r;
        }
    }


public class practice_set_8 {
    public static void main(String[] args) {
        // Problem 1
//        Employee1 harry = new Employee1();
//        harry.setName("codeWithHarry");
//        harry.salary = 233;
//        System.out.println(harry.getSalary());
//        System.out.println(harry.getName());

        // Problem 2
//        Cellphone mi = new Cellphone();
//        mi.callFriend();
//        mi.ringing();
//        mi.vibrating();

        // Problem 3
//        Square sq = new Square();
//        sq.side = 3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        // Problem 4
//        Rectangle re = new Rectangle();
//        re.length = 4;
//        re.breadth = 8;
//        System.out.println(re.area());
//        System.out.println(re.perimeter());

        // Problem 5
//        Tommyvecetti player1 = new Tommyvecetti();
//        player1.fire();
//        player1.run();
//        player1.hit();

        // Problem 6
        Circle cr = new Circle();
        cr.pie = 3.141;
        cr.r = 10;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());

    }
}
