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
		root.add(createEl(new Elements(72)), 5, 3);
		root.add(createEl(new Elements(73)), 5, 4);
		root.add(createEl(new Elements(74)), 5, 5);
		root.add(createEl(new Elements(75)), 5, 6);
		root.add(createEl(new Elements(76)), 5, 7);
		root.add(createEl(new Elements(77)), 5, 8);
		root.add(createEl(new Elements(78)), 5, 9);
		root.add(createEl(new Elements(79)), 5, 10);
		root.add(createEl(new Elements(80)), 5, 11);
		root.add(createEl(new Elements(81)), 5, 12);
		root.add(createEl(new Elements(82)), 5, 13);
		root.add(createEl(new Elements(83)), 5, 14);
		root.add(createEl(new Elements(84)), 5, 15);
		root.add(createEl(new Elements(85)), 5, 16);
		root.add(createEl(new Elements(86)), 5, 17);
		root.add(createEl(new Elements(87)), 6, 0);
		root.add(createEl(new Elements(88)), 6, 1);
		root.add(createEl(new Elements(89)), 9, 3);
		root.add(createEl(new Elements(90)), 9, 4);
		root.add(createEl(new Elements(91)), 9, 5);
		root.add(createEl(new Elements(92)), 9, 6);
		root.add(createEl(new Elements(93)), 9, 7);
		root.add(createEl(new Elements(94)), 9, 8);
		root.add(createEl(new Elements(95)), 9, 9);
		root.add(createEl(new Elements(96)), 9, 10);
		root.add(createEl(new Elements(97)), 9, 11);
		root.add(createEl(new Elements(98)), 9, 12);
		root.add(createEl(new Elements(99)), 9, 13);
		root.add(createEl(new Elements(100)), 9, 14);
		root.add(createEl(new Elements(101)), 9, 15);
		root.add(createEl(new Elements(102)), 9, 16);
		root.add(createEl(new Elements(103)), 9, 17);
		root.add(createEl(new Elements(104)), 6, 3);
		root.add(createEl(new Elements(105)), 6, 4);
		root.add(createEl(new Elements(106)), 6, 5);
		root.add(createEl(new Elements(107)), 6, 6);
		root.add(createEl(new Elements(108)), 6, 7);
		root.add(createEl(new Elements(109)), 6, 8);
		root.add(createEl(new Elements(110)), 6, 9);
		root.add(createEl(new Elements(111)), 6, 10);
		root.add(createEl(new Elements(112)), 6, 11);
		root.add(createEl(new Elements(113)), 6, 12);
		root.add(createEl(new Elements(114)), 6, 13);
		root.add(createEl(new Elements(115)), 6, 14);
		root.add(createEl(new Elements(116)), 6, 15);
		root.add(createEl(new Elements(117)), 6, 16);
		root.add(createEl(new Elements(118)), 6, 17);
			 			 		
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


