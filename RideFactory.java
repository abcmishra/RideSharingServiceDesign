public class RideFactory {
    public static Ride createRide(String type){
        switch (type){
            case "Standard":
                return  new StandardRide();
            case "Premium":
                return new PremiumRide();
            case "CarPool":
                return new CarPoolRide();
            default:
                throw new IllegalArgumentException("Not a valid ride")


        }
    }
}
