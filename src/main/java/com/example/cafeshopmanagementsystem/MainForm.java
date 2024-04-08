package com.example.cafeshopmanagementsystem;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MainForm implements Initializable  {

    @FXML
    private Button cafe_btn;

    @FXML
    private Button dashboard_btn;

    @FXML
    private Button inventory_addBtn;

    @FXML
    private Button inventory_btn;

    @FXML
    private Button inventory_clearBtn;

    @FXML
    private TableColumn<?, ?> inventory_col_date;

    @FXML
    private TableColumn<?, ?> inventory_col_price;

    @FXML
    private TableColumn<?, ?> inventory_col_prodcutId;

    @FXML
    private TableColumn<?, ?> inventory_col_productName;

    @FXML
    private TableColumn<?, ?> inventory_col_status;

    @FXML
    private TableColumn<?, ?> inventory_col_stoke;

    @FXML
    private TableColumn<?, ?> inventory_col_type;

    @FXML
    private Button inventory_deleteBtn;

    @FXML
    private AnchorPane inventory_form;

    @FXML
    private ImageView inventory_imageView;

    @FXML
    private Button inventory_importBtn;

    @FXML
    private TableView<?> inventory_tableView;

    @FXML
    private Button inventory_updateBtn;

    @FXML
    private Button logout_btn;

    @FXML
    private AnchorPane main_Form;

    @FXML
    private Button menu_btn;

    @FXML
    private Label username;

    public void displayUsername() {
        if (data.username == null || data.username.isEmpty()) {
            // If data or data.username is null or empty, set default label text
            if (username != null) {
                username.setText("No username available");
            } else {
                System.err.println("Label username is null.");
            }
        } else {
            // If data.username is not null or empty, capitalize the first letter and display
            String user = data.username.substring(0, 1).toUpperCase() + data.username.substring(1);
            if (username != null) {
                username.setText(user);
            } else {
                System.err.println("Label username is null.");
            }
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        displayUsername();

    }

}