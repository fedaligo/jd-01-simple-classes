package by.htp.prosteishieClassesANDobjects.zadacha09;

public class Zadacha09 {

	public static void main(String[] args) {
		
		Book[]mass=new Book[10];
		mass[0]=new Book(1,"Java #1","������","�������",2008,150,210,"������");
		mass[1]=new Book(1,"� #1","������","����������",2009,160,220,"�������");
		mass[2]=new Book(1,"Piton #1","�������","���������",2010,170,230,"������");
		mass[3]=new Book(1,"�����","������","���������",2003,180,240,"�������");;
		mass[4]=new Book(1,"Java #2","������","�������",2009,190,260,"������");
		mass[5]=new Book(1,"� #2","������","����������",2010,200,200,"�������");
		mass[6]=new Book(1,"��������","���������","����������",2000,210,210,"�������");
		mass[7]=new Book(1,"Piton #2","�������","���������",2011,220,220,"������");
		mass[8]=new Book(1,"� #3","������","����������",2011,230,250,"�������");
		mass[9]=new Book(1,"Java #3","������","�������",2010,240,180,"������");
		BookLogic bkL=new BookLogic();
		for(int i=0;i<mass.length;i++) {
			bkL.serchAUTOR(mass[i]);
		}
		for(int i=0;i<mass.length;i++) {
			bkL.searchIZD(mass[i]);
		}
		for(int i=0;i<mass.length;i++) {
			bkL.searchYEAR(mass[i]);
		}
		
	}

}
