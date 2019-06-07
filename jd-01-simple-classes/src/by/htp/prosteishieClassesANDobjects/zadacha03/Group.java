package by.htp.prosteishieClassesANDobjects.zadacha03;

//import java.util.ArrayList;
//import java.util.List;

public class Group {
	//private List<Student> students; 
	Student[] students;
	int count=0;
	public Group(){
		//students=new ArrayList<Student>();
		students=new Student[5];	
		}
	public void add(Student newStudent) {
		//students.add(newStudent);
		students[count]=newStudent;
		count++;
		//for(int i=0;i<students.length;i++) {students[i]=newStudent;}
		}
	//public List<Student> getStudents() 
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
}
