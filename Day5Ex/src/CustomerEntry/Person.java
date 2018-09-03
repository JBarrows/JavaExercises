package CustomerEntry;
/*
 * Created by Joel Barr
 * 8/29/18 2:24 PM.
 * SAIT CMPP-264, Summer 2018
 * Day 4 Exercise
 * Modified 8/30/18
 * Day 5 Exercise
 */

public abstract class Person {
    protected String firstName, lastName;
    protected String businessPhone, email;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }
    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    protected Person(String fistName, String lastName) {
        this.firstName = fistName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, String businessPhone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.businessPhone = businessPhone;
        this.email = email;
    }

    //Prints the person's information
    public abstract void display();

    // Returns name in the format "lastname, firstname"
    public String makePhonebookName()
    {
        String pbName;
        pbName = String.format("%s, %s", lastName, firstName);
        return pbName;
    }
}
