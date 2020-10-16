package ehu.isad;

import ehu.isad.controllers.LiburuKud;
import ehu.isad.controllers.XehetasunakKud;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

  private Parent liburuUI;
  private Parent xehetasunUI;
  public Stage stage;
  public LiburuKud LiburuKud;
  public XehetasunakKud xehetasunakKud;
  public Label label;




  @Override
  public void start(Stage primaryStage) throws Exception {

    this.stage = primaryStage;
    this.pantailakKargatu();



    this.stage.setTitle("Argazki Backup");
    this.stage.setScene(new Scene(liburuUI, 450, 275));
    this.stage.show();
  }


  private void pantailakKargatu() throws IOException {

    FXMLLoader loaderLiburu = new FXMLLoader(getClass().getResource("/Liburuak.fxml"));
    liburuUI = (Parent) loaderLiburu.load();
    LiburuKud = loaderLiburu.getController();
    LiburuKud.setMainApp(this);


    FXMLLoader loaderXehetasun = new FXMLLoader(getClass().getResource("/Xehetasunak.fxml"));
    xehetasunUI = (Parent) loaderXehetasun.load();
    xehetasunakKud= loaderXehetasun.getController();
    xehetasunakKud.setMainApp(this);

  }

  public void xehetasunakErakutsi() {
    stage.setScene(new Scene(xehetasunUI));
    stage.show();
  }

  public void liburuaErakutsi() {
    stage.setScene(new Scene(liburuUI));
    stage.show();
  }


  public static void main(String[] args) {
    launch(args);
  }

}
