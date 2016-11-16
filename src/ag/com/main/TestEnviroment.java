package ag.com.main;
//import java.util.Scanner;
//import ag.com.main.Compound;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.Scanner;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonString;
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
	
	
	public static void main(String[] args) throws IOException{
		System.out.println(getName(5));
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

	
	public static String getName(int find) throws IOException{
		String name = "";
		FileInputStream in1;
		File file = new File(el);
		in1 = new FileInputStream(file);
		JsonReader read = Json.createReader(in1);
		JsonArray array = read.readArray();
		name =  array.getJsonObject(find).getString("name");
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


