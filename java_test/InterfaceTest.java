public interface InterfaceTest {
    public abstract void mult(int i);
} 
class ClassA implements InterfaceTest{
    double i;
    public void mult(int i){
        this.i *=i;
    }
}
