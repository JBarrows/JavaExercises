public class Tester {

    private static Person[] personList;
    public static void main(String[] args) {
        // Fill list
        personList = new Person[3];
        personList[0] = new Agent("Joel Barr", "403-555-5520", 0.33);
        personList[1] = new Customer("Hnin Nyang", "500 Lakeside Blvd", "Vancouver", "BC");
        personList[2] = new Customer("Chad Cohen");

        // Print list
        for (Person p : personList)
        {
            p.display();
        }
    }

}
