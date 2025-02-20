package edu.fa;

import java.util.ArrayList;
import java.util.List;

import edu.fa.model.Student;
import edu.fa.model.Teacher;

public class Management {
//	generic method
	public <T> void manage(List<T> list, T t) {
		if(list == null) {
			return;
		}
		list.add(t);
		System.out.println(list);
	}
//	
//	public void manage(List<Teacher> studentList, Teacher student) {
//		if(studentList == null) {
//			return;
//		}
//		studentList.add(student);
//		System.out.println(studentList);
//	}
	
	
	public static void main(String[] args) {
		Management management = new Management();
		List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Hoang", 13));
        studentList.add(new Student("Mata", 6));
        studentList.add(new Student("Deft", 21));
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Hoang"));
        teacherList.add(new Teacher("Mata"));
        teacherList.add(new Teacher("Deft"));
        management.manage(teacherList, new Teacher("sudo"));
	}

}
