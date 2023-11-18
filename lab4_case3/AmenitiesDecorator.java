package java_study.lab4_case3;

public class AmenitiesDecorator extends SeatDecorator {
    private double wifiCost;
    private double liveTVCost;
    private double wineCost;

    public AmenitiesDecorator(FlightSeat seat, double wifiCost, double liveTVCost, double wineCost) {
        super(seat);
        this.wifiCost = wifiCost;
        this.liveTVCost = liveTVCost;
        this.wineCost = wineCost;
    }

    @Override
    public double getCost() {
        return super.getCost() + wifiCost + liveTVCost + wineCost;
    }

    @Override
    public String getDescription() {
        return seat.getDescription() + addAmenitiesDescription();
    }

    private String addAmenitiesDescription() {
        StringBuilder description = new StringBuilder(" with amenities: ");
        if (wifiCost > 0) {
            description.append("WiFi, ");
        }
        if (liveTVCost > 0) {
            description.append("Live TV, ");
        }
        if (wineCost > 0) {
            description.append("Wine, ");
        }
        return description.toString().replaceAll(", $", ""); // Remove trailing comma
    }
}
