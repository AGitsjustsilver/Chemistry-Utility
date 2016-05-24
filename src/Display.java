import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Display extends Application{
	
	private Elements in;
	
	public static void main(String[] args){
		launch(args);
	}
	
	public void start(Stage primaryStage){
		
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		
		Text title = new Text();
		title.setText("Welcome");
		title.setFont(Font.font(25));
		grid.add(title, 0, 0);
		
		Text rules = new Text();
		rules.setText("If you want to Input an element's name and get information type: A");
		grid.add(rules, 0, 1);
		
		
		TextField response = new TextField();
		grid.add(response, 0, 2);
		
		Button submit = new Button("Submit");
		grid.add(submit, 2, 3);
		
		Scene firstChoice = new Scene(grid, 600, 500);
		
				
		primaryStage.setTitle("Chemistry-Utility");
		primaryStage.setScene(firstChoice);
		primaryStage.show();
	}
	
}
