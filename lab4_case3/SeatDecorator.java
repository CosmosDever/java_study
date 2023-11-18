package java_study.lab4_case3;

public abstract class SeatDecorator implements FlightSeat {
    protected FlightSeat seat;

    public SeatDecorator(FlightSeat seat) {
        this.seat = seat;
    }

    @Override
    public double getCost() {
        return seat.getCost();
    }

    @Override
    public String getDescription() {
        return seat.getDescription();
    }
}
