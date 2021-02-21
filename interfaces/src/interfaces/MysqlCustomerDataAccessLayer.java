package interfaces;

public class MysqlCustomerDataAccessLayer  implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Mysql has been added");
		
	}

}
