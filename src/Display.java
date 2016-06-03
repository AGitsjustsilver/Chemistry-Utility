import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Display extends Application {
	private Elements in;
	private Main w;
	
	public static void main(String[] args){
		launch(args);
	}
	
	public void start(Stage primaryStage){
		firstMenu(primaryStage);
		
		
				
		primaryStage.setTitle("Chemistry-Utility");

		primaryStage.show();
	}
	
	public static void firstMenu(Stage p){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		Text title = new Text();
		title.setText("Welcome");
		title.setFont(Font.font(25));
		grid.add(title, 0, 0);
		
		addText(grid, "If you want to Input an element's name and get information type: A", 0, 1);

		addText(grid, "If you know the element's Atomic Number type: B", 0, 2);
		
		addText(grid, "If you know the element's Symbol type: C", 0, 3);
		
		addText(grid, "If you want to know the molar mass of any molecule type: D", 0, 4);
		
		TextField response = new TextField();
		grid.add(response, 0, 5);
		
		Button submit = new Button("Submit");
		grid.add(submit, 2, 5);
		
		Scene firstChoice = new Scene(grid, 600, 400);
		
		p.setScene(firstChoice);
	}
	
	public static void addText(GridPane grid, String text, int col, int row){
		Text rules = new Text();
		rules.setText(text);
		grid.add(rules, col, row);
		
	}
	
}
