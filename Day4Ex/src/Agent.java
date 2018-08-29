public class Agent extends Person {
    private String phone;
    private double commissionRate;

    // Phone
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    // Commission rate
    public double getCommissionRate() {
        return commissionRate;
    }
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    // Constructor
    public Agent(String name, String phone, double commissionRate) {
        super(name);
        this.phone = phone;
        this.commissionRate = commissionRate;
    }

    public void display()
    {
        System.out.printf("%s\n\t%s\n\tCommission: %s\n\n",
                makePhonebookName(),
                phone,
                commissionRate);
    }
}
