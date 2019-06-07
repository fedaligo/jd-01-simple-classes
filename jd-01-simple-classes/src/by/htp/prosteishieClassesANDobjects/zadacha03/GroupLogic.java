package by.htp.prosteishieClassesANDobjects.zadacha03;

//import java.util.List;

public class GroupLogic {
private StudentLogic stLogic;


public GroupLogic(StudentLogic stLogic) 
{this.stLogic=stLogic;
}

public int countofALevelStudents(Group group) {
	int count=0;
	//List<Student> students=group.getStudents();
	Student[] students=group.getStudents();
	//for(Student st : students) 
	for(int i=0;i<students.length;i++){
		
		//if(stLogic.isAStudent(st)) 
			if(stLogic.isAStudent(students[i])) {
		count++;}
	}
	return count;}
	
	  public int infoAStudent(Group group) { 
		  int count=0;
		//List<Student> students=group.getStudents();
		Student[] students=group.getStudents();
		
		//for(Student st : students) 
		for(int i=0;i<students.length;i++){
			
			//if(stLogic.isAStudent(st)) 
				if(stLogic.isAStudent(students[i])) {
						count++;}
		}
		//return count;
		return count;}
	 
}
