import java.util.Scanner;



public class TestEnviroment{
	
	private static Elements m;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert compund");
		String inp = in.nextLine();
		m = new Elements();
		System.out.println(m.getMolarMass(inp));;
		in.close();
	}
	
	
	
}
