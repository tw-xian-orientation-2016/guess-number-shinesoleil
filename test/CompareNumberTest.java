import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CompareNumberTest {
  CompareNumber cn;

  @Before
  public void initialise() {
    cn = new CompareNumber();
  }

  @Test
  public void noRightNumber() {
    assertThat(cn.compare("1234", "5678"), is("0A0B"));
  }

  @Test
  public void fourRightNumberButWrongPlace() {

    assertThat(cn.compare("1234", "4321"), is("0A4B"));
  }

  @Test
  public void fourNumberRightPlace() {

    assertThat(cn.compare("1234", "1234"), is("4A0B"));
  }
}
