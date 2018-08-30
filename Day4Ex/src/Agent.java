
/*
 * Created by Joel Barr
 * 8/29/18 2:41 PM.
 * SAIT CMPP-264, Summer 2018
 * Day 4 Exercise
 */

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

    //Prints out Agent information
    public void display()
    {
        //3 lines are printed with everything under the name being indented
        System.out.printf("%s\n\t%s\n\tCommission: %s\n\n",
                makePhonebookName(),
                phone,
                commissionRate);
    }
}
