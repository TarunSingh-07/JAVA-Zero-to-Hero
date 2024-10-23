package com.company;

/*   Function banake kisi bhi attribute ko private bana sakte he or private kr ne
ke baad usko .(dot) operator se access nhi kr sakte so humko "setter" use karna padta he.
Kiyn ki setter se hum value ko set kar sakte he
*/

class MyEmployee{
   private String name;
   private int id;

   public int getId(){
       return id;
   }
   public void setId(int i){
       id = i;
//       this.id = i;
   }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
//        this.name = n;
    }
}

class Circle1{
    private int r;
    private double pie;
    private double area;
    private double perimeter;

    public int getR(){
        return r;
    }
    public void setR(int a){
        r = a;
    }
    public double getPie(){
        return pie;
    }
    public void setPie(double b){
        pie = b;
    }

    public double getArea(){
        return area;
    }
    public void setArea(double ar){
         area = pie*(r*r);
         if(area == ar){
             System.out.println("Correct area");
         } else {
             System.out.println("Wrong area");
         }
    }

    public double getPerimeter(){
        return perimeter;
    }
    public void setPerimeter(double pe){
        perimeter = 2*pie*r;
        if (pe == perimeter) {
            System.out.println("Correct perimeter");
        } else {
            System.out.println("Wrong perimeter");
        }
    }
}

//If want to find area without user input area

//public double getArea(){
//    return area;
//}
//public void setArea(){
//    area = pie*(r*r);
//}

// If want to find perimeter without user input perimeter

//public double getPerimeter(){
//    return perimeter;
//}
//public void setPerimeter(){
//    perimeter = 2*pie*r;
//}

public class Getter_Setter_AccessModifier_40 {
    public static void main(String[] args) {
//        MyEmployee tarun = new MyEmployee();
////        tarun.id = 26;
////        tarun.name = "CodeWithTarun"; --> Throws an error due to private access modifier
//        tarun.setName("CodeWithTarun");
//        System.out.println(tarun.getName());
//        tarun.setId(26);
//        System.out.println(tarun.getId());

        Circle1 cr = new Circle1();
        cr.setR(5);
        System.out.println("Radius value is : " + cr.getR());
        cr.setPie(3.141);
        System.out.println("Pie value is : " + cr.getPie());
        cr.setArea(78.525);
        System.out.println("The area is : " + cr.getArea());
        cr.setPerimeter(31.41);
        System.out.println("The perimeter is : " + cr.getPerimeter());
    }
}
