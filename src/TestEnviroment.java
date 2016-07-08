import java.util.Scanner;



public class TestEnviroment{
	
	private static Elements m;
	private static Compound n;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert compund");
		String inp = in.nextLine();
		m = new Elements();	
		n = new Compound(inp);
		System.out.println(n.getElements());
		System.out.println(n.getNumbers());
		in.close();
	}
	
	
	
}
