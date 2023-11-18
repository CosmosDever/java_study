package java_study.Lab4_case2;

public class CurrencyFactory {
    public static Currency getCurrencyByCountry(String cnty) throws Exception{
        if(cnty.equals("India")) {
            return new India();
        } else if(cnty.equals("USA")) {
            return new USD();
        } else {
            throw new Exception("Invalid Country");
        }
    }

    public static void main(String[] args) throws Exception {
        Currency currency = CurrencyFactory.getCurrencyByCountry("Thailand");
        System.out.println(currency.getCurrency());
        System.out.println(currency.getSymbol());
    }
}