package java_study.test_20;

public class Y extends X{
    protected String s;

    public Y(String s,int val){
        super(val);
        this.s = s;
    }

    public String toString(){
        return this.s + ": " + this.id;
    }
    public String supeString(){
        return super.toString();
    }
}
