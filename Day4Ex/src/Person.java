public abstract class Person {
    protected String name;

    //Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Constructor
    Person(String name)
    {
        this.name = name;
    }

    //Prints the person's information
    public abstract void display();

    // Returns name in the format "lastname, firstname"
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
