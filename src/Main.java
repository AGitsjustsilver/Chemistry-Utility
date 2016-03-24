import java.util.Scanner;


public class Main {
	
	public static void main(String[] arg){
		boolean con = true;
		Scanner in = new Scanner(System.in);
		System.out.println("What element do you want to know about?");	
		while (con == true){
			int num = in.nextInt();
			if(num == 0 || num == 119){
				if(num == 0){
					System.out.println("There is no Element 0. Choose another one.");
				}else if(num == 119){
					System.out.println("There is no Element 119. Choose another one.");
				}
			}else{
				Elements el = new Elements(num);
				System.out.println(el.toString());	
			}	
		}
		in.close();
	}
	
}
/**
 * Idea list for program
 * 
 * 1.Elements reference
 * 2.molar-mass finder
 * 3.moles calculator
 * 4. Test Plz Ignore
 * 
 **/
