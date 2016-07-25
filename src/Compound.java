import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class Compound extends Elements {
	private static Elements in;
	private static String compound;
	
	public Compound(){
		Compound.compound = null;
	}
	
	public Compound(String comp){
		Compound.compound = comp;
	}
	
	public String getCompound(){
		return compound;
	}
	
	public String[] getInd(){
		String[] result = StringUtils.splitByCharacterType(compound);
		return result;
	}

	public ArrayList<String> getElements(){
		ArrayList<String> result = new ArrayList<String>();
		String[] split = StringUtils.splitByCharacterType(compound);
		for(int i = 0; i < split.length; i++){
			if(NumberUtils.isNumber(split[i])){
				continue;
			}else{
				result.add(split[i]);
			}
		}
		
		return result;
		
	}
	
	public ArrayList<Integer> getNumbers(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		String[] split = StringUtils.splitByCharacterType(compound);
		for(int i = 0; i < split.length; i++){
			if(NumberUtils.isNumber(split[i])){
				result.add(new Integer(split[i]));
			}else{
				continue;
			}
		}
		
		return result;
	}
	
	public String toString(){
		String result = "";
		String elemtn = "The elements in the compound are: ";
		ArrayList<String> elements = getElements();
		ArrayList<Integer> numOfElements = getNumbers();		
		int lenght = (int)((getNumbers().size() + getElements().size()) / 2);
		for(int i = 0; i < lenght; i++){
			in = new Elements(elements.get(i));
			String elemetn = in.getElementName(in.getFind());
			if((i != lenght-1)){
				elemtn += elemetn + ", ";				
			}else{
				elemtn += "and " + elemetn + ".\n";
			}
			
		}
		result += elemtn;
		String compMass = "The total mass of the compound is: " + getMolarMass(this) + ".\n";
		result += compMass;
		String indMass = "The individual masses are: ";
		for(int k = 0; k < lenght; k++){
			in = new Elements(elements.get(k));
			double elemetn = in.getMolarMass(elements.get(k), numOfElements.get(k));
			if((k != lenght-1)){
				indMass += elemetn + ", ";				
			}else{
				indMass += "and " + elemetn + ".\n";
			}
		}
		result += indMass;
		return result;
	}
}
