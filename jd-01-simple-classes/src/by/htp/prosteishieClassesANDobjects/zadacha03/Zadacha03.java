package by.htp.prosteishieClassesANDobjects.zadacha03;

//import java.util.Arrays;
//import java.util.List;

public class Zadacha03 {

	public static void main(String[] args) {
		Student [] mass=new Student[5];
		Student b1=new Student("Иванов Иван Иванович",23,new int[] {6,7,8,9,6});
		Student b2=new Student("Сидоров Станислав Александрович",24,new int[] {10,10,10,9,10});
		Student b3=new Student("Петров Пётр Петрович",23,new int[] {6,7,6,5,6});
		Student b4=new Student("Зинкевич Александр Владимирович",22,new int[] {9,9,9,9,9});
		Student b5=new Student("Кандрукевич Евгений Геннадьевич",24,new int[] {7,7,8,7,6});
	//System.out.println(b1.getName());
		mass[0]=b1;
		mass[1]=b2;
		mass[2]=b3;
		mass[3]=b4;
		mass[4]=b5;
		
		
	StudentLogic stLogic=new StudentLogic();
		System.out.println(stLogic.isAStudent(b2));	
		
		GroupLogic grLogic = new GroupLogic(stLogic);
		Group gr1=new Group();
		for(int i=0;i<mass.length;i++)
		{gr1.add(mass[i]);}
		
		grLogic.countofALevelStudents(gr1);
		System.out.println("Количество отличников="+grLogic.countofALevelStudents(gr1));
	//	List<Student> groups = gr1.getStudents();
		//for(Student st : groups) {}
		
		for(int i=0;i<mass.length;i++)
		{stLogic.infoAStudent(mass[i]);}
		
		
		//System.out.println(grLogic.countofALevelStudents(gr1));
		//grLogic.infoAStudent(gr1);
		} 
	

}
