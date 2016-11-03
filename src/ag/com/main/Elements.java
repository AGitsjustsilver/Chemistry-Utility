package ag.com.main;
import java.util.ArrayList;

/**
 * 
 * @author Alessandro Guaresti
 * @version 0.0.5   6/6/16
 *
 */


public class Elements{
	
	private String[] elementName = {"Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminium", "Silicon", "Phosphorus", "Sulfur", "Chlorine", "Argon", "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "Iron", "Cobalt", "Nickle", "Copper", "Zinc", "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine", "Krypton", "Rubidium", "Strontium", "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium", "Ruthenium", "Rhodium", "Palladium", "Silver", "Cadmium", "Indium", "Tin", "Antimony", "Tellurium", "Iodine", "Xenon", "Caesium", "Barium", "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium", "Gadolinium", "Terbium", "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium", "Hafnium", "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead", "Bismusth", "Polomium", "Astatine", "Radon", "Francium", "Randium", "Actinium", "Thorium", "Protactinium", "Uranium", "Neptunium", "Plutonium", "Americum", "Curium", "Berkelium", "Californium", "Einsteinium", "Fermium", "Mendeledvium", "Nobelium", "Lawrencium", "Rutherfordium", "Dubnium", "Seaborgium", "Bohrium", "Hassium", "Meitnerium", "Darmstandtium", "Roentgenium", "Copernicium", "Nihonium", "Fleovium", "Moscovium", "Livermorium", "Tennessine", "Oganesson"};
	private String[] elementSymbol = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og"};
	private int[] atomicNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118};
	private double[] atomicMass = {1.01, 4.00, 6.94, 9.01, 10.81, 12.01, 14.01, 16.00, 19.00, 20.18, 22.99, 24.31, 26.98, 28.09, 30.97, 32.07, 35.45, 39.95, 39.10, 40.08, 44.96, 47.87, 50.94, 52.00, 54.94, 55.85, 58.93, 58.69, 63.55, 65.39, 69.72, 72.61, 74.92, 78.96, 79.90, 83.80, 85.47, 87.62, 88.91, 91.22, 92.91, 95.94, 98, 101.07, 102.91, 106.42, 107.87, 112.41, 114.82, 118.71, 121.76, 127.60, 126.90, 131.29, 132.91, 137.33, 138.91, 140.12, 140.91, 144.24, 145, 150.36, 151.96, 157.25, 158.93, 162.50, 164.93, 167.26, 168.93, 173.04, 174.97, 179.49, 180.95, 183.84, 186.21, 190.23, 192.22, 195.08, 196.97, 200.59, 204.38, 207.2, 208.98, 209, 210, 222, 223, 226, 227, 232.04, 231.04, 238.03, 237, 244, 243, 247, 247, 251, 252, 257, 258, 259, 262, 261, 262, 266, 264, 269, 268, 281, 280, 285, 284, 289, 288, 293, 294, 294};
	private int find;
	
	
	/**
	 * Default constructor That sets default to 0
	 */
	public Elements(){
		this.find = 0;
	}
	
	/**
	 * Constructor thats takes in an integer number and set the find to the elements position in the arrays.
	 * It helps other methods.
	 * @param Integer Atomic number
	 * 
	 */
	public Elements(int num){
		this.find = num-1;
	}
	
	/**
	 * Constructor thats takes in the name of the element and checks it through the names array and set the position. 
	 * It helps the other methods.
	 * @param String Element Name
	 * 
	 */
	public Elements(String name){
		for(int index = 0; index < atomicNumber.length; index++){
			if(elementName[index].equalsIgnoreCase(name)){
				this.find = index ;
			}else if(elementSymbol[index].equalsIgnoreCase(name)){
				this.find = index ; 
			}
		}
	}
		
	/**
	 * Method that will take in a string with a certain set of conditions
	 * 
	 * @param String the actual Molecule
	 * 
	 */
	public double getMolarMass(Compound comp){
		/*
		 * get a single string that is the compound. 
		 * it then gets broken down into the respective atoms and number of atoms. 
		 * And then gets each individual mass and adds them up. 
		 */
		double result = 0.0;
		ArrayList<String> elements = comp.getElements();
		ArrayList<Integer> numberOf = comp.getNumbers();
		int lengths = (int)( ( elements.size() + numberOf.size() ) / 2 );
		for(int i = 0; i < lengths; i++){
			result += getMolarMass(elements.get(i), numberOf.get(i));	
		}
		return result;
	}
	
	public double getMolarMass(String atom1, int numOfAtom1){
		double result = 0.0;
		atom1.trim();
		Elements i = new Elements(atom1);
		result += i.getAtomicMass(i.getFind());
		result *= numOfAtom1;
		return result;
	}
	
	/**
	 * Method used to help some of the validity checker 
	 * @return find 
	 */
	public int getFind(){
		return find;
	}
	
	/**
	 * Method that gets the Element's Name using the Atomic Number
	 * @param Integer Atomic Number
	 * @return the element's name in the array according to the atomic number imputed
	 */
	public String getElementName(int find){
		return elementName[find]; 
	}
	
	/**
	 * Method that gets the Element's Symbol using the Atomic Number
	 * @param Integer Atomic Number
	 * @return the element's symbol in the array according to the atomic number imputed
	 */
	public String getElementSymbol(int find){
		return elementSymbol[find];
	}
	
	/**
	 * Method using find
	 * @param integer
	 * @return Atomic number
	 * 
	 */
	public int getAtomicNumber(int find){
		return atomicNumber[find];
	}
	
	/**
	 * Method that gets the Atomic Mass using the Atomic number
	 * @param Integer Atomic Number
	 * @return the atomic mass in the array according to the atomic number imputed
	 */
	public double getAtomicMass(int find){
		return atomicMass[find];
	}
		
	/**
	 * Method that return the information of and element
	 * @return Elements info
	 * 
	 */
	public String toString(){
		return "For the Element " + getElementName(find) + ".\n"
				+ "The Symbol is: " + getElementSymbol(find) + ".\n"
				+ "The Atomic Number is: " + getAtomicNumber(find) + ".\n"
				+ "The Atomic Mass of: " + getAtomicMass(find) + " amu.";
	}
	
	public String basicString(){
		return getAtomicNumber(find) + "\n"
				+ getElementSymbol(find) + "\n"
				+ getElementName(find) + "\n" 
				+ getAtomicMass(find);
	}
	

	
}