public class Customer extends Person {
    private String address;
    private String city;
    private String province;

    // Address
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    //City
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    //Province
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }

    public Customer(String name, String address, String city, String province) {
        super(name);
        this.address = address;
        this.city = city;
        this.province = province;
    }

    public Customer(String name) {
        this(name, "none", "Calgary?", "AB?");
    }

    public void display ()
    {
        System.out.printf("%s\n\t%s\n\t%s, %s\n\n",
                makePhonebookName(),
                address,
                city, province);
    }


}
