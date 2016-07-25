import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.apache.commons.lang3.time.StopWatch;

public class TestEnviroment extends Application{
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		
		Display.addText(grid, "do stuff", 0, 0);
		
		TextField input = new TextField();
		grid.add(input, 0, 1);
		
		Button make = new Button("do");
		grid.add(make, 1, 1);
		make.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				StopWatch in = new StopWatch();
				in.start();
				while(true){
					Display.addText(grid, in.getSplitTime(), 0, 3);
				}
			}
		});
		
		
		Scene a = new Scene(grid, 600, 600);
		primaryStage.setScene(a);
		primaryStage.setTitle("Test");
		primaryStage.show();
	}
	
	public void times(){
		StopWatch in = new StopWatch();
		in.start();
		long stopTime = 5;
		boolean cond = true;
		while(cond){
			if(in.getTime() == stopTime){
				in.stop();
				cond = false;
			}
		}
	}
	
	public void resetTimer(){
		StopWatch in = new StopWatch();
		in.start();
		if(){
			
		}
	}
	
}
