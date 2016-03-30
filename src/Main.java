/**
 * @author Alessandro Guaresti 
 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] arg){
		boolean con = true;
		Scanner in = new Scanner(System.in);
		Menu();
		while(con == true){
			String input1 = in.next();
			if(input1.equalsIgnoreCase("a")){
				while(con == true){
					nameImput();
				}
			}else if(input1.equalsIgnoreCase("b")){
				while(con == true){
					numberInput();
				}
			}else if(input1.equalsIgnoreCase("c")){
				while(con == true){
					symbolInput();
				}
			}else if(input1.equalsIgnoreCase("d")){
				while(con == true){
					molarMass();
				}
			}else{
				System.out.println("Please Choose an option.");
			}
		}
		in.close();
	}
	
	/**
	 * Method that displays the options for the users. Might be temporary
	 * @return Options to choose
	 */
	public static void Menu(){
		System.out.println("If you want to Input an element's name and get information type: A");
		System.out.println("If you know the element's Atomic Number type: B");
		System.out.println("If you know the element's Symbol type: C");
		System.out.println("If you want to know the molar mass of any molecule type: D");

	}
	
	/**
	 * Method that uses the element name and validates if it's correct or not
	 * @return the information based on the element name
	 */
	public static void nameImput(){
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the name of the element. (make sure what you entered is spelled corectly)");
		String input2 = in.next();
		Elements el = new Elements(input2);
		if(el.getElementName(el.getFind()).equalsIgnoreCase(input2)){
			System.out.println(el.toString());
		}else{
			System.out.println(input2 + " is not an element or is not spelled correctly");
		}
		
	}
	
	/**
	 * Method that uses the Element's Symbol To return information and validates that it is an Element
	 * @return The information based on the Symbol
	 */
	public static void symbolInput(){
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("What element do you want to know about? (Enter the element's symbol)");
		String symbol = in.nextLine();
		Elements el = new Elements(symbol);
		if(el.getElementSymbol(el.getFind()).equalsIgnoreCase(symbol)){
			System.out.println(el.toString());
		}else{
			System.out.println(symbol + " is not an element's symbol");
		}
	}
	
	/**
	 * Method that uses the atomic number and validates if it's within range
	 * @return The information based on the atomic number
	 */
	public static void numberInput(){
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("What element do you want to know about? (Use integer numbers from 1 to 118)");
		int num = in.nextInt();
		if(num <= 0 || num >= 119){
			if(num <= 0){
				System.out.println("There is no Element " + num + ". Choose another one.");
			}else if(num >= 119){
				System.out.println("There is no Element " + num + ". Choose another one.");
			}
		}else{
			Elements el = new Elements(num);
			System.out.println(el.toString());	
		}
	}
	
	/**
	 * Method that uses
	 * @return the Molar Mass of the molecule
	 */
	public static void molarMass(){
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("What molecule do you want to know the molar mass of? (use symbols followed by subscript ex CH4)");
		String mol = in.next();
		Elements el = new Elements();
		el.getMolarMass(mol);
		System.out.println(el.molarString());
	}
}
/**
 * Idea list for program
 * 
 * 2.molar-mass finder
 * 3.moles calculator

 * 
 **/
