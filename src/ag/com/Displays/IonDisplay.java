package ag.com.Displays;

import ag.com.main.ChemUtils;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.TextAlignment;


public class IonDisplay {

	public static TilePane display(){
		TilePane g = new TilePane();
		g.setPadding(new Insets(25,5,5,5));
		
		g.getChildren().addAll(ionChargesRepElements(), mettalicIons());
		
		return g;
	}
	
	// formulas and names of common metal ions with more than one ionic charge
	public static GridPane mettalicIons(){
		GridPane g = new GridPane();
		g.setAlignment(Pos.CENTER);
		g.setGridLinesVisible(true);
		
		ChemUtils.addText(g, "Formulas and names of Common Metal Ions \n with More than One Ionic charge", 0, 0, TextAlignment.CENTER);
		g.add(mTop(), 0, 1);
		g.add(mBot(), 0, 2);
		
		
		return g;
	}
	
	public static GridPane mTop(){
		GridPane g = new GridPane();
		g.setAlignment(Pos.CENTER);
		g.setPadding(new Insets(1,25,1,25));
		
		g.add(genCell(g.getInsets(), "Formula"), 0, 0);		
		g.add(genCell(g.getInsets(), "Stock Name"), 1, 0);		
		g.add(genCell(g.getInsets(), "Classical Name"), 2, 0);		
		
		return g;
	}                 
	                  
	public static GridPane mBot(){
		GridPane g = new GridPane();
		g.setPadding(new Insets(2, 27, 2, 27));
		
		g.add(genCell(g.getInsets(), "Cu 1+"), 0, 0);
		g.add(genCell(g.getInsets(), "Copper(I) ion"), 1, 0);
		g.add(genCell(g.getInsets(), "Cuprous ion"), 2, 0);
		
		g.add(genCell(g.getInsets(), "Cu 2+"), 0, 1);
		g.add(genCell(g.getInsets(), "Copper(II) ion"), 1, 1);
		g.add(genCell(g.getInsets(), "Cupric ion"), 2, 1);
		
		g.add(genCell(g.getInsets(), "Fe 2+"), 0, 2);
		g.add(genCell(g.getInsets(), "Iron(II) ion"), 1, 2);
		g.add(genCell(g.getInsets(), "Ferrous ion"), 2, 2);
		                                     
		g.add(genCell(g.getInsets(), "Fe 3+"), 0, 3);
		g.add(genCell(g.getInsets(), "Iron(III) ion"), 1, 3);
		g.add(genCell(g.getInsets(), "Ferric ion"), 2, 3);
		
		g.add(genCell(g.getInsets(), "*Hg2 2+"), 0, 4);
		g.add(genCell(g.getInsets(), "Mercury(I) ion"), 1, 4);
		g.add(genCell(g.getInsets(), "Mercurous ion"), 2, 4);
		
		g.add(genCell(g.getInsets(), "Hg 2+"), 0, 5);
		g.add(genCell(g.getInsets(), "Mercury(II) ion"), 1, 5);
		g.add(genCell(g.getInsets(), "Mercuric"), 2, 5);

		g.add(genCell(g.getInsets(), "Pb 2+"), 0, 6);
		g.add(genCell(g.getInsets(), "Lead(II) ion"), 1, 6);
		g.add(genCell(g.getInsets(), "Plumbous"), 2, 6);

		g.add(genCell(g.getInsets(), "Pb 4+"), 0, 7);
		g.add(genCell(g.getInsets(), "Lead(IV) ion"), 1, 7);
		g.add(genCell(g.getInsets(), "Plumbic ion"), 2, 7);

		g.add(genCell(g.getInsets(), "Sn 2+"), 0, 8);
		g.add(genCell(g.getInsets(), "Tin(II) ion"), 1, 8);
		g.add(genCell(g.getInsets(), "Stannous ion"), 2, 8);
		
		g.add(genCell(g.getInsets(), "Sn 4+"), 0, 9);
		g.add(genCell(g.getInsets(), "Tin(IV) ion"), 1, 9);
		g.add(genCell(g.getInsets(), "Stannic"), 2, 9);
		
		g.add(genCell(g.getInsets(), "Cr 2+"), 0, 10);
		g.add(genCell(g.getInsets(), "Chromium(II) ion"), 1, 10);
		g.add(genCell(g.getInsets(), "Chromous ion"), 2, 10);
		
		g.add(genCell(g.getInsets(), "Cr 3+"), 0, 11);
		g.add(genCell(g.getInsets(), "Chromium(III) ion"), 1, 11);
		g.add(genCell(g.getInsets(), "Chromic"), 2, 11);
		
		g.add(genCell(g.getInsets(), "Mn 2+"), 0, 12);
		g.add(genCell(g.getInsets(), "Manganese(II) ion"), 1, 12);
		g.add(genCell(g.getInsets(), "Manganous ion"), 2, 12);
		
		g.add(genCell(g.getInsets(), "Mn 3+"), 0, 13);
		g.add(genCell(g.getInsets(), "Manganese(III) ion"), 1, 13);
		g.add(genCell(g.getInsets(), "Manganic ion"), 2, 13);
		
		g.add(genCell(g.getInsets(), "Co 2+"), 0, 14);
		g.add(genCell(g.getInsets(), "Cobalt(II) ion"), 1, 14);
		g.add(genCell(g.getInsets(), "Cobaltous ion"), 2, 14);
		
		g.add(genCell(g.getInsets(), "Co 3+"), 0, 15);
		g.add(genCell(g.getInsets(), "Coblat(III) ion"), 1, 15);
		g.add(genCell(g.getInsets(), "Cobaltic ion"), 2, 15);
		
		g.add(genCell(g.getInsets(), "Ag 1+"), 0, 16);
		
		g.add(genCell(g.getInsets(), "Zn 2+"), 0, 17);
		
		g.add(genCell(g.getInsets(), "* diatomic"), 0, 18);

		
		return g;
	}
	
	// ion charge for representative elements
	public static GridPane ionChargesRepElements(){
		GridPane g = new GridPane();
		g.setAlignment(Pos.CENTER);
		g.setGridLinesVisible(true);
		
		//table 1
		ChemUtils.addText(g, "Ionic Charges of representative Elements", 0, 0, TextAlignment.CENTER);
		g.add(genTop(), 0, 1);
		g.add(genBot(), 0, 2);		
		
		return g;
	}

	public static GridPane genTop(){
		GridPane g = new GridPane();
		g.setAlignment(Pos.CENTER);
		g.setPadding(new Insets(1,13,1,12));
		
		g.add(genCell(g.getInsets(), "1A"), 0, 0);
		g.add(genCell(g.getInsets(), "2A"), 1, 0);
		g.add(genCell(g.getInsets(), "3A"), 2, 0);
		g.add(genCell(g.getInsets(), "4A"), 3, 0);
		g.add(genCell(g.getInsets(), "5A"), 4, 0);
		g.add(genCell(g.getInsets(), "6A"), 5, 0);
		g.add(genCell(g.getInsets(), "7A"), 6, 0);
		
		return g;
	}

	public static GridPane genBot(){
		GridPane g = new GridPane();
		g.setAlignment(Pos.CENTER);
		g.setPadding(new Insets(2,5,2,5));
		
		g.add(genCell(g.getInsets(), "H 1+"), 0, 0);
		g.add(genCell(g.getInsets(), "Li 1+"), 0, 1);
		g.add(genCell(g.getInsets(), "Na 1+"), 0, 2);
		g.add(genCell(g.getInsets(), "K 1+"), 0, 3);
		g.add(genCell(g.getInsets(), "Rb 1+"), 0, 4);
		g.add(genCell(g.getInsets(), "Cs 1+"), 0, 5);
		g.add(genCell(g.getInsets(), "Be 2+"), 1, 1);
		g.add(genCell(g.getInsets(), "Mg 2+"), 1, 2);
		g.add(genCell(g.getInsets(), "Ca 2+"), 1, 3);
		g.add(genCell(g.getInsets(), "Sr 2+"), 1, 4);
		g.add(genCell(g.getInsets(), "Ba 2+"), 1, 5);
		g.add(genCell(g.getInsets(), "Al 3+"), 2, 2);
		g.add(genCell(g.getInsets(), "\t"), 3, 2);
		g.add(genCell(g.getInsets(), "N 3-"), 4, 1);
		g.add(genCell(g.getInsets(), "P 3-"), 4, 2);
		g.add(genCell(g.getInsets(), "O 2-"), 5, 1);
		g.add(genCell(g.getInsets(), "S 2-"), 5, 2);
		g.add(genCell(g.getInsets(), "Se 2-"), 5, 3);
		g.add(genCell(g.getInsets(), "H 1-"), 6, 0);
		g.add(genCell(g.getInsets(), "F 1-"), 6, 1);
		g.add(genCell(g.getInsets(), "Cl 1-"), 6, 2);
		g.add(genCell(g.getInsets(), "Br 1-"), 6, 3);
		g.add(genCell(g.getInsets(), "I 1-"), 6, 4);

		
		
		
		
		return g;
	}

	
	public static GridPane genCell(Insets i, String text){
		GridPane g = new GridPane();
		g.setPadding(i);
		
		ChemUtils.addText(g, text, 0, 0, TextAlignment.CENTER);
		return g;
	}
	

	
}
