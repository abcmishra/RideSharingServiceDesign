public class DebitCardPayment implements PaymentStrategy{
    @Override
    public void makePayment(String message){
        System.out.println("Payment made via DebitCard");
    }
}
