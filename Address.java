public class Address {
    private String lat;
    private String longitude;
    private String cityName;
    private String stateName;
    private String zipcode;
    private String phoneNumber;


    public Address(String lat,String longitude,String cityName,String stateName){
        this.cityName=cityName;
        this.lat=lat;
        this.longitude=longitude;
        this.stateName=stateName;

    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLat() {
        return lat;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
