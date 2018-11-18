package level6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PhoneNumberTest {

  @Test
  public void tests() {
    assertEquals(true, PhoneNumber.validPhoneNumber("(123) 456-7890"));
    assertEquals(false, PhoneNumber.validPhoneNumber("(123) 456-7890g"));
    assertEquals(false, PhoneNumber.validPhoneNumber("g(123) 456-7890"));
    assertEquals(false, PhoneNumber.validPhoneNumber("(123) 456-78901"));
    assertEquals(false, PhoneNumber.validPhoneNumber("1(123) 456-7890"));
    assertEquals(false, PhoneNumber.validPhoneNumber("1(123) 456-7890-"));
    assertEquals(false, PhoneNumber.validPhoneNumber("-1(123) 456-7890-"));
    assertEquals(false, PhoneNumber.validPhoneNumber("(123)  456-7890"));
    assertEquals(false, PhoneNumber.validPhoneNumber("(1111)555 2345"));
    assertEquals(false, PhoneNumber.validPhoneNumber("(098) 123 4567"));
  }
}