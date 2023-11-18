package java_study.lab4_case3;

public class Main {
    public static void main(String[] args) {
        FlightSeat economySeat = new EconomySeat();
        System.out.println("Base Economy Seat: " + economySeat.getDescription() + ", Cost: $" + economySeat.getCost());

        FlightSeat premiumEconomySeat = new PremiumEconomySeat(economySeat);
        System.out.println("Premium Economy Seat: " + premiumEconomySeat.getDescription() + ", Cost: $" + premiumEconomySeat.getCost());

        FlightSeat businessSeatWithAmenities = new AmenitiesDecorator(new BusinessSeat(economySeat), 10, 50, 30);
        System.out.println("Business Seat with Amenities: " + businessSeatWithAmenities.getDescription() + ", Cost: $" + businessSeatWithAmenities.getCost());

        FlightSeat firstClassSeatWithAllAmenities = new AmenitiesDecorator(new FirstClassSeat(economySeat), 10, 50, 30);
        System.out.println("First Class Seat with All Amenities: " + firstClassSeatWithAllAmenities.getDescription() + ", Cost: $" + firstClassSeatWithAllAmenities.getCost());
    }
}
