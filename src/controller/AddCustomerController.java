package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Customer;

import java.util.ArrayList;

public class AddCustomerController {

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSalary;

    ArrayList<Customer> customerList = new ArrayList<>();

    @FXML
    void btnAddOnAction(ActionEvent event) {

        String id  = txtId.getText();
        String name= txtName.getText() ;
        String address=txtAddress.getText();
        double salary= Double.parseDouble(txtSalary.getText());
        String contact= txtContact.getText() ;

        Customer customer = new Customer(id,name,address,salary,contact);

        customerList.add(customer);
        customerList.forEach(obj->{
            System.out.println(obj);
        });





    }

}
