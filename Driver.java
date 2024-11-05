public class Driver  implements RideStatusListener{
    private String driverID;
    private String driverName;
    private String driverLicense;
    private Address address;
    private Vehicle vehicle;
    private boolean isDriverAvailable;


    public Driver(String driverID, String driverName, String driverLicense,Address address,Vehicle vehicle) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.driverLicense = driverLicense;
        this.address=address;
        this.vehicle=vehicle;
        this.isDriverAvailable=true;

    }
   public boolean isDriverAvailable(){
        return this.isDriverAvailable;
   }
   public void setDriverStatus(){
        this.isDriverAvailable=false;
   }

    @Override
    public void onRideStatusChanged(String status){
        System.out.println("Driver notified: "+status);
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
