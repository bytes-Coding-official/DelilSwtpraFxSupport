package de.bytescoding.javafx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Controller extends Application {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private AnchorPane pane;
    @FXML
    void initialize() {
        var gameTile = new GameTile(Color.AQUA);
        gameTile.setLayoutX(100);
        gameTile.setLayoutY(100);
        pane.getChildren().add(gameTile);
    }
    
    public static void main(){
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        var loader =new FXMLLoader(getClass().getResource("/fxml/mainfile.fxml"));
        loader.setController(this);
        var root = (Parent) loader.load();
        stage.setScene(new Scene(root));
        initialize();
        stage.show();
    }
}
