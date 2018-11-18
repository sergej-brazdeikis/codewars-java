package level6;

// https://www.codewars.com/kata/525f47c79f2f25a4db000025
public class PhoneNumber {

  public static boolean validPhoneNumber(String phoneNumber) {
    return phoneNumber.matches("^[^\\d\\w]*\\(*\\d{3}\\) \\d{3}-\\d{4}[^\\d\\w]*$");
  }
}
