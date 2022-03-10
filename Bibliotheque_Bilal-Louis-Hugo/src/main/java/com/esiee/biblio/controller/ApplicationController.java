package com.esiee.biblio.controller;

import com.esiee.biblio.model.Livre;
import com.esiee.biblio.model.XmlToJava;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ApplicationController implements Initializable {
    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDel;

    @FXML
    private MenuItem menuOpen;

    @FXML
    void quitAction() { System.exit(0);}

    @FXML
    private TableView<Livre> Tableau;

    @FXML
    private TableColumn<Livre, String> titre;

    @FXML
    private TableColumn<Livre, String> auteur;

    @FXML
    private TableColumn<Livre, String> presentation;

    @FXML
    private TableColumn<Livre, Integer> parution;

    @FXML
    private TableColumn<Livre, Integer> colonne;

    @FXML
    private TableColumn<Livre, Integer> rangee;

    ObservableList<Livre> list = FXCollections.observableArrayList(
            new Livre("Eragon", "Paolini", "presentation Eragon", 2002, 1, 1),
            new Livre("Harry Potter", "Rowling", "presentation Harry Potter", 1997, 1, 2),
            new Livre("Percy Jackson", "Riordan", "presentation Percy Jackson", 2005, 1, 3),
            new Livre("1984", "Orwell", "presentation 1984", 1949, 1, 4),
            new Livre("L'Assassin du roi", "Hobb", "presentation L'Assassin du roi", 1996, 1, 5)
    );

    @Override
    public void initialize (URL url, ResourceBundle rb){
        titre.setCellValueFactory(new PropertyValueFactory<Livre,String>("titre"));
        auteur.setCellValueFactory(new PropertyValueFactory<Livre,String>("auteur"));
        presentation.setCellValueFactory(new PropertyValueFactory<Livre,String>("presentation"));
        parution.setCellValueFactory(new PropertyValueFactory<Livre,Integer>("parution"));
        colonne.setCellValueFactory(new PropertyValueFactory<Livre,Integer>("colonne"));
        rangee.setCellValueFactory(new PropertyValueFactory<Livre,Integer>("rangee"));

        // Ne fonctionne encore
        // Tableau.setItems((ObservableList<Livre>) XmlToJava.convert().getLivre());
        Tableau.setItems(list);

        // Ne fonctionne pas encore
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Parent root;
                try {
                    root = FXMLLoader.load(getClass().getClassLoader().getResource("modal-view.fxml"));
                    Stage stage = new Stage();
                    stage.setTitle("Livre");
                    stage.show();
                    // Hide this current window (if this is what you want)
                    ((Node)(event.getSource())).getScene().getWindow().hide();
                }
                /*try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("modal_view.fxml"));
                    root = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.initStyle(StageStyle.UNDECORATED);
                    stage.setTitle("TEST");
                    stage.setScene(new Scene(root));
                    stage.show();
                }*/
                catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        // Ne fonctionne pas encore
        /*menuOpen.setOnAction(e -> {
            Path partPath = Paths.get("yourFileLocation");
            Host = HostServices.getHostServices()
            Host.showDocument(partPath.toUri().toString());
        });*/
    }
}