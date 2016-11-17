package ag.com.main;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class ChemUtils {
	
	private static Elements in;
	private static Compound in1;
	public static String filePath = "src/resources/Elements.json";
	
	public static JsonArray getInfo() throws IOException{
		File element = new File(filePath);
		FileInputStream in = new FileInputStream(element);
		JsonReader reader = Json.createReader(in);
		JsonArray array = reader.readArray();
		return array;
	}
	
	public static void addText(GridPane grid, String text, int col, int row){
		Text rules = new Text();
		rules.setText(text);
		grid.add(rules, col, row);
	}
	
	public static void addText(GridPane grid, String text, int col, int row, boolean visibility){
		Text rules = new Text();
		rules.setText(text);
		rules.setVisible(visibility);
		grid.add(rules, col, row);
	}
	
	public static void addText(GridPane grid, String colorHexVal, String text, int col, int row){
		Text rules = new Text();
		rules.setText(text);
		rules.setFill(Paint.valueOf(colorHexVal));
		grid.add(rules, col, row);
	}
	
	public static void addText(GridPane grid, String colorHexVal, String text, int col, int row, boolean visibility){
		Text rules = new Text();
		rules.setText(text);
		rules.setFill(Paint.valueOf(colorHexVal));
		rules.setVisible(visibility);
		grid.add(rules, col, row);
	}
	
	public static void addText(GridPane grid, String text, int fontsize, int col, int row){
		Text rules = new Text();
		rules.setText(text);
		rules.setFont(new Font(fontsize));
		grid.add(rules, col, row);
	}
	
	public static void addText(GridPane grid, String text, int fontsize, int col, int row, boolean visibility){
		Text rules = new Text();
		rules.setText(text);
		rules.setFont(new Font(fontsize));
		rules.setVisible(visibility);
		grid.add(rules, col, row);
	}
	
	public static void addText(GridPane grid, String text, int col, int row, TextAlignment position){
		Text rules = new Text();
		rules.setTextAlignment(position);
		rules.setText(text);
		grid.add(rules, col, row);
	}
		
	public static void setBackColor(GridPane grid, String colorHexVal){
		grid.setBackground(new Background(new BackgroundFill(Paint.valueOf(colorHexVal), null, null)));
	}
	
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

}
