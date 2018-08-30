
/*
 * Created by Joel Barr
 * 8/29/18 2:24 PM.
 * SAIT CMPP-264, Summer 2018
 * Day 4 Exercise
 */

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

    // Constructors
    public Customer(String name, String address, String city, String province) {
        super(name);
        this.address = address;
        this.city = city;
        this.province = province;
    }

    public Customer(String name) {
        this(name, "none", "Calgary?", "AB?");
    }

    //3 lines are printed with everything under the name being indented
    public void display ()
    {
        System.out.printf("%s\n\t%s\n\t%s, %s\n\n",
                makePhonebookName(),
                address,
                city, province);
    }


}
