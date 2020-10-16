package ehu.isad;

import ehu.isad.controller.KautotuKud;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.StringConverter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main extends Application {

  private Parent kautotuUI;
  private Stage stage;
  private KautotuKud kautotuKud;
  public Label label;
  public Book book;



  @Override
  public void start(Stage primaryStage) throws Exception {

    this.stage = primaryStage;
    this.pantailakKargatu();

    ObservableList<Book> books = FXCollections.observableArrayList();
    books.addAll(
            new Book("1491910399", "R for Data Science"),
            new Book("1491946008", "Fluent Python"),
            new Book("9781491906187", "Data Algorithms"),
            new Book("1491978236","Natural Language Processing with PyTorch"),
            new Book("9781491920497","Blockchain: Blueprint for a New Economy"));

    kautotuKud.getComboZerbitzua().setConverter(new StringConverter<Book>() {
      @Override
      public String toString(Book book) {
        if (book==null)
          return "";
        return book.title;
      }

      @Override
      public Book fromString(String string) {
        return null;
      }
    });

    this.stage.setTitle("Argazki Backup");
    this.stage.setScene(new Scene(kautotuUI, 450, 275));
    this.stage.show();
  }


  private void pantailakKargatu() throws IOException {

    FXMLLoader loaderKautotu = new FXMLLoader(getClass().getResource("/kautotu.fxml"));
    kautotuUI = (Parent) loaderKautotu.load();
    kautotuKud = loaderKautotu.getController();
    kautotuKud.setMainApp(this);

  }


  public static void main(String[] args) {
    launch(args);
  }

}
