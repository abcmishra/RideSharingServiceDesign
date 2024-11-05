public class Payment {
    private String id;
    private int totalAmount;
    private int bookRideId;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;

    public Payment(String id, int totalAmount, int bookRideId, PaymentStatus paymentStatus) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.bookRideId = bookRideId;
        this.paymentStatus = paymentStatus;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getBookRideId() {
        return bookRideId;
    }

    public void setBookRideId(int bookRideId) {
        this.bookRideId = bookRideId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
