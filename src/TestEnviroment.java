import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import  javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TestEnviroment extends Application{
	
	public static void main(String[] args){
		launch(args);
	}
	
	public void start(Stage primaryStage){
		BorderPane whole = new BorderPane();
		Scene s = new Scene(whole, 580, 580);
		//top navigation
		Button home = new Button("Home");		
		home.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				whole.setCenter(homeDisplay());
			}
		});
		Button name = new Button("Name Input");
		name.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setCenter(Displays.nameInput());
			}
		});
		Button num = new Button("atomic num Input");
		num.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setCenter(Displays.numberInput());
			}
		});
		Button symbol = new Button("Symbol input");
		symbol.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setCenter(Displays.symbolInput());
			}
		});
		Button molarMass = new Button("molar mass Input");
		molarMass.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setCenter(Displays.molarMassInput());
			}
		});
		Button molarMassGame = new Button("molar mass game");
		molarMassGame.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setCenter(Displays.molarMassGame());
			}
		});
		
		ToolBar b = new ToolBar(home, name, num, symbol, molarMass, molarMassGame);
		whole.setTop(b);
		
		
		primaryStage.setScene(s);
		primaryStage.setTitle("test");
		primaryStage.show();
	}

	public static GridPane homeDisplay(){
		GridPane g = new GridPane();
		g.setAlignment(Pos.CENTER);
		g.setHgap(5);
		g.setVgap(5);
		
		ChemUtils.addText(g, "This is information", 0, 0);
		return g;
	}
	
}


