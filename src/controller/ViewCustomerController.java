package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

public class ViewCustomerController {
    public TableView tblCustomer;

    public TableColumn colId;

    public TableColumn colName;

    public TableColumn colAddress;

    public TableColumn colSalary;

    public TableColumn colContact;

    public void btnReloadOnAction(ActionEvent actionEvent) {

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contact"));

        ObservableList<Customer> customerList = FXCollections.observableArrayList();
        customerList.add(new Customer("001","Saman","Gampha",540,"97543"));
        customerList.add(new Customer("001","Saman","Gampha",540,"97543"));
        customerList.add(new Customer("001","Saman","Gampha",540,"97543"));
        customerList.add(new Customer("001","Saman","Gampha",540,"97543"));

        tblCustomer.setItems(customerList);
    }
}
