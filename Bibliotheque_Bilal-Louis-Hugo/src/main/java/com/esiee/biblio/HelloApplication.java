package com.esiee.biblio;

import com.esiee.biblio.model.Bibliotheque;
import com.esiee.biblio.model.Livre;
import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Bibliothèque");
        stage.setScene(scene);
        stage.show();

        /*FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("modal-view.fxml"));
        Scene sceneModal = new Scene(fxmlLoader2.load());
        stage.setTitle("Livre");
        stage.setScene(sceneModal);
        stage.hide();*/
    }

    public static void main(String[] args) {
        launch(args);
    }


}