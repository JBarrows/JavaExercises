package Day3;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertThat;

class CustomertTest {

    @org.junit.jupiter.api.Test
    void makePhonebookName() {
        String phonebookName;
        Customer madonna = new Customer("Madonna");
        boolean singleName = madonna.makePhonebookName() == "Madonna";
        assertTrue(singleName);

        Customer bill = new Customer("Bill Gates");
        boolean regularName = bill.makePhonebookName() == "Gates, Bill";
        assertThat(bill.makePhonebookName(), is("Gates, Bill"));

        Customer john1 = new Customer(("John Jacob Jingleheimer-Shmidt"));
        phonebookName = john1.makePhonebookName();
        assertThat(phonebookName, is("Jacob Jingleheimer-Shmidt, John"));

        Customer john2 = new Customer(("John-Jacob Jingleheimer-Shmidt"));
        assertThat(john2.makePhonebookName(), is("Jingleheimer-Shmidt, John-Jacob"));
    }
}