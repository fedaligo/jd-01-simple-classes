package by.htp.prosteishieClassesANDobjects.zadacha04;

import java.util.Arrays;

public class RSlogic {
	Train count;
	int x=0;
	public void trainCity(RS rs) {
		
		Train[] custs=rs.getTrains();
		String[] cust1=new String[] {custs[0].getCity(),custs[1].getCity(),custs[2].getCity(),custs[3].getCity(),custs[4].getCity()};
		Arrays.sort(cust1);
		for(String s:cust1) {System.out.println(s);
		for(int p=x;p<custs.length;)
			{for (int i=p;i<cust1.length;i++) {
			if(custs[i].getCity()==s) {
			count=custs[i];
			custs[i]=custs[p];
			custs[p]=count;
			
			break;
			}
		}
		break;}
		x++;
		}
		for(int i=0;i<custs.length;i++) {
			 System.out.println("Город:"+custs[i].getCity()+" Номер поезда:"+custs[i].getNumber()+" Время отправления "+custs[i].getTime()[0]+":"+custs[i].getTime()[1]);
		}
		}
}
