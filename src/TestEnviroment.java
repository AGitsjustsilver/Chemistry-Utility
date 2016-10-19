import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TestEnviroment extends Application{
	
	public static void main(String[] args){
		launch(args);
	}
	
	public void start(Stage p){
		BorderPane b = new BorderPane();
		Scene s = new Scene(b, 600, 600);
		
		
		Button getMenu1 = new Button("drop menu 1");
			Button y1 = new Button("thing 1");
			Button y2 = new Button("thing 2");
			Button y3 = new Button("thing 3");
			Button y4 = new Button("thing 4");
			FlowPane y = new FlowPane(y1, y2, y3, y4);
			y.setPadding(new Insets(10, 5, 0, 5));
			y.setAlignment(Pos.CENTER);
			y.setMaxWidth(20);
		getMenu1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				b.setLeft(y);
			}
		});
		
		Button getMenu2 = new Button("drop menu 2");
		getMenu2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				b.setLeft(null);
				
			}
		});
		Button getMenu3 = new Button("drop menu 3");
		Button getMenu4 = new Button("drop menu 4");
		HBox h = new HBox(20, getMenu1, getMenu2, getMenu3, getMenu4);
		b.setTop(h);
		
		p.setScene(s);
		p.setTitle("Test");
		p.getIcons().add(new Image("resources/icon.png"));
		p.setResizable(false);
		p.show();
	}
	
	

	
	
	
}


