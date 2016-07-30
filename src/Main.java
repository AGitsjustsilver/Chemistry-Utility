import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main(String[] args){
		launch(args);
	}
	
	public void start(Stage primaryStage){
		Displays.mainInput(primaryStage);
//		Displays.nameInput(primaryStage);
//		Displays.numberInput(primaryStage);
//		Displays.symbolInput(primaryStage);
//		Displays.molarMassInput(primaryStage);
		
		primaryStage.setTitle("Chemistry-Utility");
		primaryStage.show();
	}
	
}