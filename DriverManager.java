import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriverManager {
    //require less searches to find available driver
    private Map<String,Driver> driverMapAvailable;
    private Map<String,Driver> driverMapOccupied;

    public DriverManager(){
        this.driverMapAvailable = new HashMap<>();
        this.driverMapOccupied = new HashMap<>();
    }

    public void createDriver(){
        Address address= new Address("213","90","jerakphur","Punjab");
        Vehicle vehicle = new Vehicle("9999","9949499494");
        Driver driver1 = new Driver("123","Shashank","3456",address,vehicle);
        driverMapAvailable.put(driver1.getDriverID(), driver1);
       Driver driver2= new Driver("125","Shashank","3456",address,vehicle);
        driverMapAvailable.put(driver2.getDriverID(), driver2);
        Driver driver3= new Driver("153","Shashank","3456",address,vehicle);
        driverMapAvailable.put(driver3.getDriverID(), driver3);
        Driver driver4= new Driver("129","Shashank","3456",address,vehicle);
        driverMapAvailable.put(driver4.getDriverID(), driver4);

    }
    public Driver getDriver(){
        Map.Entry<String, Driver> driver = driverMapAvailable.entrySet().iterator().next();
        driverMapOccupied.put(driver.getKey(),driver.getValue());
        driverMapAvailable.remove(driver.getKey());
        return driver.getValue();

    }




}
