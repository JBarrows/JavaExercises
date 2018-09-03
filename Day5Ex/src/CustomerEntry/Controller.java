/*
 * Created by Joel Barr
 * 8/30/18
 * SAIT CMPP-264, Summer 2018
 * Day 5 Exercise
 */
package CustomerEntry;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML private TextField txtFirstName;
    @FXML private TextField txtLastName;
    @FXML private TextField txtAddress;
    @FXML private TextField txtCity;
    @FXML private TextField txtProvince;
    @FXML private TextField txtPostal;

    @FXML protected void onSavePressed(ActionEvent actionEvent) {
        Customer customer = new Customer(txtFirstName.getText(), txtLastName.getText());
        customer.setAddress(txtAddress.getText());
        customer.setCity(txtCity.getText());
        customer.setProvince(txtProvince.getText());
        customer.setPostal(txtPostal.getText());
        customer.display();
        clearFields();
    }

    public void onCancelPressed(ActionEvent actionEvent) {
        clearFields();
    }

    private void clearFields() {
        txtFirstName.clear();
        txtLastName.clear();
        txtAddress.clear();
        txtCity.clear();
        txtProvince.clear();
        txtPostal.clear();

        txtFirstName.requestFocus();
    }
}
