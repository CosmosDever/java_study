package java_study.lab4_case3;

public class EconomySeat implements FlightSeat {
    private static final double BASE_COST = 2500.0;

    @Override
    public double getCost() {
        return BASE_COST;
    }

    @Override
    public String getDescription() {
        return "Economy class";
    }
}
