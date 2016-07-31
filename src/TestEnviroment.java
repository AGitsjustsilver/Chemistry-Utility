import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class TestEnviroment extends Application{
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage pStage) throws Exception {
		Group root = new Group();
		numOne(pStage, root);
		numTwo(pStage, root);
		Scene n = new Scene(root, 500, 250);
		
		pStage.setScene(n);
		pStage.setTitle("Region Test");
		pStage.show();
	}
	
	public static void numOne(Stage p, Group g){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		ChemUtils.setBackColor(grid, "000000");
		
		Button b = new Button("button");
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				ChemUtils.addText(grid, "FFFFFF", "Text", 0, 1);
			}
		});
		grid.add(b, 0, 0);
		g.getChildren().add(grid);		
	}
	
	public static void numTwo(Stage p, Group g){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		Button b = new Button("Button");
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event){
				ChemUtils.addText(grid, "000000", "text", 0, 1);				
			}
		});
		grid.add(b, 0, 0);
		g.getChildren().add(grid);	
	}
	
}
