package by.htp.prosteishieClassesANDobjects.zadacha08;

import java.util.Arrays;
public class MagazLogic {
	
	public void customersFIO(Magaz magaz) {
		Customer[] custs=magaz.getAllCS();
		String[] cust1=new String[] {custs[0].getFio(),custs[1].getFio(),custs[2].getFio(),custs[3].getFio(),custs[4].getFio()};
		Arrays.sort(cust1);
		for(String s:cust1) {System.out.println(s);}
		
		}
		
		
}
