package com.vinti.inheritance;

class University{
	
	String courses;
	int noOfCourses;
	int noOfStudents;
	int noOfFaculties;
	int noOfDepartments;
	
	void campusArea() {
		System.out.println("Campus Area 1500 * 1200");
	}
	
	void facultyDetails(String name) {
		System.out.println("Faculty name is = " + name);
	}
}

class MAIT extends University{
	
	int additionalCourses;
	
	void summerTraining() {
		System.out.println("Summer Training on Java");
	}
}

class BPIT extends University{
	
	int additionalCourses;
	//int noOfDepartments;
	
	void summerTraining() {
		System.out.println("Summer Training on Android");
	}
	
}

public class Inheritance2 {

	public static void main(String[] args) {
		
		MAIT mait = new MAIT();
		mait.additionalCourses = 10;
		mait.noOfFaculties = 50;
		System.out.println("Courses = " +mait.additionalCourses);
		System.out.println("Faculties = " + mait.noOfFaculties); 
	
		mait.summerTraining();
		mait.campusArea();

		BPIT bpit = new BPIT();
		bpit.additionalCourses = 15;
		bpit.noOfFaculties = 60;
		System.out.println("Courses = " +bpit.additionalCourses);
		System.out.println("Faculties = " + bpit.noOfFaculties); 
	
		bpit.summerTraining();
		bpit.campusArea();
		// 888
		//bpit.noOfDepartments = 15;
		// 111
		University univ = new University();
		
		System.out.println("College Dept = " +bpit.noOfDepartments);
		//System.out.println("Univ Dept = " +univ.noOfDepartments);
	}
}