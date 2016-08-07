import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
	
	
	public static void setBackColor(GridPane grid, String colorHexVal){
		grid.setBackground(new Background(new BackgroundFill(Paint.valueOf(colorHexVal), null, null)));
	}
	
	public static void addHelpButton(GridPane grid, int type, int col, int row){
		Button halp = new Button("Help");
		halp.setOnMousePressed(new EventHandler<Event>() {
			public void handle(Event event){
				Stage st = new Stage();
				if(type == 1){
					Displays.helpName(st);
				}else if(type == 2){
					Displays.helpNum(st);
				}else if(type == 3){
					Displays.helpSym(st);
				}else if(type == 4){
					Displays.helpMolarMass(st);
				}else{
					Displays.errorWindow(st);
				}
				st.show();
			}
		});
		grid.add(halp, col, row);
	}
	

}
