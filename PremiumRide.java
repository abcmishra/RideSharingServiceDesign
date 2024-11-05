public class PremiumRide implements Ride {
    @Override
    public void startRide() {
        System.out.println("Starting a premium ride.");
    }

    @Override
    public void endRide() {
        System.out.println("Ending a premium ride.");
    }

    @Override
    public double calculateFare() {
        return 20.0; // Example fare calculation
    }
}