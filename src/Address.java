public class Address {
    private String houseNumber;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String houseNumber, String street, String city, String state, String zipCode){
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address(Address addressToCopy){
        this.houseNumber = addressToCopy.getHouseNumber();;
        this.street = addressToCopy.getStreet();
        this.city = addressToCopy.getCity();
        this.state = addressToCopy.getState();
        this.zipCode = addressToCopy.getZipCode();
    }

    public Address(String addressString){
        this.houseNumber = addressString.substring(0, addressString.indexOf(" "));
        addressString = addressString.substring(addressString.indexOf(" ") + 1);
        this.street = addressString.substring(0, addressString.indexOf(","));
        addressString = addressString.substring(addressString.indexOf(",") + 2);
        this.city = addressString.substring(0, addressString.indexOf(","));
        addressString = addressString.substring(addressString.indexOf(",") + 2);
        this.state = addressString.substring(0, addressString.indexOf(" "));
        addressString = addressString.substring(addressString.indexOf(" ") + 1);
        this.zipCode = addressString;

    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String toString(){
        return (houseNumber + " " + street + ", " + city + ", " + state + " " + zipCode);
    }
}
