package java_study.test_20;

public class X {
    protected int id;
    public X(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public String toString(){
        return "X: " + id;
    }
    public String getDescriptor(){
        return "D: "+this.getId();
    }
}
