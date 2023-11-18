package java_study.lab4_case3;

public class FirstClassSeat extends SeatDecorator {
    private static final double FIRST_CLASS_COST = 3000.0;

    public FirstClassSeat(FlightSeat seat) {
        super(seat);
    }

    @Override
    public double getCost() {
        return super.getCost() + FIRST_CLASS_COST;
    }

    @Override
    public String getDescription() {
        return seat.getDescription() + ", First class";
    }
}
