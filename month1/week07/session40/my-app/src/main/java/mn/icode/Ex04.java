package mn.icode;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex04 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button coloorButton = new Button("ulaan");
        Button colorButton = new Button("nogoon");
        Button clorButton = new Button("tsenher");

        HBox buttons = new HBox(10, coloorButton, colorButton, clorButton);
        VBox layout = new VBox(10, buttons);
        coloorButton.setOnAction(e -> {
            layout.setStyle("-fx-background-color: red;");
        });
         colorButton.setOnAction(e -> {
            layout.setStyle("-fx-background-color: green;");
        });
         clorButton.setOnAction(e -> {
            layout.setStyle("-fx-background-color: blue;");
        });
        

        stage.setScene(new Scene(layout, 200, 200));
        stage.setTitle("exercise 04");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
