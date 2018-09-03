package CustomerEntry;
/*
 * Created by Joel Barr
 * 8/29/18 2:24 PM.
 * SAIT CMPP-264, Summer 2018
 * Day 4 Exercise
 * Modified 8/30/18
 * Day 5 Exercise
 */

public class Customer extends Person {
    private int custID;
    private String address, city, province, postal, country;
    private String homePhone;
    private Integer agentID;

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
    //Postal
    public String getPostal() {
        return postal;
    }
    public void setPostal(String postal) {
        this.postal = postal;
    }

    // Constructors
    public Customer(String fistName, String lastName) {
        super(fistName, lastName);
    }

    public Customer(String fistName, String lastName,
                    String address, String city, String province, String postal, String country,
                    String homePhone) {
        super(fistName, lastName);
        this.address = address;
        this.city = city;
        this.province = province;
        this.postal = postal;
        this.country = country;
        this.homePhone = homePhone;
    }


    //3 lines are printed with everything under the name being indented
    public void display ()
    {
        System.out.printf("%s\n" +  // Name
                        //"\t%s\n" +  // Email
                        //"\t(H) %s\n" +    // Home Phone
                        "%s" +  //Optional: Business phone
                        "\t%s\n" +  // Address
                        "\t%s, %s\t%s\n" +  //City, Prov Postal
                        //"\t%s\n" +  //Country
                        "\n",
                makePhonebookName(),
                //email,
                //homePhone,
                businessPhone != null ? "\t(B) " + businessPhone + "\n" : "",
                address,
                city, province, postal);//,
                //country);
    }


}
