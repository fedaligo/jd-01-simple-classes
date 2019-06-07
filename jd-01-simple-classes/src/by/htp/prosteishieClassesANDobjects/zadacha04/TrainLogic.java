package by.htp.prosteishieClassesANDobjects.zadacha04;



import java.util.Scanner;


public class TrainLogic {
	
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	
	public void infoPN(Train train) {
		while(x>5||x<1) {System.out.println("Поезда с таким номером не существует, введите данные ещё раз");
		x=sc.nextInt();}
		int number=train.getNumber();
		String city=train.getCity();
		int [] time=train.getTime();
		if(number==x) {System.out.println("Поезд едет в "+city+" отправление в "+time[0]+"часов"+time[1]+"минут");}
		
	}
	
}
