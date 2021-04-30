
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Instructor instructor = new Instructor(); // instructor Instantiated  
		
		//instructor profile created with setters
		instructor.setId(2829);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("instructor@gmail.xom");
		instructor.setTeachingSchedule("Wednesday, Saturday");
		
	    //instructor profile printed with getters
		int instructorId=instructor.getId();
		String instructorFirstName = instructor.getFirstName();
		String instructorLastName = instructor.getLastName();
		String instructorEmail = instructor.getEmail();
		String instructorSchedule = instructor.getTeachingSchedule();
		
		
		System.out.println("Instructor Id : "+instructorId);
		System.out.println("Instructor First name : "+instructorFirstName);
		System.out.println("Instructor Last name : "+instructorLastName);
		System.out.println("Instructor Email : "+instructorEmail);
		System.out.println("Instructor schedule : "+instructorSchedule);
		
		System.out.println("==============================================");
		
		
		//Student profile created with setters
		Student student = new Student(); //Student Instantiated  
		student.setId(100301);
		student.setFirstName("Serkan");
		student.setLastName("Sonmez");
		student.setEmail("student@gmail.com");
		student.setNameOfClass("Java & React Cohort");
		
		
		//Student profile created with getters
		int studentId = student.getId();
		String studentFirstname = student.getFirstName();
		String studentLastname = student.getLastName();
		String studentEmail = student.getEmail();
		String studentClass = student.getNameOfClass();
		
		System.out.println("Student Id : "+studentId);
		System.out.println("Student First Name : "+studentFirstname);
		System.out.println("Student Last Name : "+studentLastname);
		System.out.println("Student Email : "+studentEmail);
		System.out.println("Student Class : "+studentClass);
		
		System.out.println("==============================================");
		
	
		
		InstructorManager instructorManager = new InstructorManager(); //InstructorManager Instantiated
		instructorManager.grade(student);//instructor graded student by name
		instructorManager.add(instructor);// new instructor added 
		
		StudentManager studentManager = new StudentManager(); //StudentManager Instantiated
		studentManager.rating(); 
		studentManager.updated(student);
		
		System.out.println("==============================================");
		
		
		UserManager userManager = new StudentManager();
		
	    User[] users = {student,instructor};
		userManager.addMultiple(users);
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
