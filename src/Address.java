public class Address {
  private   String street;
  private int zip;


    public Address(String street, int zip) {
        this.street = street;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public int getZip() {
        return zip;
    }
}
