package by.htp.prosteishieClassesANDobjects.zadacha04;

import by.htp.prosteishieClassesANDobjects.zadacha08.Magaz;
import by.htp.prosteishieClassesANDobjects.zadacha08.MagazLogic;

public class Zadacha04 {

	public static void main(String[] args) {
		Train t1=new Train(3,"Minsk",new int[] {11,30});
		Train t2=new Train(2,"Brest",new int[] {21,20});
		Train t3=new Train(1,"Gomel",new int[] {11,55});
		Train t4=new Train(4,"Minsk",new int[] {15,10});
		Train t5=new Train(5,"Vitebsk",new int[] {01,50});
Train[] tr=new Train[5];
tr[0]=t1;
tr[1]=t2;
tr[2]=t3;
tr[3]=t4;
tr[4]=t5;
	RS rs=new RS();
	for(int i=0;i<tr.length;i++) {
		rs.addTrain(tr[i]);
	}
	
	System.out.println("введите номер поезда");
	TrainLogic trl=new TrainLogic();
	for(int i=0;i<tr.length;i++) {trl.infoPN(tr[i]);}
	
	
	
	RSlogic mg=new RSlogic();
	System.out.println();
	System.out.println("Сортировка пунктов назначения по алфавиту:");
	mg.trainCity(rs);
	}
}
