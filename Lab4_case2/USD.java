package java_study.Lab4_case2;

public class USD implements Currency {
    
    @Override
    public String getCurrency() {
        return "Dollar";
    }
    
    @Override
    public String getSymbol() {
        return "$";
    }
    
}
