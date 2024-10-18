import java.util.*;
public class OOPS {
    public static void main(String[] args) {
//        Pen p1=new Pen();
//        p1.setColor("Blue");
//        p1.setTip(5);
//        System.out.println(p1.getColor());
//        System.out.println(p1.getTip());

//        BankAcc obj=new BankAcc();
//        obj.username="Priya";
//        obj.setPassword("abcd");
//        System.out.println(obj.username);

//        Student s1=new Student("Priya");
//        System.out.println(s1.name);
//        Student s2=new Student();
//        Student s3=new Student(123);
//        System.out.println(s3.roll);

//        Student s1=new Student();
//        s1.name="Priya";
//        s1.roll=123;
//        s1.password="abcd";
//        s1.marks[0]=100;
//        s1.marks[1]=90;
//        s1.marks[2]=80;
//
//        Student s2=new Student(s1);
//        s2.password="pqs";
//        s1.marks[2]=100;
//        for(int i=0;i<3;i++){
//            System.out.println(s2.marks[i]);
//        }

//        fish obj=new fish();
//        obj.eat();

        Horse obj=new Horse();
        obj.eat();
        obj.walk();

        chick obj1=new chick();
        obj1.eat();
        obj1.walk();

//        BankAcc obj=new BankAcc();
//        obj.schoolName="JMV";
//
//        BankAcc obj2=new BankAcc();
//        System.out.println(obj2.schoolName);
//
//        BankAcc obj3=new BankAcc();
//        obj3.schoolName="ABC";
    }
}

//class Pen{
//    Private String color;
//    Private int tip;
//
//    void setColor(String newColor){
//        color=newColor;
//    }
//
//    void setTip(int newTip){
//        tip=newTip;
//    }
//
//    String getColor(){
//        return this.color;
//    }
//
//    int getTip(){
//        return this.tip;
//    }
//}

class BankAcc{
    public String username;
    private String password;

    static String schoolName;

    void setName(String name){
        username=name;
    }

    public void setPassword(String pwd){
        password=pwd;
    }
}

//class Student{
//    String name;
//    int roll;
//    String password;
//    int marks[];
//
//    //shallow copy constucter
////    Student(Student s1){
////        marks=new int[3];
////        this.name=s1.name;
////        this.roll=s1.roll;
////        this.marks=s1.marks;
////    }
//
//    //deep copy
//    Student(Student s1){
//        marks=new int[3];
//        this.name=s1.name;
//        this.roll=s1.roll;
//        for(int i=0;i<marks.length;i++){
//            this.marks[i]=s1.marks[i];
//        }
//    }
//
//    Student(){
//        marks=new int[3];
//        System.out.println("Constructer is invoked.");
//    }
//    Student(String name){
//        marks=new int[3];
//        this.name=name;
//    }
//    Student(int roll){
//        marks=new int[3];
//        this.roll=roll;
//    }
//}

//----------------Inheritance------------
//class Animals{
//    String color;
//
//    void eat(){
//        System.out.println("eat");
//    }
//}
//class fish extends Animals{
//     int wings;
// }

//------------------------------Abstraction------------------
abstract class Animal{
    void eat(){
        System.out.println("animal eats.");
    }

    abstract void walk();
}
class Horse extends Animal{

    void walk(){
        super.eat();
        System.out.println("Walks on 4 legs");
    }
}
class chick extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

