import javafx.application.Application;
import javafx.stage.Stage;

public class TestEnviroment extends Application{

	public static void main(String[] arg){
		launch(arg);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Shiet");
		primaryStage.setResizable(true);
		primaryStage.setHeight(330);
		primaryStage.setWidth(330);
		primaryStage.show();
	}
	
	
	
}
