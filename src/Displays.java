/*
 * @author: Alessandro Guaresti
 */
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Displays{
	private static Elements in;
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
			}
		});
		Button pTable = new Button("Periodic Table");
		pTable.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setCenter(perodicTable());
			}
		});
		Button name = new Button("Name Input");
		name.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setCenter(nameInput());
			}
		});
		Button num = new Button("atomic num Input");
		num.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setCenter(numberInput());
			}
		});
		Button symbol = new Button("Symbol input");
		symbol.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setCenter(symbolInput());
			}
		});
		Button molarMass = new Button("molar mass Input");
		molarMass.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setCenter(molarMassInput());
			}
		});
		Button molarMassGame = new Button("molar mass game");
		molarMassGame.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				whole.setCenter(molarMassGame());
			}
		});
		
		ToolBar b = new ToolBar(home, pTable, name, num, symbol, molarMass, molarMassGame);
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

	//input displays
	public static GridPane nameInput(){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		ChemUtils.addText(grid, "Name Input", 0, 0);
		
		ChemUtils.addText(grid, "Please enter the name of the element. (make sure what you entered is spelled corectly)",0, 1);
		
		TextField inp = new TextField();
		grid.add(inp, 0, 2);
		
		Text t = new Text();
		grid.add(t, 0, 3);
		
		Button submit = new Button("Submit");
		submit.setOnMousePressed(new EventHandler<Event>() {
			public void handle(Event event){
				String response = inp.getText();
				if(verify(1, response)){
					in = new Elements(response);
					t.setText(in.toString());
				}else{
					t.setText("Input a valid response");
					inp.setText("");
				}
				if(response.isEmpty()){
					t.setText("");
					submit.setText("Submit");
				}else{
					inp.setText("");
					submit.setText("Reset");
				}
			}

		});
		grid.add(submit, 1, 2);
		
		ChemUtils.addHelpButton(grid, 1, 1, 3);

		
		return grid;
	}
	
	public static GridPane numberInput(){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		ChemUtils.addText(grid, "Atomic Number Input", 0, 0);

		ChemUtils.addText(grid, "What element do you want to know about? (Use integer numbers from 1 to 118)", 0, 1);
		
		TextField inp = new TextField();
		grid.add(inp, 0, 2);
		
		Text t = new Text();
		grid.add(t, 0, 3);

		Button submit = new Button("Submit");
		submit.setOnMousePressed(new EventHandler<Event>() {
			public void handle(Event event){
				String response = inp.getText();
				if(verify(3, response)){
					in = new Elements(new Integer(response));
					t.setText(in.toString());
				}else{
					t.setText("Input a valid response");
					inp.setText("");
				}
				if(response.isEmpty()){
					t.setText("");
					submit.setText("Submit");
				}else{
					inp.setText("");
					submit.setText("Reset");
				}
			}
		});
		grid.add(submit, 1, 2);
		
		ChemUtils.addHelpButton(grid, 2, 1, 3);
		
		return grid;
	}
	
	public static GridPane symbolInput(){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		ChemUtils.addText(grid, "Element Symbol Input", 0, 0);
		
		ChemUtils.addText(grid, "What element do you want to know about? (Enter the element's symbol)", 0, 1);
		
		TextField inp = new TextField();
		grid.add(inp, 0, 2);
		
		Text t = new Text();
		grid.add(t,0, 3);
		
		Button submit = new Button("Submit");
		submit.setOnMousePressed(new EventHandler<Event>() {
			public void handle(Event event){
				String response = inp.getText();
				if(verify(2, response)){
					in = new Elements(response);
					t.setText(in.toString());
				}else{
					t.setText("Input a valid response");
					inp.setText("");
				}
				if(response.isEmpty()){
					t.setText("");
					submit.setText("Submit");
				}else{
					inp.setText("");
					submit.setText("Reset");
				}
			}
		});
		grid.add(submit, 1, 2);
		
		ChemUtils.addHelpButton(grid, 3, 2, 2);
		
		return grid;
	}
	
	public static GridPane molarMassInput(){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		ChemUtils.addText(grid, "Molar Mass", 0, 0);
		
		ChemUtils.addText(grid, "Of what compound do you wish to find the molar mass?", 0, 1);

		TextField inp = new TextField();
		grid.add(inp, 0, 2);
		
		Text t = new Text();
		grid.add(t, 0, 3);
		
		Button submit = new Button("Submit");
		submit.setOnMousePressed(new EventHandler<Event>(){
			public void handle(Event event){
				String response = inp.getText();
				if(verify(4, response)){					
					in1 = new Compound(response);
					t.setText(in1.toString());
				}else{
					t.setText("Input a valid response");
					inp.setText("");
				}
				if(response.isEmpty()){
					t.setText("");
					submit.setText("Submit");
				}else{
					inp.setText("");
					submit.setText("Reset");
				}
			}
		});
		grid.add(submit, 1, 2);
		
		ChemUtils.addHelpButton(grid, 4, 2, 2);
		
		return grid;
	}

	//review displays
	public static GridPane perodicTable(){
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setGridLinesVisible(true);
		root.add(createEl(new Elements(1)), 0, 0);
		root.add(createEl(new Elements(2)), 17, 0);
		root.add(createEl(new Elements(3)), 0, 1);
		root.add(createEl(new Elements(4)), 1, 1);
		root.add(createEl(new Elements(5)), 12, 1);
		root.add(createEl(new Elements(6)), 13, 1);
		root.add(createEl(new Elements(7)), 14, 1);
		root.add(createEl(new Elements(8)), 15, 1);
		root.add(createEl(new Elements(9)), 16, 1);
		root.add(createEl(new Elements(10)), 17, 1);
		root.add(createEl(new Elements(11)), 0, 2);
		root.add(createEl(new Elements(12)), 1, 2);
		root.add(createEl(new Elements(13)), 12, 2);
		root.add(createEl(new Elements(14)), 13, 2);
		root.add(createEl(new Elements(15)), 14, 2);
		root.add(createEl(new Elements(16)), 15, 2);
		root.add(createEl(new Elements(17)), 16, 2);
		root.add(createEl(new Elements(18)), 17, 2);
		root.add(createEl(new Elements(19)), 0, 3);
		root.add(createEl(new Elements(20)), 1, 3);
		root.add(createEl(new Elements(21)), 2, 3);
		root.add(createEl(new Elements(22)), 3, 3);
		root.add(createEl(new Elements(23)), 4, 3);
		root.add(createEl(new Elements(24)), 5, 3);
		root.add(createEl(new Elements(25)), 6, 3);
		root.add(createEl(new Elements(26)), 7, 3);
		root.add(createEl(new Elements(27)), 8, 3);
		root.add(createEl(new Elements(28)), 9, 3);
		root.add(createEl(new Elements(29)), 10, 3);
		root.add(createEl(new Elements(30)), 11, 3);
		root.add(createEl(new Elements(31)), 12, 3);
		root.add(createEl(new Elements(32)), 13, 3);
		root.add(createEl(new Elements(33)), 14, 3);
		root.add(createEl(new Elements(34)), 15, 3);
		root.add(createEl(new Elements(35)), 16, 3);
		root.add(createEl(new Elements(36)), 17, 3);
		root.add(createEl(new Elements(37)), 0, 4);
		root.add(createEl(new Elements(38)), 1, 4);
		root.add(createEl(new Elements(39)), 2, 4);
		root.add(createEl(new Elements(40)), 3, 4);
		root.add(createEl(new Elements(41)), 4, 4);
		root.add(createEl(new Elements(42)), 5, 4);
		root.add(createEl(new Elements(43)), 6, 4);
		root.add(createEl(new Elements(44)), 7, 4);
		root.add(createEl(new Elements(45)), 8, 4);
		root.add(createEl(new Elements(46)), 9, 4);
		root.add(createEl(new Elements(47)), 10, 4);
		root.add(createEl(new Elements(48)), 11, 4);
		root.add(createEl(new Elements(49)), 12, 4);
		root.add(createEl(new Elements(50)), 13, 4);
		root.add(createEl(new Elements(51)), 14, 4);
		root.add(createEl(new Elements(52)), 15, 4);
		root.add(createEl(new Elements(53)), 16, 4);
		root.add(createEl(new Elements(54)), 17, 4);
		root.add(createEl(new Elements(55)), 0, 5);
		root.add(createEl(new Elements(56)), 1, 5);
		ChemUtils.addText(root, "  57 - 71", 2, 5);
		root.add(createEl(new Elements(57)), 3, 7);
		root.add(createEl(new Elements(58)), 4, 7);
		root.add(createEl(new Elements(59)), 5, 7);
		root.add(createEl(new Elements(60)), 6, 7);
		root.add(createEl(new Elements(61)), 7, 7);
		root.add(createEl(new Elements(62)), 8, 7);
		root.add(createEl(new Elements(63)), 9, 7);
		root.add(createEl(new Elements(64)), 10, 7);
		root.add(createEl(new Elements(65)), 11, 7);
		root.add(createEl(new Elements(66)), 12, 7);
		root.add(createEl(new Elements(67)), 13, 7);
		root.add(createEl(new Elements(68)), 14, 7);
		root.add(createEl(new Elements(69)), 15, 7);
		root.add(createEl(new Elements(70)), 16, 7);
		root.add(createEl(new Elements(71)), 17, 7);
		root.add(createEl(new Elements(72)), 3, 5);
		root.add(createEl(new Elements(73)), 4, 5);
		root.add(createEl(new Elements(74)), 5, 5);
		root.add(createEl(new Elements(75)), 6, 5);
		root.add(createEl(new Elements(76)), 7, 5);
		root.add(createEl(new Elements(77)), 8, 5);
		root.add(createEl(new Elements(78)), 9, 5);
		root.add(createEl(new Elements(79)), 10, 5);
		root.add(createEl(new Elements(80)), 11, 5);
		root.add(createEl(new Elements(81)), 12, 5);
		root.add(createEl(new Elements(82)), 13, 5);
		root.add(createEl(new Elements(83)), 14, 5);
		root.add(createEl(new Elements(84)), 15, 5);
		root.add(createEl(new Elements(85)), 16, 5);
		root.add(createEl(new Elements(86)), 17, 5);
		root.add(createEl(new Elements(87)), 0, 6);
		root.add(createEl(new Elements(88)), 1, 6);
		ChemUtils.addText(root, " 89 - 103", 2, 6);
		root.add(createEl(new Elements(89)), 3, 8);
		root.add(createEl(new Elements(90)), 4, 8);
		root.add(createEl(new Elements(91)), 5, 8);
		root.add(createEl(new Elements(92)), 6, 8);
		root.add(createEl(new Elements(93)), 7, 8);
		root.add(createEl(new Elements(94)), 8, 8);
		root.add(createEl(new Elements(95)), 9, 8);
		root.add(createEl(new Elements(96)), 10, 8);
		root.add(createEl(new Elements(97)), 11, 8);
		root.add(createEl(new Elements(98)), 12, 8);
		root.add(createEl(new Elements(99)), 13, 8);
		root.add(createEl(new Elements(100)), 14, 8);
		root.add(createEl(new Elements(101)), 15, 8);
		root.add(createEl(new Elements(102)), 16, 8);
		root.add(createEl(new Elements(103)), 17, 8);
		root.add(createEl(new Elements(104)), 3, 6);
		root.add(createEl(new Elements(105)), 4, 6);
		root.add(createEl(new Elements(106)), 5, 6);
		root.add(createEl(new Elements(107)), 6, 6);
		root.add(createEl(new Elements(108)), 7, 6);
		root.add(createEl(new Elements(109)), 8, 6);
		root.add(createEl(new Elements(110)), 9, 6);
		root.add(createEl(new Elements(111)), 10, 6);
		root.add(createEl(new Elements(112)), 11, 6);
		root.add(createEl(new Elements(113)), 12, 6);
		root.add(createEl(new Elements(114)), 13, 6);
		root.add(createEl(new Elements(115)), 14, 6);
		root.add(createEl(new Elements(116)), 15, 6);
		root.add(createEl(new Elements(117)), 16, 6);
		root.add(createEl(new Elements(118)), 17, 6);
			 			 		
		return root;
	}
	
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
					if(verify(5, input)){
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
		
		ChemUtils.addHelpButton(grid, 5, 2, 3);
		
		return grid;
	}
	
	//help displays
	public static void helpName(Stage p){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		ChemUtils.addText(grid, "This is name help", 0, 0);
		
		Scene s = new Scene(grid, 250, 250);
		
		p.setTitle("Help");
		p.setScene(s);
	}
	
	public static void helpNum(Stage p){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		ChemUtils.addText(grid, "This is number help", 0, 0);
		
		Scene s = new Scene(grid, 250, 250);
		
		p.setTitle("Help");
		p.setScene(s);
	}
	
	public static void helpSym(Stage p){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		ChemUtils.addText(grid, "This is symbol help", 0, 0);
		
		Scene s = new Scene(grid, 250, 250);
		
		p.setTitle("Help");
		p.setScene(s);
	}
	
	public static void helpMolarMass(Stage p){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		ChemUtils.addText(grid, "This is molar mass help", 0, 0);
		
		Scene s = new Scene(grid, 250, 250);
		
		p.setTitle("Help");
		p.setScene(s);
	}
	
	public static void helpMolarMassGame(Stage p){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		ChemUtils.addText(grid, "You are given a randomly generated compound. \n it is up to you to figure out the molar mass", 0, 0);
		
		Scene s = new Scene(grid, 275, 275);
		
		p.setTitle("Help");
		p.setScene(s);
	}
	
	//additional display methods
	public static Boolean verify(int type, String verification){
		if(type == 1){
			//for names
			in = new Elements(verification);
			if (in.getElementName(in.getFind()).equalsIgnoreCase(verification)) {
				return true;
			}else{
				return false;
			}
		}else if(type == 2){
			//for symbols
			in = new Elements(verification);
			if(in.getElementSymbol(in.getFind()).equalsIgnoreCase(verification)){
				return true;
			}else{
				return false;
			}
		}else if(type == 3){
			//for numbers
			if(verification.isEmpty()){
				return false;
			}
			int verr = new Integer(verification);
			if(verr <= 0 || verr >= 119){
				if(verr <= 0){
					return false;
				}else if(verr >= 119){
					return false;
				}
			}else{
				return true;
			}
		}else if(type ==4){
			//for compounds
			in1 = new Compound(verification);
			ArrayList<String> el = in1.getElements();
			Boolean res = false;
			for(String i : el){
				res = verify(2, i);
				if(res){
					continue;
				}else{
					break;
				}
			}
			return res;
		}else if(type == 5){
			//for the game
			Double input = new Double(verification);
			if(input == in1.getMolarMass(new Compound(verification))){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	public static void errorWindow(Stage s){
		GridPane g = new GridPane();
		g.setAlignment(Pos.CENTER);
		
		ChemUtils.addText(g, "you fucked up", 0, 0);
		
		Scene s1 = new Scene(g, 250, 250);
		s.setTitle("ERROR. YOU DUMB PROGRAMMER.");
		s.setScene(s1);
		s.show();
		
	}

	public static GridPane createEl(Elements f){
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(3, 2, 3, 2));
				
		ChemUtils.addText(grid, f.basicString(), 0, 0, TextAlignment.CENTER);
		
		return grid;
	}
}
