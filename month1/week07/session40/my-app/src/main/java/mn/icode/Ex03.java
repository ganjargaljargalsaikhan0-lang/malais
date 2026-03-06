package mn.icode;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex03 extends Application{
    private int counter = 0;
    @Override
    public void start(Stage stage) throws Exception {
        Label numberLabel = new Label("0");
        numberLabel.setStyle("-fx-font-size: 24px;");
        Button plusButton = new Button("add(+)");
        Button minusButton = new Button("MInus (-)");

        plusButton.setOnAction(e -> {
            counter++;
            numberLabel.setText(String.valueOf(counter));
        });
        minusButton.setOnAction(e -> {
            counter--;
            numberLabel.setText(String.valueOf(counter));
        });

        HBox buttons = new HBox(10, plusButton, minusButton);
        VBox layout = new VBox(90, numberLabel, buttons);

        stage.setScene(new Scene(layout, 250, 150));
        stage.setTitle("exercise 03");
        stage.show();
        
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
