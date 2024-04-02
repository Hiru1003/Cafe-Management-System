package com.example.cafeshopmanagementsystem;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;



public class HelloController {

    @FXML
    private Hyperlink si_forgotPw;

    @FXML
    private Button si_loginBtn;

    @FXML
    private AnchorPane si_loginform;

    @FXML
    private PasswordField si_passwords;

    @FXML
    private TextField si_username;

    @FXML
    private Button side_alreadyHave;

    @FXML
    private Button side_createBtn;

    @FXML
    private AnchorPane side_form;

    @FXML
    private TextField su_asnwer;

    @FXML
    private PasswordField su_password;

    @FXML
    private ComboBox<String> su_question;

    @FXML
    private Button su_signupBtn;

    @FXML
    private AnchorPane su_signupForm;

    @FXML
    private TextField su_username;

    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;

    private String[] questionList = {"What is your favorite color?", "What is your favorite food?", "What is your birthdate?"};

    public void regLquestionList() {
        List<String> listQ = new ArrayList<>();

        for (String data : questionList) {
            listQ.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(listQ);
        su_question.setItems(listData);
    }


    public void switchForm(ActionEvent event) {
        TranslateTransition slider = new TranslateTransition();

        if (event.getSource() == side_createBtn) {
            slider.setNode(side_form);
            slider.setDuration(Duration.seconds(0.5));
            slider.setToX(300);

            slider.setOnFinished((ActionEvent e) -> {
                side_alreadyHave.setVisible(true);
                side_createBtn.setVisible(false);
            });
            
            slider.play();
            
        } else if (event.getSource() == side_alreadyHave) {
            slider.setNode(side_form);
            slider.setDuration(Duration.seconds(0.5));
            slider.setToX(0);
            slider.setOnFinished((ActionEvent e) -> {
                side_alreadyHave.setVisible(false);
                side_createBtn.setVisible(true);
            });
            slider.play();
        }
    }
}
