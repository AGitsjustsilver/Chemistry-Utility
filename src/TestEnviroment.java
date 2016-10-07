import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TestEnviroment extends Application{
	
	public static void main(String[] args){
		launch(args);
	}
	
	public void start(Stage primaryStage){
		Scene s = new Scene(createTable(), 500, 500);
		primaryStage.setScene(s);
		primaryStage.setTitle("test");
		primaryStage.show();
	}
	
	public static GridPane createTable(){
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setGridLinesVisible(true);
		root.add(createEl(new Elements(1)), 0, 0);
		root.add(createEl(new Elemetns(2)), 0, 17);
		root.add(createEl(new Elements(3)), 1, 0);
		root.add(createEl(new Elements(4)), 1, 1);
		root.add(createEL(new Elements(5)), 1, 12);
		root.add(createEl(new Elements(6)), 1, 13);
		root.add(createEl(new Elements(7)), 1, 14);
		root.add(createEl(new Elements(8)), 1, 15);
		root.add(createEl(new Elements(9)), 1, 16);
		root.add(createEl(new Elements(10)), 1, 17);
		root.add(createEl(new Elements(11)), 2, 0);
		root.add(createEl(new Elements(12)), 2, 1);
		root.add(createEl(new Elements(13)), 2, 12);
		root.add(createEl(new Elements(14)), 2, 13);
		root.add(createEl(new Elements(15)), 2, 14);
		root.add(createEl(new Elements(16)), 2, 15);
		root.add(createEl(new Elements(17)), 2, 16);
		root.add(createEl(new Elements(18)), 2, 17);
		root.add(createEl(new Elements(19)), 3, 0);
		root.add(createEl(new Elements(20)), 3, 1);
		root.add(createEl(new Elements(21)), 3, 2);
		root.add(createEl(new Elements(22)), 3, 3);
		root.add(createEl(new Elements(23)), 3, 4);
		root.add(createEl(new Elements(24)), 3, 5);
		root.add(createEl(new Elements(25)), 3, 6);
		root.add(createEl(new Elements(26)), 3, 7);
		root.add(createEl(new Elements(27)), 3, 8);
		root.add(createEl(new Elements(28)), 3, 9);
		root.add(createEl(new Elements(29)), 3, 10);
		root.add(createEl(new Elements(30)), 3, 11);
		root.add(createEl(new Elements(31)), 3, 12);
		root.add(createEl(new Elements(32)), 3, 13);
		root.add(createEl(new Elements(33)), 3, 14);
		root.add(createEl(new Elements(34)), 3, 15);
		root.add(createEl(new Elements(35)), 3, 16);
		root.add(createEl(new Elements(36)), 3, 17);
		root.add(createEl(new Elements(37)), 4, 0);
		root.add(createEl(new Elements(38)), 4, 1);
		root.add(createEl(new Elements(39)), 4, 2);
		root.add(createEl(new Elements(40)), 4, 3);
		root.add(createEl(new Elements(41)), 4, 4);
		root.add(createEl(new Elements(42)), 4, 5);
		root.add(createEl(new Elements(43)), 4, 6);
		root.add(createEl(new Elements(44)), 4, 7);
		root.add(createEl(new Elements(45)), 4, 8);
		root.add(createEl(new Elements(46)), 4, 9);
		root.add(createEl(new Elements(47)), 4, 10);
		root.add(createEl(new Elements(48)), 4, 11);
		root.add(createEl(new Elements(49)), 4, 12);
		root.add(createEl(new Elements(50)), 4, 13);
		root.add(createEl(new Elements(51)), 4, 14);
		root.add(createEl(new Elements(52)), 4, 15);
		root.add(createEl(new Elements(53)), 4, 16);
		root.add(createEl(new Elements(54)), 4, 17);
		root.add(createEl(new Elements(55)), 5, 0);
		root.add(createEl(new Elements(56)), 5, 1);
		root.add(createEl(new Elements(57)), 8, 3);
		root.add(createEl(new Elements(58)), 8, 4);
		root.add(createEl(new Elements(59)), 8, 5);
		root.add(createEl(new Elements(60)), 8, 6);
		root.add(createEl(new Elements(61)), 8, 7);
		root.add(createEl(new Elements(62)), 8, 8);
		root.add(createEl(new Elements(63)), 8, 9);
		root.add(createEl(new Elements(64)), 8, 10);
		root.add(createEl(new Elements(65)), 8, 11);
		root.add(createEl(new Elements(66)), 8, 12);
		root.add(createEl(new Elements(67)), 8, 13);
		root.add(createEl(new Elements(68)), 8, 14);
		root.add(createEl(new Elements(69)), 8, 15);
		root.add(createEl(new Elements(70)), 8, 16);
		root.add(createEl(new Elements(71)), 8, 17);
			 
			 
		
		return root;
	}
	
	public static GridPane createEl(Elements f){
		GridPane grid = new GridPane();
		grid.setVgap(2);
		grid.setHgap(2);
		
		ChemUtils.addText(grid, f.basicString(), 0, 0);
		
		return grid;
	}
	
}


