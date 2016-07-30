import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
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
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		ChemUtils.setBackColor(grid, "000000");
		
		Button b = new Button("button");
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
			}
		});
		grid.add(b, 0, 0);
		Scene s = new Scene(grid, 250, 250);
		
		pStage.setTitle("Region Test");
		pStage.setScene(s);
		pStage.show();
	}
	
}
