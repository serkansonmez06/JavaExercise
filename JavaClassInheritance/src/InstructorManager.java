
public class InstructorManager extends UserManager {
	
	public void grade(User student) {
		System.out.println(student.getFirstName()+ " "+student.getLastName() +" <=> You have been graded");
	}
	
	@Override
	public void add(User instructor) {
		System.out.println(instructor.getFirstName() + " " +instructor.getLastName()+" => New Instructor joined the team");
	}

}
