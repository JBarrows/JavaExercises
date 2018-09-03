/*
 * Created by Joel Barr
 * 8/30/18
 * SAIT CMPP-264, Summer 2018
 * Day 5 Exercise
 */

package CustomerEntry;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("CustomerEntry.fxml"));
        primaryStage.setTitle("Customer Entry");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
