import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import  javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TestEnviroment extends Application{
	
	public static void main(String[] args){
		launch(args);
	}
	
	public void start(Stage primaryStage){
		BorderPane whole = new BorderPane();
		Scene s = new Scene(whole, 500, 500);
		//top navigation
		Menu home = new Menu("Home");
		home.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				homeDisplay(whole);
				
			}
		});
		Menu nameIn = new Menu("Name Input");
		nameIn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Displays.nameInput(primaryStage);
			}
		});
		Menu symbolIn = new Menu("Symbol Input");
		Menu numIn = new Menu("Number Input");
		Menu molMassIn = new Menu("Molar Mass Input");
		
		MenuBar main = new MenuBar(home,nameIn, symbolIn, numIn, molMassIn);
		whole.setTop(main);
		
		//content
		
		primaryStage.setScene(s);
		primaryStage.setTitle("test");
		primaryStage.show();
	}

	public static void homeDisplay(BorderPane b){
		GridPane g = new GridPane();
		g.setAlignment(Pos.CENTER);
		g.setHgap(5);
		g.setVgap(5);
		
		ChemUtils.addText(g, "This is information", 0, 0);
		b.setCenter(g);
	}
	
}
/**
 * the problem i am trying to figure out is how can i have a menu bar that when clicked can display the pane that is selected
 */

