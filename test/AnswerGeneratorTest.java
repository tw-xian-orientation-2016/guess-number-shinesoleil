import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

public class AnswerGeneratorTest {
  @Test
  public void returnFourDigitNumber() {
    Random random = mock(Random.class);
    when(random.nextInt(10)).thenReturn(1, 2, 3, 4);

    AnswerGenerator answerGenerator = new AnswerGenerator(random);

    assertThat(answerGenerator.generate(), is("1234"));
  }

  @Test
  public void returnNonRepeatNumber() {
    Random random = mock(Random.class);
    when(random.nextInt(10)).thenReturn(1, 2, 2, 3, 3, 4);

    AnswerGenerator answerGenerator = new AnswerGenerator(random);

    assertThat(answerGenerator.generate(), is("1234"));
  }
}
