package ag.com.main;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class ChemUtils {
	
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
	
	

}
