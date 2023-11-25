public class Student {
    public String getFood(){
        System.out.println("Pizza");
        return "Pizza";
    }
    public String getInfo(){
        return this.getFood();
    }
    public static void main(String[] args) {
        Student s1 = new GradStudent();
        s1.getInfo();
    }
}
class GradStudent extends Student{
    public String getFood(){
        System.out.println("Taco");
        return "Taco";
    }
}
