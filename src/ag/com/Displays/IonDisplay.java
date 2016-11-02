package ag.com.Displays;

import ag.com.main.ChemUtils;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;


public class IonDisplay {

	public static GridPane ionCharges(){
		GridPane g = new GridPane();
		g.setAlignment(Pos.CENTER);
		
		ChemUtils.addText(g, "Common ", 0, 1);
		
		return g;
	}
	
	
	
	public static GridPane help(){
		GridPane g = new GridPane();
		g.setAlignment(Pos.CENTER);
		g.setVgap(10);
		
		return g;
	}
	
}
