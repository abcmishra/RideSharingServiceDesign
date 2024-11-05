public class Rider implements RideStatusListener {
    private String rideId;
    private String riderName;
    private Address address;

    public Rider(String rideId,String riderName){
        this.rideId=rideId;
        this.riderName=riderName;
    }

   @Override
   public void onRideStatusChanged(String status){
        System.out.println("Rider notified: "+status);
   }



    public Address getAddress() {
        return address;
    }
    public void  setRiderName(String riderName){
        this.riderName=riderName;
    }
    public String getRiderName(){
        return this.riderName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }
}
