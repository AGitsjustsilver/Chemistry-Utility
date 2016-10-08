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
		Scene s = new Scene(createTable(), 1080, 1080);
		primaryStage.setScene(s);
		primaryStage.setTitle("test");
		primaryStage.show();
	}
	
	public static GridPane createTable(){
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
		root.add(createEl(new Elements(57)), 3, 8);
		root.add(createEl(new Elements(58)), 4, 8);
		root.add(createEl(new Elements(59)), 5, 8);
		root.add(createEl(new Elements(60)), 6, 8);
		root.add(createEl(new Elements(61)), 7, 8);
		root.add(createEl(new Elements(62)), 8, 8);
		root.add(createEl(new Elements(63)), 9, 8);
		root.add(createEl(new Elements(64)), 10, 8);
		root.add(createEl(new Elements(65)), 11, 8);
		root.add(createEl(new Elements(66)), 12, 8);
		root.add(createEl(new Elements(67)), 13, 8);
		root.add(createEl(new Elements(68)), 14, 8);
		root.add(createEl(new Elements(69)), 15, 8);
		root.add(createEl(new Elements(70)), 16, 8);
		root.add(createEl(new Elements(71)), 17, 8);
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
		root.add(createEl(new Elements(89)), 3, 9);
		root.add(createEl(new Elements(90)), 4, 9);
		root.add(createEl(new Elements(91)), 5, 9);
		root.add(createEl(new Elements(92)), 6, 9);
		root.add(createEl(new Elements(93)), 7, 9);
		root.add(createEl(new Elements(94)), 8, 9);
		root.add(createEl(new Elements(95)), 9, 9);
		root.add(createEl(new Elements(96)), 10, 9);
		root.add(createEl(new Elements(97)), 11, 9);
		root.add(createEl(new Elements(98)), 12, 9);
		root.add(createEl(new Elements(99)), 13, 9);
		root.add(createEl(new Elements(100)), 14, 9);
		root.add(createEl(new Elements(101)), 15, 9);
		root.add(createEl(new Elements(102)), 16, 9);
		root.add(createEl(new Elements(103)), 17, 9);
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
	
	public static GridPane createEl(Elements f){
		GridPane grid = new GridPane();
		grid.setVgap(2);
		grid.setHgap(2);
		
		ChemUtils.addText(grid, f.basicString(), 0, 0);
		
		return grid;
	}
	
}


