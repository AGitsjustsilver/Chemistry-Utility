/*
 * @author: Alessandro Guaresti
 */
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.apache.commons.lang3.time.StopWatch;

public class Display extends Application {
	private static Elements in;
	private static Compound in1;
	
	public static void main(String[] args){
		launch(args);
	}
	
	public void start(Stage primaryStage){
		mainInput(primaryStage);
//		nameInput(primaryStage);
//		numberInput(primaryStage);
//		symbolInput(primaryStage);
//		molarMassInput(primaryStage);
		
		primaryStage.setTitle("Chemistry-Utility");
		primaryStage.show();
	}
	
	public static void mainInput(Stage p){
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
		submit.setOnMousePressed(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if(response.getText().equalsIgnoreCase("a")){
					nameInput(p);
				}else if(response.getText().equalsIgnoreCase("b")){
					numberInput(p);
				}else if(response.getText().equalsIgnoreCase("c")){
					symbolInput(p);
				}else if(response.getText().equalsIgnoreCase("d")){
					molarMassInput(p);
				}else{
					addText(grid, "You must Input one of the options", 0, 6);
				}
				
			}
		});
		grid.add(submit, 2, 5);
		
		Scene firstChoice = new Scene(grid, 600, 400);
		
		p.setScene(firstChoice);
	}

	public static void nameInput(Stage p){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		addText(grid, "Name Input", 0, 0);
		
		addText(grid, "Please enter the name of the element. (make sure what you entered is spelled corectly)",0, 1);
		
		TextField inp = new TextField();
		grid.add(inp, 0, 2);
		
		//work on the validation of the name input perferably in a new method
		Button submit = new Button("Submit");
		submit.setOnMousePressed(new EventHandler<Event>() {
			public void handle(Event event){
				String response = inp.getText();
				in = new Elements(response);
				addText(grid, in.toString(),0, 3);
				if(response.isEmpty()){
					nameInput(p);
				}else{
					inp.setText("");
					submit.setText("Reset");
				}
			}

		});
		grid.add(submit, 1, 2);

		Button back = new Button("Go back");
		back.setOnMousePressed(new EventHandler<Event>() {
			public void handle(Event event){
				mainInput(p);
			}
		});
		grid.add(back, 1, 3);
		
		Scene in = new Scene(grid, 600, 400);
		
		p.setScene(in);
	}
	
	public static void numberInput(Stage p){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		addText(grid, "Atomic Number Input", 0, 0);

		addText(grid, "What element do you want to know about? (Use integer numbers from 1 to 118)", 0, 1);
		
		TextField inp = new TextField();
		grid.add(inp, 0, 2);
		
		//requires validation and reseting work
		Button submit = new Button("Submit");
		submit.setOnMousePressed(new EventHandler<Event>() {
			public void handle(Event event){
				int response = new Integer(inp.getText());
				in = new Elements(response);
				addText(grid, in.toString(), 0, 3);
				if(Integer.toString(response).equals(null)){
					nameInput(p);
				}else{
					inp.setText("");
					submit.setText("Reset");
				}
			}
		});
		grid.add(submit, 1, 2);
		
		Button back = new Button("Go back");
		back.setOnMousePressed(new EventHandler<Event>() {
			public void handle(Event event){
				mainInput(p);
			}
		});
		grid.add(back, 1, 3);
		
		Scene in = new Scene(grid, 600, 400);
		
		p.setScene(in);
	}
	
	public static void symbolInput(Stage p){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		addText(grid, "Element Symbol Input", 0, 0);
		
		addText(grid, "What element do you want to know about? (Enter the element's symbol)", 0, 1);
		
		TextField inp = new TextField();
		grid.add(inp, 0, 2);
		
		//same work needed as name input
		Button submit = new Button("Submit");
		submit.setOnMousePressed(new EventHandler<Event>() {
			public void handle(Event event){
				String response = inp.getText();
				in = new Elements(response);
				addText(grid, in.toString(),0, 3);
				if(response.isEmpty()){
					symbolInput(p);
				}else{
					inp.setText("");
					submit.setText("Reset");
				}
			}
		});
		grid.add(submit, 1, 2);

		Button back = new Button("Go back");
		back.setOnMousePressed(new EventHandler<Event>() {
			public void handle(Event event){
				mainInput(p);
			}
		});
		grid.add(back, 1, 3);
		
		Scene in = new Scene(grid, 600, 400);
		
		p.setScene(in);
	}
	
	public static void molarMassInput(Stage p){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		addText(grid, "Molar Mass", 0, 0);
		
		addText(grid, "Of what compound do you wish to find the molar mass?", 0, 1);

		TextField inp = new TextField();
		grid.add(inp, 0, 2);
		
		Button submit = new Button("Submit");
		submit.setOnMousePressed(new EventHandler<Event>(){
			public void handle(Event event){
				String response = inp.getText();
				in  = new Elements();
				in1 = new Compound(response);
				//the toString on the compounds class
				addText(grid, "filler", 0, 3);
				if(response.isEmpty()){
					molarMassInput(p);
				}else{
					inp.setText("");
					submit.setText("Reset");
				}
			}
		});
		
		Button back = new Button("Go back");
		back.setOnMousePressed(new EventHandler<Event>() {
			public void handle(Event event){
				mainInput(p);
			}
		});
		grid.add(back, 1, 2);
		
		Scene in = new Scene(grid, 600, 400);
		
		p.setScene(in);
	}
	
	public static void addText(GridPane grid, String text, int col, int row){
		Text rules = new Text();
		rules.setText(text);
		grid.add(rules, col, row);
	}
	
	public static void addText(GridPane grid, long text, int col, int row){
		Text rules = new Text(text);
	}
		
	
}
