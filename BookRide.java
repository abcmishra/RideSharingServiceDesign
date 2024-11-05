public class BookRide implements Ride{
    private String bookId;
    private Address source;
    private Address destination;
    private Driver driver;
    private Rider rider;
    private DriverManager driverManager;
    private Payment payment;

    public BookRide(String bookId, Address source, Address destination, Driver driver, Rider rider) {
        this.bookId = bookId;
        this.source = source;
        this.destination = destination;
        this.driver = driver;
        this.rider = rider;
    }

    public void bookRide(){
       driverManager.getDriver();
       rider.onRideStatusChanged("Ride has been assigned to you");
       driver.onRideStatusChanged("Please accepth the ride");
    }

    @Override
    public void startRide(){
        System.out.println("Ride has started");
        rider.onRideStatusChanged("Ride has started");
        driver.onRideStatusChanged("Ride has started");
    }
    @Override
    public void endRide(){
        System.out.println("Ride Completed");
        rider.onRideStatusChanged("Ride has completed");
        driver.onRideStatusChanged("Ride has completed");
        status=payment.invokePayment(bookId);



    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Address getSource() {
        return source;
    }

    public void setSource(Address source) {
        this.source = source;
    }

    public Address getDestination() {
        return destination;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }
}
