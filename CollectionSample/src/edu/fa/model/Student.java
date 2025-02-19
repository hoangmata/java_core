package edu.fa.model;

public class Student implements Comparable<Student> {

    private String name;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, int grade) {
        super();
        this.name = name;
        this.grade = grade;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return name + " - " + grade;
    }

//	compaeable
    @Override
    public int compareTo(Student o) {
//		return this.name.compareTo(o.getName());
		return Integer.valueOf(this.grade).compareTo(Integer.valueOf(o.getGrade()));
//        return Integer.valueOf(o.getGrade()).compareTo(Integer.valueOf(this.grade));
    }

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (this.name.equals(student.getName()) && this.grade == student.getGrade());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.grade;
	}
    
}
