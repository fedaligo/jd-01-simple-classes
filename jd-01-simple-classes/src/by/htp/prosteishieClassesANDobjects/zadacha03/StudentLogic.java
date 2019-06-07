package by.htp.prosteishieClassesANDobjects.zadacha03;

public class StudentLogic {
	public boolean isAStudent(Student student)
	{int[] marks;
	marks=student.getMarks();
	//for(int mark : marks) 
	for(int i=0;i<marks.length;i++){
		//if(mark<9) 
		if(marks[i]<9){
			return false;
		}
	}
return true;
	}
	public void infoAStudent(Student student) {
		int x=0;
		String name=student.getName();
		int age=student.getAge();
		int[] marks;
		marks=student.getMarks();
		//for(int mark : marks) 
		for(int i=0;i<marks.length;i++){
			//if(mark<9) 
			if(marks[i]>=9){x=x+1;
			if(x==5)
			System.out.println("Отличник: " + name +", возраст=" + age );
			
			}
		}
		//return count;
		x=0;
	}
}
