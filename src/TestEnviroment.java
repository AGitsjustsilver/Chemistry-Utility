import java.util.ArrayList;
import java.util.Scanner;



public class TestEnviroment{
	
	private static Elements m;
	private static Compound n;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert compund");
		String inp = in.nextLine();
//		m = new Elements()
		
		ArrayList<String> bits = new ArrayList<String>();
		for(int i = 0; i < inp.length(); i++){
			bits.add(inp.substring(i, i+1));
		}
		if(bits.contains()){
			
		}
		
//		System.out.println(m.getMolarMass(n));
		in.close();
	}
	
	
	
}
