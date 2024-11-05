public class StandardRide implements Ride {
    @Override
    public void startRide() {
        System.out.println("Starting a standard ride.");
    }

    @Override
    public void endRide() {
        System.out.println("Ending a standard ride.");
    }

    @Override
    public double calculateFare() {
        return 10.0; // Example fare calculation
    }
}