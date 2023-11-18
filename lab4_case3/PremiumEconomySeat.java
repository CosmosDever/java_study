package java_study.lab4_case3;

public class PremiumEconomySeat extends SeatDecorator {
    private static final double PREMIUM_COST = 1000.0;

    public PremiumEconomySeat(FlightSeat seat) {
        super(seat);
    }

    @Override
    public double getCost() {
        return super.getCost() + PREMIUM_COST;
    }

    @Override
    public String getDescription() {
        return seat.getDescription() + ", Premium Economy";
    }
}
