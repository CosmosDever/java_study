package java_study.study_before_tset;
//abstract
abstract class Shape{
    abstract void calArea();
    public int length;
    public int width;
    public int radius;
    public void setLength(int length){
        this.length = length;
    }
    public void setwidth(int width){
        this.width = width;
    }
    public void setradius(int radius){
        this.radius = radius;
    }

}
class Circle extends Shape {
    void calArea(){
        System.out.println("Area: "+3.14*this.radius);
    }
    
}

//Inheritance

// class person{
//     public String name;
//     public int age;
//     void introduce(){
//         System.out.print("My name is "+name);
//         System.out.print("\nAge :"+age);
//     }
// }
// class student extends person{ 
//     void setname(String name){
//         this.name = name;
//     }
//     void setage(int age){
//         this.age = age;
//     }   
// }
// คลาส Person
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("ชื่อ: " + name);
        System.out.println("อายุ: " + age + " ปี");
    }
}

// คลาส Student สืบทอดจาก Person
class Student extends Person {
    private String studentID;

    public Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    public void study() {
        System.out.println("นักศึกษารหัส: " + studentID + " กำลังเรียน");
    }
}


public class A_I_P_E{
    public static void main (String[] args) throws Exception {
        Person person = new Person("John", 30);

        // เรียกใช้เมธอด introduce ของคลาส Person
        System.out.println("ข้อมูลบุคคล:");
        person.introduce();

        // สร้างอ็อบเจ็กต์ของคลาส Student
        Student student = new Student("Alice", 20, "12345");

        // เรียกใช้เมธอด introduce ของคลาส Person ซึ่ง Student สามารถใช้ได้เนื่องจากสืบทอด
        System.out.println("\nข้อมูลนักศึกษา:");
        student.introduce();

        // เรียกใช้เมธอด study ของคลาส Student
        student.study();
    }
}