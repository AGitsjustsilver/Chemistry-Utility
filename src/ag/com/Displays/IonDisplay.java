package ag.com.Displays;

import ag.com.main.ChemUtils;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.TextAlignment;


public class IonDisplay {

	public static TilePane displayMono(){
		TilePane g = new TilePane();
		g.setPadding(new Insets(25,5,5,5));
		
		g.getChildren().addAll(ionChargesRepElements(), mettalicIons());
		
		return g;
	}
	
	public static TilePane displayPoly(){
		TilePane t = new TilePane();
		t.setPadding(new Insets(25, 5, 5, 5));
		
		t.getChildren().addAll(polyAtomicIons());
		
		return t;
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

	
	//Common polyatomic ions 
	public static GridPane polyAtomicIons(){
		GridPane g = new GridPane();
		g.setGridLinesVisible(true);
		
		ChemUtils.addText(g, "Common Polyatomic Ions", 0, 0, TextAlignment.CENTER);
		g.add(pTop(), 0, 1);
		g.add(pBot(), 0, 2);
		g.add(genCell(new Insets(1, 20, 1, 0), "The formula for the acetate ion can aslo be writen as CH3CO2 1- or as CH3COO 1-"), 0, 3);
		
		return g;
	}
		public static GridPane pTop(){
			GridPane g = new GridPane();

			//row 0
			g.add(genCell(new Insets(1, 68, 1, 68), "1- charge"), 0, 0);
			g.add(genCell(new Insets(1, 68, 1, 68), "2- charge"), 1, 0);
			g.add(genCell(new Insets(1, 68, 1, 68), "3- charge"), 2, 0);
			g.add(genCell(new Insets(1, 68, 1, 68), "1+ charge"), 3, 0);
	
			g.add(pTop1(), 0, 1);
			g.add(pTop2(), 1, 1);
			g.add(pTop3(), 2, 1);
			g.add(pTop4(), 3, 1);
			
			return g;
		}
			public static GridPane pTop1(){
				GridPane g1 = new GridPane();		
				g1.setPadding(new Insets(1, 20, 1, 20));
				
				//row 1
				g1.add(genCell(g1.getInsets(), "Formula"), 0, 0);
				g1.add(genCell(g1.getInsets(), "Name"), 1, 0);
		                        		
				return g1;
			}
			public static GridPane pTop2(){
				GridPane g1 = new GridPane();		
				g1.setPadding(new Insets(1, 20, 1, 20));
				
				//row 1
				g1.add(genCell(g1.getInsets(), "Formula"), 0, 0);
				g1.add(genCell(g1.getInsets(), "Name"), 1, 0);
				
				return g1;
			}
			public static GridPane pTop3(){
				GridPane g1 = new GridPane();		
				g1.setPadding(new Insets(1, 20, 1, 20));
				
		        
				g1.add(genCell(g1.getInsets(), "Formula"), 0, 0);
				g1.add(genCell(g1.getInsets(), "Name"), 1, 0);
		
				return g1;
			}
			public static GridPane pTop4(){
				GridPane g1 = new GridPane();		
				g1.setPadding(new Insets(1, 20, 1, 20));
				
				
				g1.add(genCell(g1.getInsets(), "Formula"), 0, 0);
				g1.add(genCell(g1.getInsets(), "Name"), 1, 0);
				
				return g1;
			}
			
		public static GridPane pBot(){
			GridPane g = new GridPane();
			
			g.add(pBot1(), 0, 0);
			g.add(pBot2(), 1, 0);
			g.add(pBot3(), 2, 0);
			g.add(pBot4(), 3, 0);
			
			return g;
		}
			public static GridPane pBot1(){
				GridPane g = new GridPane();

				g.setPadding(new Insets(1,3,1,3));
				//formula
				g.add(genCell(g.getInsets(), "H2PO4 1-"), 0, 0);
				g.add(genCell(g.getInsets(), "C2H3O2 1-"), 0, 1);
				g.add(genCell(g.getInsets(), "HSO3 1-"), 0, 2);
				g.add(genCell(g.getInsets(), "HSO4 1-"), 0, 3);
				g.add(genCell(g.getInsets(), "HCO3 1-"), 0, 4);
				g.add(genCell(g.getInsets(), "NO2 1-"), 0, 5);
				g.add(genCell(g.getInsets(), "NO3 1-"), 0, 6);
				g.add(genCell(g.getInsets(), "CN 1-"), 0, 7);
				g.add(genCell(g.getInsets(), "OH 1-"), 0, 8);
				g.add(genCell(g.getInsets(), "MnO4 1-"), 0, 9);
				g.add(genCell(g.getInsets(), "ClO 1-"), 0, 10);
				g.add(genCell(g.getInsets(), "ClO2 1-"), 0, 11);
				g.add(genCell(g.getInsets(), "ClO3 1-"), 0, 12);
				g.add(genCell(g.getInsets(), "ClO4 1-"), 0, 13);
				//name
				g.add(genCell(g.getInsets(), "Dihydrogen phosphate"), 1, 0);
				g.add(genCell(g.getInsets(), "Acetate"), 1, 1);
				g.add(genCell(g.getInsets(), "Hydrogen sulfite\n"
						+ "(bisulfite)"), 1, 2);
				g.add(genCell(g.getInsets(), "Hydrogen sulfate\n"
						+ "(bisulfate)"), 1, 3);
				g.add(genCell(g.getInsets(), "Hydrogen carbonate\n"
						+ "(bicarbonate)"), 1, 4);
				g.add(genCell(g.getInsets(), "Nitrate"), 1, 5);
				g.add(genCell(g.getInsets(), "Nitrite"), 1, 6);
				g.add(genCell(g.getInsets(), "Cyanide"), 1, 7);
				g.add(genCell(g.getInsets(), "Hydroxide"), 1, 8);
				g.add(genCell(g.getInsets(), "Permanganate"), 1, 9);
				g.add(genCell(g.getInsets(), "Hypochlorite"), 1, 10);
				g.add(genCell(g.getInsets(), "Chlorite"), 1, 11);
				g.add(genCell(g.getInsets(), "Chlorate"), 1, 12);
				g.add(genCell(g.getInsets(), "Perchlorate"), 1, 13);
								
				
				return g;
			}
			public static GridPane pBot2(){
				GridPane g = new GridPane();

				g.setPadding(new Insets(1,5,1,5));
				//formula
				g.add(genCell(g.getInsets(), "HPO4 2-"), 0, 0);
				g.add(genCell(g.getInsets(), "C2O4 2-"), 0, 1);
				g.add(genCell(g.getInsets(), "SO3 2-"), 0, 2);
				g.add(genCell(g.getInsets(), "SO4 2-"), 0, 3);
				g.add(genCell(g.getInsets(), "CO3 2-"), 0, 4);
				g.add(genCell(g.getInsets(), "O2 2-"), 0, 5);
				g.add(genCell(g.getInsets(), "CrO4 2-"), 0, 6);
				g.add(genCell(g.getInsets(), "Cr2O7 2-"), 0, 7);
				g.add(genCell(g.getInsets(), "SiO3 2-"), 0, 8);
				//name
				g.add(genCell(g.getInsets(), "Hydrogen phosphate"), 1, 0);
				g.add(genCell(g.getInsets(), "Oxalate"), 1, 1);
				g.add(genCell(g.getInsets(), "Sulfite"), 1, 2);
				g.add(genCell(g.getInsets(), "Sulfate"), 1, 3);
				g.add(genCell(g.getInsets(), "Carbonate"), 1, 4);
				g.add(genCell(g.getInsets(), "Peroxide"), 1, 5);
				g.add(genCell(g.getInsets(), "Chromate"), 1, 6);
				g.add(genCell(g.getInsets(), "Dichromate"), 1, 7);
				g.add(genCell(g.getInsets(), "Silicate"), 1, 8);
				
				
				return g;
			}
			public static GridPane pBot3(){
				GridPane g = new GridPane();
				g.setPadding(new Insets(1, 20, 1, 20));
				
				g.add(genCell(g.getInsets(), "PO4 3-"), 0, 0);
				g.add(genCell(g.getInsets(), "PO3 3-"), 0, 1);
				
				g.add(genCell(g.getInsets(), "Phosphate"), 1, 0);
				g.add(genCell(g.getInsets(), "Phosphite"), 1, 1);
				
				return g;
			}
			public static GridPane pBot4(){
				GridPane g = new GridPane();
				g.setPadding(new Insets(1, 10, 1, 10));
				
				g.add(genCell(g.getInsets(), "NH4 1+"), 0, 0);

				
				g.add(genCell(g.getInsets(), "Ammonium"), 1, 0);

				return g;
			}
			
	public static GridPane genCell(Insets i, String text){
		GridPane g = new GridPane();
		g.setPadding(i);
		
		ChemUtils.addText(g, text, 0, 0, TextAlignment.CENTER);
		return g;
	}
	

	
}
