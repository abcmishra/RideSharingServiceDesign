public class SurgePricing implements PricingStrategy{
    @Override
    public double calculateFare(double distance,double basePrice){
     return distance*basePrice*5;
    }
}
