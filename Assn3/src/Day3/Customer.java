package Day3;

public class Customer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    String name;
    String address;
    String city;
    String province;

    public Customer(String name, String address, String city, String province) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.province = province;
    }

    public Customer(String name) {
        this.name = name;
        this.address = "none";
        this.city = "Calgary?";
        this.province = "AB?";
    }

    public String makePhonebookName()
    {
        int spacePosition = this.name.indexOf(' ');
        if (spacePosition < 0) return name; //No space

        String pbName = "";
        pbName += this.name.substring(spacePosition + 1); // Last name: everything after the space
        pbName += ", ";
        pbName += this.name.substring(0, spacePosition);  // First name: first word (before the space)

        return pbName;
    }
}
