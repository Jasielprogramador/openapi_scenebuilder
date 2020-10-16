package ehu.isad.controller;

import ehu.isad.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class KautotuKud {

  // Reference to the main application.
  private Main mainApp;

  @FXML
  private ComboBox comboZerbitzua;

  @FXML
  private TextField txtErabiltzaile;

  @FXML
  private TextField txtPasahitza;

  public void setMainApp(Main main) {
    this.mainApp = main;
  }

  @FXML
  public void onClick(ActionEvent actionEvent) {
    System.out.println(txtErabiltzaile.getText() + ":" + txtPasahitza.getText());
    System.out.println(comboZerbitzua.getValue());

    mainApp.label.setText(mainApp.book.getDetails().getTitle()+ "\n" +
            mainApp.book.getDetails().getNumber_of_pages() + "\n" +
            mainApp.book.getDetails().getPublishers()[0]);

  }

  public ComboBox getComboZerbitzua(){
    return this.comboZerbitzua;
  }



}