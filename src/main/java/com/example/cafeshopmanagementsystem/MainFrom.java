package com.example.cafeshopmanagementsystem;
import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class MainFrom implements Initializable  {

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

}
