package ehu.isad.controllers;

import ehu.isad.Book;
import ehu.isad.Main;
import ehu.isad.utils.Sarea;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.StringConverter;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;

public class XehetasunakKud implements Initializable {

    private Main mainApp;
    private Sarea sarea;


    @FXML
    private Label lblIzenburua;

    @FXML
    private Label lblArgitaletxea;

    @FXML
    private Label lblOrriKop;

    @FXML
    private ImageView imgIrudia;

    @FXML
    private Button btnAtzera;

    @FXML
    public void onClick(ActionEvent actionEvent) throws IOException {
        mainApp.liburuaErakutsi();
    }


    private Image createImage(String url) throws IOException {
        URLConnection conn = new URL(url).openConnection();
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.121 Safari/537.36");
        try (InputStream stream = conn.getInputStream()) {
            return new Image(stream);
        }
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Parent liburuUI;
        LiburuKud liburuKud;

        //Book book=(Book) mainApp.LiburuKud.comboZerbitzua.getValue();
        Book liburua= null;


        /*try {
            liburua = sarea.readFromUrl(book.getIsbn());
        } catch (IOException e) {
            e.printStackTrace();
        }

        lblArgitaletxea.setText(liburua.getDetails().getPublishers()[0]);
        lblIzenburua.setText(liburua.getTitle());
        lblOrriKop.setText(Integer.toString(liburua.getDetails().getNumber_of_pages()));

        try {
            imgIrudia.setImage(this.createImage(liburua.getThumbnail_url()));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    public void setMainApp(Main main) {
        this.mainApp = main;
    }

}

