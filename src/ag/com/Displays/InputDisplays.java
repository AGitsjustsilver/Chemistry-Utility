package ag.com.Displays;

import ag.com.main.ChemUtils;
import ag.com.main.Elements;
import ag.com.main.Compound;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class InputDisplays {
	
	private static Elements in;
	private static Compound in1;
	
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
				if(ChemUtils.verify(1, response)){
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
		
//		ChemUtils.addHelpButton(grid, 1, 1, 3);

		
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
				if(ChemUtils.verify(3, response)){
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
		
//		ChemUtils.addHelpButton(grid, 2, 1, 3);
		
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
				if(ChemUtils.verify(2, response)){
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
		
//		ChemUtils.addHelpButton(grid, 3, 2, 2);
		
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
				if(ChemUtils.verify(4, response)){					
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
		
//		ChemUtils.addHelpButton(grid, 4, 2, 2);
		
		return grid;
	}
	
	//help displays
	public static GridPane helpName(){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		
		ChemUtils.addText(grid, "Insert a name of an element to get it's information \n"
				+ "ex. \n \t\tHydrogen \n" + new Elements("Hydrogen").toString(), 0, 0);
		
		ChemUtils.addText(grid, "Make sure you spelled the element correctly", 0, 1);
		
		ChemUtils.addText(grid, "Capitilization does not matter", 0, 2);
		
		return grid;

	}
	
	public static GridPane helpNum(){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		
		ChemUtils.addText(grid, "Insert the atomic number of an element to get it's information\n"
				+ "ex. \n\t\t\t 5 \n" + new Elements(5).toString(), 0, 0);
		
		ChemUtils.addText(grid, "Remember Elements 0 and 119 do not exist", 0, 1);
		
		return grid;
	}
	
	public static GridPane helpSym(){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		
		ChemUtils.addText(grid, "Insert the element's Symbol to get it's information \n"
				+ "ex. \n\t\t\t Si\n" + new Elements("Si").toString(), 0, 0);
		
		ChemUtils.addText(grid, "Capitalization does not matter", 0, 1);
		
		return grid;
	}
	
	public static GridPane helpMolarMass(){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		
		ChemUtils.addText(grid, "Insert compounds to get the information that they contain \n"
				+ "ex \n\t\t h2o2 \n" + new Compound("h2o2").toString(), 0, 0);
		
		ChemUtils.addText(grid, "make sure any single elements are followed by a 1 \n ex.\n h2o1", 0, 1);
		
		ChemUtils.addText(grid, "Capitalization does not matter", 0, 2);
		
		return grid;
	}
}
