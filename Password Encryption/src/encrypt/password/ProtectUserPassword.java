package encrypt.password;

public class ProtectUserPassword {

	public static void main(String[] args) {
		String myPass = "achinta23";
		String salt = PasswordUtils.getSalt(30);
		String mySecurePass = PasswordUtils.generateSecurePassword(myPass, salt);
		
		System.out.println("My Secure Password 	: " + mySecurePass);
		System.out.println("My Salt Value 		: " + salt);
	}

}
