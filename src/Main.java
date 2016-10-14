import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main(String[] args){
		launch(args);
	}
	
	public void start(Stage primaryStage){
		
		Displays.mainDisplay(primaryStage);
		
		primaryStage.setTitle("Chemistry-Utility");
		primaryStage.getIcons().add(new Image("resources/Icon.png"));
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
}