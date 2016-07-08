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
	
	//need way to get the molar Mass into a string via toString 
	//also it would be good to add the elements that went into the compound and their info
	public String toString(){
		
		
		
		return null;
	}
}
