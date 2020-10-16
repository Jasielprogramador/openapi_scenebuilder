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
  private Stage stage;
  private Scene sceneLiburuak;
  private Scene sceneXehetasunak;
  public LiburuKud LiburuKud;
  public XehetasunakKud xehetasunakKud;
  public Label label;




  @Override
  public void start(Stage primaryStage) throws Exception {

    stage = primaryStage;
    pantailakKargatu();

    stage.setScene(sceneLiburuak);
    stage.show();
  }

/*  public void changeScene(String fxml) throws IOException {
      Parent pane = FXMLLoader.load(getClass().getResource(fxml));

      stage.getScene().setRoot(pane);
  }*/

  public void mainErakutsi(){
    stage.setScene(sceneXehetasunak);
    stage.show();
  }

  public void xehetasunakErakutsi(){


  }


  private void pantailakKargatu() throws IOException {

    FXMLLoader loaderLiburu = new FXMLLoader(getClass().getResource("/Liburuak.fxml"));
    liburuUI = (Parent) loaderLiburu.load();
    LiburuKud = loaderLiburu.getController();
    LiburuKud.setMainApp(this);
    sceneLiburuak=new Scene(liburuUI);


    FXMLLoader loaderXehetasun = new FXMLLoader(getClass().getResource("/Xehetasunak.fxml"));
    xehetasunUI = (Parent) loaderXehetasun.load();
    xehetasunakKud= loaderXehetasun.getController();
    xehetasunakKud.setMainApp(this);
    sceneXehetasunak=new Scene(xehetasunUI);

  }



  public static void main(String[] args) {
    launch(args);
  }

}
