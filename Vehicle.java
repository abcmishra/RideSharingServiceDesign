import java.util.Date;

public class Vehicle {
    private String id;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String dateOfPurchase;

    public Vehicle(String id,String vehicleNumber,){
        this.id=id;
        this.vehicleNumber=vehicleNumber;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}
