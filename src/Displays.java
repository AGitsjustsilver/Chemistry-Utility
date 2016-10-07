/*
 * @author: Alessandro Guaresti
 */
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Displays{
	private static Elements in;
	private static Compound in1;
	
	//main display
	public static void mainDisplay(Stage primaryStage){
		BorderPane whole = new BorderPane();
		Scene s = new Scene(whole, 600, 600);
		//top navigation
		Button home = new Button("Home");		
		home.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				whole.setCenter(home());
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
		
		ToolBar b = new ToolBar(home, name, num, symbol, molarMass, molarMassGame);
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
		
		ChemUtils.addHelpButton(grid, 4, 2, 2);
		
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
	
}
