package java_study.Lab4_case1;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    
    public void draw() {
        decoratedShape.draw();
    }
    
}
