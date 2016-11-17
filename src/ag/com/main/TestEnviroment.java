package ag.com.main;

//import ag.com.main.Compound;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonWriter;
import org.json.JSONArray;
import org.json.JSONObject;

//import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class TestEnviroment /**extends Application**/{
	
	private static String[] special = {"!","@","#", "$", "%","^","&","*","(",")","-",","};
	
	private static String el = "src/resources/Elements.json";
	
	public static void main(String[] args) throws IOException{
		
		JSONArray in = new JSONArray(el);
		System.out.println(in.getJSONObject(0).getString("name"));
		
//		System.out.println(getName(5));
		
//		Scanner in = new Scanner(new File(el));
//		String thing = in.nextLine();
//		System.out.println(thing);
//		System.out.println(thing.length());
//		in.close();
		
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("type something");
//		String str = in.nextLine();
//
//		
//		if(con(str)){
//			System.out.println("No special characters");
//		}else{
//			System.out.println("You may pass");
//		}
//		
//		in.close();
//		launch(args);
	}
	
	public static void organizeFile(File f) throws IOException{
		Scanner in = new Scanner(f);
		String holyKamoly = in.toString();
		for(int i = 0; i < holyKamoly.length(); i++){
			
			
		}
		
		in.close();
	}
	
	public static void makeFile() throws IOException{
		Elements e = new Elements();
		JsonArray array = Json.createArrayBuilder()
							.add(Json.createObjectBuilder()
									.add("names", Json.createArrayBuilder()
											.add(e.getElementName(0))
											.add(e.getElementName(1))
											.add(e.getElementName(2))
											.add(e.getElementName(3))
											.add(e.getElementName(4))
											.add(e.getElementName(5))
											.add(e.getElementName(6))
											.add(e.getElementName(7))
											.add(e.getElementName(8))
											.add(e.getElementName(9))
											.add(e.getElementName(10))
											.add(e.getElementName(11))
											.add(e.getElementName(12))
											.add(e.getElementName(13))
											.add(e.getElementName(14))
											.add(e.getElementName(15))
											.add(e.getElementName(16))
											.add(e.getElementName(17))
											.add(e.getElementName(18))
											.add(e.getElementName(19))
											.add(e.getElementName(20))
											.add(e.getElementName(21))
											.add(e.getElementName(22))
											.add(e.getElementName(23))
											.add(e.getElementName(24))
											.add(e.getElementName(25))
											.add(e.getElementName(26))
											.add(e.getElementName(27))
											.add(e.getElementName(28))
											.add(e.getElementName(29))
											.add(e.getElementName(30))
											.add(e.getElementName(31))
											.add(e.getElementName(32))
											.add(e.getElementName(33))
											.add(e.getElementName(34))
											.add(e.getElementName(35))
											.add(e.getElementName(36))
											.add(e.getElementName(37))
											.add(e.getElementName(38))
											.add(e.getElementName(39))
											.add(e.getElementName(40))
											.add(e.getElementName(41))
											.add(e.getElementName(42))
											.add(e.getElementName(43))
											.add(e.getElementName(44))
											.add(e.getElementName(45))
											.add(e.getElementName(46))
											.add(e.getElementName(47))
											.add(e.getElementName(48))
											.add(e.getElementName(49))
											.add(e.getElementName(50))
											.add(e.getElementName(51))
											.add(e.getElementName(52))
											.add(e.getElementName(53))
											.add(e.getElementName(54))
											.add(e.getElementName(55))
											.add(e.getElementName(56))
											.add(e.getElementName(57))
											.add(e.getElementName(58))
											.add(e.getElementName(59))
											.add(e.getElementName(60))
											.add(e.getElementName(61))
											.add(e.getElementName(62))
											.add(e.getElementName(63))
											.add(e.getElementName(64))
											.add(e.getElementName(65))
											.add(e.getElementName(66))
											.add(e.getElementName(67))
											.add(e.getElementName(68))
											.add(e.getElementName(69))
											.add(e.getElementName(70))
											.add(e.getElementName(71))
											.add(e.getElementName(72))
											.add(e.getElementName(73))
											.add(e.getElementName(74))
											.add(e.getElementName(75))
											.add(e.getElementName(76))
											.add(e.getElementName(77))
											.add(e.getElementName(78))
											.add(e.getElementName(79))
											.add(e.getElementName(80))
											.add(e.getElementName(81))
											.add(e.getElementName(82))
											.add(e.getElementName(83))
											.add(e.getElementName(84))
											.add(e.getElementName(85))
											.add(e.getElementName(86))
											.add(e.getElementName(87))
											.add(e.getElementName(88))
											.add(e.getElementName(89))
											.add(e.getElementName(90))
											.add(e.getElementName(91))
											.add(e.getElementName(92))
											.add(e.getElementName(93))
											.add(e.getElementName(94))
											.add(e.getElementName(95))
											.add(e.getElementName(96))
											.add(e.getElementName(97))
											.add(e.getElementName(98))
											.add(e.getElementName(99))
											.add(e.getElementName(100))
											.add(e.getElementName(101))
											.add(e.getElementName(102))
											.add(e.getElementName(103))
											.add(e.getElementName(104))
											.add(e.getElementName(105))
											.add(e.getElementName(106))
											.add(e.getElementName(107))
											.add(e.getElementName(108))
											.add(e.getElementName(109))
											.add(e.getElementName(110))
											.add(e.getElementName(111))
											.add(e.getElementName(112))
											.add(e.getElementName(113))
											.add(e.getElementName(114))
											.add(e.getElementName(115))
											.add(e.getElementName(116))
											.add(e.getElementName(117))
										)
									.add("symbol", Json.createArrayBuilder()
											.add(e.getElementSymbol(0))
											.add(e.getElementSymbol(1))
											.add(e.getElementSymbol(2))
											.add(e.getElementSymbol(3))
											.add(e.getElementSymbol(4))
											.add(e.getElementSymbol(5))
											.add(e.getElementSymbol(6))
											.add(e.getElementSymbol(7))
											.add(e.getElementSymbol(8))
											.add(e.getElementSymbol(9))
											.add(e.getElementSymbol(10))
											.add(e.getElementSymbol(11))
											.add(e.getElementSymbol(12))
											.add(e.getElementSymbol(13))
											.add(e.getElementSymbol(14))
											.add(e.getElementSymbol(15))
											.add(e.getElementSymbol(16))
											.add(e.getElementSymbol(17))
											.add(e.getElementSymbol(18))
											.add(e.getElementSymbol(19))
											.add(e.getElementSymbol(20))
											.add(e.getElementSymbol(21))
											.add(e.getElementSymbol(22))
											.add(e.getElementSymbol(23))
											.add(e.getElementSymbol(24))
											.add(e.getElementSymbol(25))
											.add(e.getElementSymbol(26))
											.add(e.getElementSymbol(27))
											.add(e.getElementSymbol(28))
											.add(e.getElementSymbol(29))
											.add(e.getElementSymbol(30))
											.add(e.getElementSymbol(31))
											.add(e.getElementSymbol(32))
											.add(e.getElementSymbol(33))
											.add(e.getElementSymbol(34))
											.add(e.getElementSymbol(35))
											.add(e.getElementSymbol(36))
											.add(e.getElementSymbol(37))
											.add(e.getElementSymbol(38))
											.add(e.getElementSymbol(39))
											.add(e.getElementSymbol(40))
											.add(e.getElementSymbol(41))
											.add(e.getElementSymbol(42))
											.add(e.getElementSymbol(43))
											.add(e.getElementSymbol(44))
											.add(e.getElementSymbol(45))
											.add(e.getElementSymbol(46))
											.add(e.getElementSymbol(47))
											.add(e.getElementSymbol(48))
											.add(e.getElementSymbol(49))
											.add(e.getElementSymbol(50))
											.add(e.getElementSymbol(51))
											.add(e.getElementSymbol(52))
											.add(e.getElementSymbol(53))
											.add(e.getElementSymbol(54))
											.add(e.getElementSymbol(55))
											.add(e.getElementSymbol(56))
											.add(e.getElementSymbol(57))
											.add(e.getElementSymbol(58))
											.add(e.getElementSymbol(59))
											.add(e.getElementSymbol(60))
											.add(e.getElementSymbol(61))
											.add(e.getElementSymbol(62))
											.add(e.getElementSymbol(63))
											.add(e.getElementSymbol(64))
											.add(e.getElementSymbol(65))
											.add(e.getElementSymbol(66))
											.add(e.getElementSymbol(67))
											.add(e.getElementSymbol(68))
											.add(e.getElementSymbol(69))
											.add(e.getElementSymbol(70))
											.add(e.getElementSymbol(71))
											.add(e.getElementSymbol(72))
											.add(e.getElementSymbol(73))
											.add(e.getElementSymbol(74))
											.add(e.getElementSymbol(75))
											.add(e.getElementSymbol(76))
											.add(e.getElementSymbol(77))
											.add(e.getElementSymbol(78))
											.add(e.getElementSymbol(79))
											.add(e.getElementSymbol(80))
											.add(e.getElementSymbol(81))
											.add(e.getElementSymbol(82))
											.add(e.getElementSymbol(83))
											.add(e.getElementSymbol(84))
											.add(e.getElementSymbol(85))
											.add(e.getElementSymbol(86))
											.add(e.getElementSymbol(87))
											.add(e.getElementSymbol(88))
											.add(e.getElementSymbol(89))
											.add(e.getElementSymbol(90))
											.add(e.getElementSymbol(91))
											.add(e.getElementSymbol(92))
											.add(e.getElementSymbol(93))
											.add(e.getElementSymbol(94))
											.add(e.getElementSymbol(95))
											.add(e.getElementSymbol(96))
											.add(e.getElementSymbol(97))
											.add(e.getElementSymbol(98))
											.add(e.getElementSymbol(99))
											.add(e.getElementSymbol(100))
											.add(e.getElementSymbol(101))
											.add(e.getElementSymbol(102))
											.add(e.getElementSymbol(103))
											.add(e.getElementSymbol(104))
											.add(e.getElementSymbol(105))
											.add(e.getElementSymbol(106))
											.add(e.getElementSymbol(107))
											.add(e.getElementSymbol(108))
											.add(e.getElementSymbol(109))
											.add(e.getElementSymbol(110))
											.add(e.getElementSymbol(111))
											.add(e.getElementSymbol(112))
											.add(e.getElementSymbol(113))
											.add(e.getElementSymbol(114))
											.add(e.getElementSymbol(115))
											.add(e.getElementSymbol(116))
											.add(e.getElementSymbol(117))
										)
									.add("aNum", Json.createArrayBuilder()
											.add(e.getAtomicNumber(0))
											.add(e.getAtomicNumber(1))
											.add(e.getAtomicNumber(2))
											.add(e.getAtomicNumber(3))
											.add(e.getAtomicNumber(4))
											.add(e.getAtomicNumber(5))
											.add(e.getAtomicNumber(6))
											.add(e.getAtomicNumber(7))
											.add(e.getAtomicNumber(8))
											.add(e.getAtomicNumber(9))
											.add(e.getAtomicNumber(10))
											.add(e.getAtomicNumber(11))
											.add(e.getAtomicNumber(12))
											.add(e.getAtomicNumber(13))
											.add(e.getAtomicNumber(14))
											.add(e.getAtomicNumber(15))
											.add(e.getAtomicNumber(16))
											.add(e.getAtomicNumber(17))
											.add(e.getAtomicNumber(18))
											.add(e.getAtomicNumber(19))
											.add(e.getAtomicNumber(20))
											.add(e.getAtomicNumber(21))
											.add(e.getAtomicNumber(22))
											.add(e.getAtomicNumber(23))
											.add(e.getAtomicNumber(24))
											.add(e.getAtomicNumber(25))
											.add(e.getAtomicNumber(26))
											.add(e.getAtomicNumber(27))
											.add(e.getAtomicNumber(28))
											.add(e.getAtomicNumber(29))
											.add(e.getAtomicNumber(30))
											.add(e.getAtomicNumber(31))
											.add(e.getAtomicNumber(32))
											.add(e.getAtomicNumber(33))
											.add(e.getAtomicNumber(34))
											.add(e.getAtomicNumber(35))
											.add(e.getAtomicNumber(36))
											.add(e.getAtomicNumber(37))
											.add(e.getAtomicNumber(38))
											.add(e.getAtomicNumber(39))
											.add(e.getAtomicNumber(40))
											.add(e.getAtomicNumber(41))
											.add(e.getAtomicNumber(42))
											.add(e.getAtomicNumber(43))
											.add(e.getAtomicNumber(44))
											.add(e.getAtomicNumber(45))
											.add(e.getAtomicNumber(46))
											.add(e.getAtomicNumber(47))
											.add(e.getAtomicNumber(48))
											.add(e.getAtomicNumber(49))
											.add(e.getAtomicNumber(50))
											.add(e.getAtomicNumber(51))
											.add(e.getAtomicNumber(52))
											.add(e.getAtomicNumber(53))
											.add(e.getAtomicNumber(54))
											.add(e.getAtomicNumber(55))
											.add(e.getAtomicNumber(56))
											.add(e.getAtomicNumber(57))
											.add(e.getAtomicNumber(58))
											.add(e.getAtomicNumber(59))
											.add(e.getAtomicNumber(60))
											.add(e.getAtomicNumber(61))
											.add(e.getAtomicNumber(62))
											.add(e.getAtomicNumber(63))
											.add(e.getAtomicNumber(64))
											.add(e.getAtomicNumber(65))
											.add(e.getAtomicNumber(66))
											.add(e.getAtomicNumber(67))
											.add(e.getAtomicNumber(68))
											.add(e.getAtomicNumber(69))
											.add(e.getAtomicNumber(70))
											.add(e.getAtomicNumber(71))
											.add(e.getAtomicNumber(72))
											.add(e.getAtomicNumber(73))
											.add(e.getAtomicNumber(74))
											.add(e.getAtomicNumber(75))
											.add(e.getAtomicNumber(76))
											.add(e.getAtomicNumber(77))
											.add(e.getAtomicNumber(78))
											.add(e.getAtomicNumber(79))
											.add(e.getAtomicNumber(80))
											.add(e.getAtomicNumber(81))
											.add(e.getAtomicNumber(82))
											.add(e.getAtomicNumber(83))
											.add(e.getAtomicNumber(84))
											.add(e.getAtomicNumber(85))
											.add(e.getAtomicNumber(86))
											.add(e.getAtomicNumber(87))
											.add(e.getAtomicNumber(88))
											.add(e.getAtomicNumber(89))
											.add(e.getAtomicNumber(90))
											.add(e.getAtomicNumber(91))
											.add(e.getAtomicNumber(92))
											.add(e.getAtomicNumber(93))
											.add(e.getAtomicNumber(94))
											.add(e.getAtomicNumber(95))
											.add(e.getAtomicNumber(96))
											.add(e.getAtomicNumber(97))
											.add(e.getAtomicNumber(98))
											.add(e.getAtomicNumber(99))
											.add(e.getAtomicNumber(100))
											.add(e.getAtomicNumber(101))
											.add(e.getAtomicNumber(102))
											.add(e.getAtomicNumber(103))
											.add(e.getAtomicNumber(104))
											.add(e.getAtomicNumber(105))
											.add(e.getAtomicNumber(106))
											.add(e.getAtomicNumber(107))
											.add(e.getAtomicNumber(108))
											.add(e.getAtomicNumber(109))
											.add(e.getAtomicNumber(110))
											.add(e.getAtomicNumber(111))
											.add(e.getAtomicNumber(112))
											.add(e.getAtomicNumber(113))
											.add(e.getAtomicNumber(114))
											.add(e.getAtomicNumber(115))
											.add(e.getAtomicNumber(116))
											.add(e.getAtomicNumber(117))
										)
									.add("aMass", Json.createArrayBuilder()
											.add(e.getAtomicMass(0))
											.add(e.getAtomicMass(1))
											.add(e.getAtomicMass(2))
											.add(e.getAtomicMass(3))
											.add(e.getAtomicMass(4))
											.add(e.getAtomicMass(5))
											.add(e.getAtomicMass(6))
											.add(e.getAtomicMass(7))
											.add(e.getAtomicMass(8))
											.add(e.getAtomicMass(9))
											.add(e.getAtomicMass(10))
											.add(e.getAtomicMass(11))
											.add(e.getAtomicMass(12))
											.add(e.getAtomicMass(13))
											.add(e.getAtomicMass(14))
											.add(e.getAtomicMass(15))
											.add(e.getAtomicMass(16))
											.add(e.getAtomicMass(17))
											.add(e.getAtomicMass(18))
											.add(e.getAtomicMass(19))
											.add(e.getAtomicMass(20))
											.add(e.getAtomicMass(21))
											.add(e.getAtomicMass(22))
											.add(e.getAtomicMass(23))
											.add(e.getAtomicMass(24))
											.add(e.getAtomicMass(25))
											.add(e.getAtomicMass(26))
											.add(e.getAtomicMass(27))
											.add(e.getAtomicMass(28))
											.add(e.getAtomicMass(29))
											.add(e.getAtomicMass(30))
											.add(e.getAtomicMass(31))
											.add(e.getAtomicMass(32))
											.add(e.getAtomicMass(33))
											.add(e.getAtomicMass(34))
											.add(e.getAtomicMass(35))
											.add(e.getAtomicMass(36))
											.add(e.getAtomicMass(37))
											.add(e.getAtomicMass(38))
											.add(e.getAtomicMass(39))
											.add(e.getAtomicMass(40))
											.add(e.getAtomicMass(41))
											.add(e.getAtomicMass(42))
											.add(e.getAtomicMass(43))
											.add(e.getAtomicMass(44))
											.add(e.getAtomicMass(45))
											.add(e.getAtomicMass(46))
											.add(e.getAtomicMass(47))
											.add(e.getAtomicMass(48))
											.add(e.getAtomicMass(49))
											.add(e.getAtomicMass(50))
											.add(e.getAtomicMass(51))
											.add(e.getAtomicMass(52))
											.add(e.getAtomicMass(53))
											.add(e.getAtomicMass(54))
											.add(e.getAtomicMass(55))
											.add(e.getAtomicMass(56))
											.add(e.getAtomicMass(57))
											.add(e.getAtomicMass(58))
											.add(e.getAtomicMass(59))
											.add(e.getAtomicMass(60))
											.add(e.getAtomicMass(61))
											.add(e.getAtomicMass(62))
											.add(e.getAtomicMass(63))
											.add(e.getAtomicMass(64))
											.add(e.getAtomicMass(65))
											.add(e.getAtomicMass(66))
											.add(e.getAtomicMass(67))
											.add(e.getAtomicMass(68))
											.add(e.getAtomicMass(69))
											.add(e.getAtomicMass(70))
											.add(e.getAtomicMass(71))
											.add(e.getAtomicMass(72))
											.add(e.getAtomicMass(73))
											.add(e.getAtomicMass(74))
											.add(e.getAtomicMass(75))
											.add(e.getAtomicMass(76))
											.add(e.getAtomicMass(77))
											.add(e.getAtomicMass(78))
											.add(e.getAtomicMass(79))
											.add(e.getAtomicMass(80))
											.add(e.getAtomicMass(81))
											.add(e.getAtomicMass(82))
											.add(e.getAtomicMass(83))
											.add(e.getAtomicMass(84))
											.add(e.getAtomicMass(85))
											.add(e.getAtomicMass(86))
											.add(e.getAtomicMass(87))
											.add(e.getAtomicMass(88))
											.add(e.getAtomicMass(89))
											.add(e.getAtomicMass(90))
											.add(e.getAtomicMass(91))
											.add(e.getAtomicMass(92))
											.add(e.getAtomicMass(93))
											.add(e.getAtomicMass(94))
											.add(e.getAtomicMass(95))
											.add(e.getAtomicMass(96))
											.add(e.getAtomicMass(97))
											.add(e.getAtomicMass(98))
											.add(e.getAtomicMass(99))
											.add(e.getAtomicMass(100))
											.add(e.getAtomicMass(101))
											.add(e.getAtomicMass(102))
											.add(e.getAtomicMass(103))
											.add(e.getAtomicMass(104))
											.add(e.getAtomicMass(105))
											.add(e.getAtomicMass(106))
											.add(e.getAtomicMass(107))
											.add(e.getAtomicMass(108))
											.add(e.getAtomicMass(109))
											.add(e.getAtomicMass(110))
											.add(e.getAtomicMass(111))
											.add(e.getAtomicMass(112))
											.add(e.getAtomicMass(113))
											.add(e.getAtomicMass(114))
											.add(e.getAtomicMass(115))
											.add(e.getAtomicMass(116))
											.add(e.getAtomicMass(117))	
										)
								).build();
		JsonWriter write = Json.createWriter(new FileWriter(new File(el)));
		write.writeArray(array);
		write.close();
	}
	
	public static JsonArray thing() throws IOException{
		File info = new File(el);
		FileInputStream in = new FileInputStream(info);
		JsonReader read = Json.createReader(in);
		JsonArray ar = read.readArray();
		return ar;
	}
	
	public static String getName(int find) throws IOException{
		String name = "";
		name =  thing().getJsonArray(0).toString();		
		return name;
	}

	public static Boolean con(String str){
		String[] split = getInd(str);
		Boolean result = true;
		for(int i = 0; i < special.length; i++){
			Integer unUsable = new Integer(special[i].hashCode());
			for(int k = 0; k < split.length; i++){				
				if(split[k].hashCode() == unUsable){
					result = false;
					break;
				}else{
					continue;
				}
			}
		}
		return result;
	}

	public static String[] getInd(String st){
		String[] result = new Compound(st).getInd();
		return result;
	}
	
	public void start(Stage p){
		BorderPane b = new BorderPane();
		Scene s = new Scene(b, 600, 600);
		
		
		Button getMenu1 = new Button("drop menu 1");
			Button y1 = new Button("thing 1");
			Button y2 = new Button("thing 2");
			Button y3 = new Button("thing 3");
			Button y4 = new Button("thing 4");
			FlowPane y = new FlowPane(y1, y2, y3, y4);
			y.setPadding(new Insets(10, 5, 0, 5));
			y.setAlignment(Pos.CENTER);
			y.setMaxWidth(20);
		getMenu1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				b.setLeft(y);
			}
		});
		
		Button getMenu2 = new Button("drop menu 2");
		getMenu2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				b.setLeft(null);
				
			}
		});
		Button getMenu3 = new Button("drop menu 3");
		Button getMenu4 = new Button("drop menu 4");
		HBox h = new HBox(20, getMenu1, getMenu2, getMenu3, getMenu4);
		b.setTop(h);
		
		p.setScene(s);
		p.setTitle("Test");
		p.getIcons().add(new Image("resources/icon.png"));
		p.setResizable(false);
		p.show();
	}
	

	
	
	
}


