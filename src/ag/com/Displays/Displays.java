package ag.com.Displays;
import ag.com.main.ChemUtils;
import ag.com.main.Compound;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import ag.com.Displays.IonDisplay;

public class Displays{
	private static Compound in1;
	
	//main display
	public static void mainDisplay(Stage primaryStage){
		BorderPane whole = new BorderPane();
		Scene s = new Scene(whole, 1280, 700);
		//top navigation
		Button home = new Button("Home");		
		home.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				whole.setCenter(home());
				whole.setLeft(null);
				whole.setRight(null);
			}
		});
		Button pTable = new Button("Periodic Table");
		pTable.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setCenter(TableOfElements.perodicTable());
				whole.setLeft(null);
				whole.setRight(null);
			}
		});
		
		//input
		Button input = new Button("Inputs");
			Button name = new Button("Name Input");
			name.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					whole.setCenter(InputDisplays.nameInput());
					whole.setRight(InputDisplays.helpName());
				}
			});
			Button num = new Button("atomic num Input");
			num.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					whole.setCenter(InputDisplays.numberInput());
					whole.setRight(InputDisplays.helpNum());
				}
			});
			Button symbol = new Button("Symbol input");
			symbol.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					whole.setCenter(InputDisplays.symbolInput());
					whole.setRight(InputDisplays.helpSym());
				}
			});
			Button molarMass = new Button("molar mass Input");
			molarMass.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					whole.setCenter(InputDisplays.molarMassInput());
					whole.setRight(InputDisplays.helpMolarMass());
				}
			});
			FlowPane inp = new FlowPane(name, num, symbol, molarMass);
			inp.setPadding(new Insets(10, 20, 0, 0));
			inp.setMaxWidth(25);
		input.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setLeft(inp);				
			}
		});
			
//		review
		Button molarMassGame = new Button("molar mass game");
		molarMassGame.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setCenter(molarMassGame());
				whole.setLeft(null);
				whole.setRight(helpMolarMassGame());
			}
		});
		
//		ions
		Button ions = new Button("Ions");
			Text info = new Text("Information");
			Button charge = new Button("Ion Charges");
			charge.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					whole.setCenter(IonDisplay.displayMono());
					whole.setRight(null);
				}
			});
			Button poly = new Button("Polyatomic Ions");
			poly.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					whole.setCenter(IonDisplay.displayPoly());
					whole.setRight(null);
				}
			});
			FlowPane drp = new FlowPane(info, charge, poly);
			drp.setPadding(new Insets(10, 20, 2, 0));
			drp.setMaxWidth(25);
		ions.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setLeft(drp);
			}
		});
		
		HBox b = new HBox( 50 , home, pTable, input, molarMassGame, ions);
		b.setAlignment(Pos.CENTER);
		whole.setTop(b);
		
		whole.setCenter(home());
		
		primaryStage.setScene(s);
	}
	
	//home display
	public static GridPane home(){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		Text title = new Text();
		title.setText("Welcome");
		title.setFont(Font.font(25));
		grid.add(title, 0, 0);
		
		return grid;
		
	}

	//review displays
	public static GridPane molarMassGame(){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		ChemUtils.addText(grid, "Guess the Molar Mass", 0, 0);
		
		String genComp = Compound.generateCompound();
		ChemUtils.addText(grid, "The compound is: \t\t" + genComp, 0, 1);
		
		ChemUtils.addText(grid, "What is the molar mass?", 0, 2);
		
		TextField inp = new TextField();
		grid.add(inp, 0, 3);
		
		Text t = new Text();
		grid.add(t, 0, 4);

		//finish it
		Button submit = new Button("Submit");
		submit.setOnMousePressed(new EventHandler<Event>(){
			public void handle(Event event){
				String input = inp.getText();
				if(input.isEmpty()){
					t.setText("Input an answer");
					
				}else{
					if(ChemUtils.verify(5, input)){
						t.setText("Correct");
					}else{
						t.setText("Incorrect. the correct answer is: " + in1.getMolarMass(new Compound(genComp)));
					}
					if(input.isEmpty()){
						t.setText("");
						submit.setText("Submit");
					}else{
						inp.setText("");
						submit.setText("Reset");
					}
				}

			}
		});
		grid.add(submit, 1, 3);
		
//		ChemUtils.addHelpButton(grid, 5, 2, 3);
		
		return grid;
	}
	
	//help panel
	public static GridPane helpMolarMassGame(){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		
		ChemUtils.addText(grid, "You are given a randomly generated compound. \n it is up to you to figure out the molar mass", 0, 0);
		
		return grid;
	}
	
	//additional display methods
	public static GridPane errorWindow(){
		GridPane g = new GridPane();
		g.setAlignment(Pos.CENTER);
		
		ChemUtils.addText(g, "you done messed up", 0, 0);

		return g;
		
	}


}
