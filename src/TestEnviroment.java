import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TestEnviroment extends Application{
	
	public static void main(String[] args){
		launch(args);
	}
	
	public void start(Stage primaryStage){
		Scene s = new Scene(createTable(), 500, 500);
		primaryStage.setScene(s);
		primaryStage.setTitle("test");
		primaryStage.show();
	}
	
	public static GridPane createTable(){
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setGridLinesVisible(true);
		root.add(createEl(new Elements(1)), 0, 0);
		root.add(createEl(new Elemetns(2)), 0, 17);
		root.add(createEl(new Elements(3)), 1, 0);
		root.add(createEl(new Elements(4)), 1, 1);
		root.add(createEL(new Elements(5)), 1, 12);
			 
			 
		
		return root;
	}
	
	public static GridPane createEl(Elements f){
		GridPane grid = new GridPane();
		grid.setVgap(2);
		grid.setHgap(2);
		
		ChemUtils.addText(grid, f.basicString(), 0, 0);
		
		return grid;
	}
	
}


