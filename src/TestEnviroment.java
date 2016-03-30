import java.util.Scanner;

public class TestEnviroment {
	
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		System.out.println("Type something");
		String thang = in.nextLine();
		thing(thang);
		
		in.close();
		
	}
	
	public static void thing(String name){
		char[] ind = {};
		name.getChars(0, name.length(),	ind, 0);
		for(int i = 0; i < ind.length; i++){
			System.out.print(ind[i]);
		}
	}
	
}
