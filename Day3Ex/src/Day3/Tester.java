package Day3;

public class Tester {

    private static Customer[] customerList;
    public static void main(String[] args) {
        // Fill list
        customerList = new Customer[3];
        customerList[0] = new Customer("Joel Barr", "4519 Varsity Drive NW", "Calgary", "AB");
        customerList[1] = new Customer("Hnin Nyang", "500 Lakeside Blvd", "Vancouver", "BC");
        customerList[2] = new Customer("Chad Cohen");

        // Print list
        for (Customer c : customerList)
        {
            System.out.printf("%s\n\t%s\n\t%s, %s\n\n",
                                c.makePhonebookName(),
                                c.getAddress(),
                                c.getCity(), c.getProvince());
        }
    }

}
