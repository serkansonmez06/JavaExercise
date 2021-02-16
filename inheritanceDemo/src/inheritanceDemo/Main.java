package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
	BaseCreditManager[] baseCreditManager = new BaseCreditManager[] {new AgricultureCreditManager(), new TeacherCreditManager(), new CredirUI()};
	
	
	for (BaseCreditManager  d: baseCreditManager ) {
	
		System.out.println(	d.logger(5));
	}


	}

}
