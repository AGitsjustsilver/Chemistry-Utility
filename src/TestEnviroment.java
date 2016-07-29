import java.awt.Color;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;


public class TestEnviroment extends Application{
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage pStage) throws Exception {
		Group root = new Group();
		
		Region redPlane = new Region();
		redPlane.setStyle("-fx-background-color: red;");
		
		Button b = new Button("button");
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
			}
		});
		root.getChildren().add(b);
		
		root.getChildren().add(redPlane);
		
		
		Scene s = new Scene(root, 250, 250);
		
		pStage.setTitle("Region Test");
		pStage.setScene(s);
		pStage.show();
	}

	
}
