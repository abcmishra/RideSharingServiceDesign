public class CreditCard implements PaymentStrategy{
    @Override
    public void makePayment(String message){
        System.out.println("Payment made via credit card");
    }
}
