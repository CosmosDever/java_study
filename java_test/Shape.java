public class Shape {
    public void what(){System.out.println("Shape ");}
    public static void main(String[] args) {
        Shape[] shapes = {new Shape(),  new Rectangle(),new Square(), new Circle(),};
        for (Shape s: shapes) {
            s.what();
            System.out.print(" ");
        }
    }
}
class Rectangle extends Shape{
    public void what(){System.out.println("Rectangle ");}
}
class Square extends Rectangle{
}
class Oval extends Shape{
    public void what(){System.out.println("Oval ");}
}
class Circle extends Oval{
    public void what(){System.out.println("Circle ");}
}
