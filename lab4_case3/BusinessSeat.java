package java_study.lab4_case3;

public class BusinessSeat extends SeatDecorator {
    private static final double BUSINESS_COST = 2000.0;

    public BusinessSeat(FlightSeat seat) {
        super(seat);
    }

    @Override
    public double getCost() {
        return super.getCost() + BUSINESS_COST;
    }

    @Override
    public String getDescription() {
        return seat.getDescription() + ", Business class";
    }
}
