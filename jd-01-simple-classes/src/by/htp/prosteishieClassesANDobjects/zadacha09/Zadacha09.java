package by.htp.prosteishieClassesANDobjects.zadacha09;

public class Zadacha09 {

	public static void main(String[] args) {
		
		Book[]mass=new Book[10];
		mass[0]=new Book(1,"Java #1","Иванов","Минское",2008,150,210,"мягкий");
		mass[1]=new Book(1,"С #1","Петров","Московское",2009,160,220,"твердый");
		mass[2]=new Book(1,"Piton #1","Сидоров","Питерское",2010,170,230,"мягкий");
		mass[3]=new Book(1,"Роман","Пушкин","Калужское",2003,180,240,"твердый");;
		mass[4]=new Book(1,"Java #2","Иванов","Минское",2009,190,260,"мягкий");
		mass[5]=new Book(1,"С #2","Петров","Московское",2010,200,200,"твердый");
		mass[6]=new Book(1,"Детектив","Лермонтов","Лондонское",2000,210,210,"твердый");
		mass[7]=new Book(1,"Piton #2","Сидоров","Питерское",2011,220,220,"мягкий");
		mass[8]=new Book(1,"С #3","Петров","Московское",2011,230,250,"твердый");
		mass[9]=new Book(1,"Java #3","Иванов","Минское",2010,240,180,"мягкий");
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
