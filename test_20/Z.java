package java_study.test_20;

public class Z extends Y{
    private int id;

    public Z(String s,int id){
        super(s,id+2);
        this.id = id;
    }
    public int getId()
    {
        return this.id;
    }
}
