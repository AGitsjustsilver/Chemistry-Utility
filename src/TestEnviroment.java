import javax.swing.*;

public class TestEnviroment {
	
	public static void main(String[] arg){
		draw();
	}
	
	public static void draw(){
		JFrame back = new JFrame();
		back.setSize(500, 650);
		back.setVisible(true);
		back.setTitle("Chemistry Utility");
		pannel();
		
	}
	// now on desktop
	
	public static void pannel(){
		JPanel main = new JPanel();
		main.setBounds(0, 0, 450, 600);
		
	}
	
}
