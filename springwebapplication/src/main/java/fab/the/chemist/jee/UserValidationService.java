package fab.the.chemist.jee;

public class UserValidationService {

	public boolean isValidUser(String user, String password) {
		
		if(user.equals("Erika") && password.equals("Barre")) {
			return true;
		}
		return false;
		
	}
	
}
