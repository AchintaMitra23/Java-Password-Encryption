package encrypt.password;

public class ValidateUserPassword {

	public static void main(String[] args) {
		String providedPass = "achinta23";
		String securedPass = "0XWLRTcshIQctJhIb/1BgfkN634p9At6p93ZV09XKMc=";
		String salt = "xNpcdqutDpUcFqjIv7uaD9QKKG1UYN";
		
		boolean passwordMatch = PasswordUtils.varifyUserPassword(providedPass, securedPass, salt);
		if (passwordMatch)		System.out.println("Password matches successfully...");
		else 					System.out.println("Password doesnot match...");
	}

}
