import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CompareNumberTest {

  CompareNumber compareNumber;

  @Before
  public void initialise() {
    compareNumber = new CompareNumber();
  }

  @Test
  public void noRightNumber() {
    assertThat(compareNumber.compare("1234", "5678"), is("0A0B"));
  }

  @Test
  public void fourRightNumberButWrongPlace() {
    assertThat(compareNumber.compare("1234", "4321"), is("0A4B"));
  }

  @Test
  public void fourNumberRightPlace() {
    assertThat(compareNumber.compare("1234", "1234"), is("4A0B"));
  }
}
