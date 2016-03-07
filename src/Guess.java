public class Guess {
  public String answer;
  public CompareNumber compareNumber;

  public Guess(AnswerGenerator answerGenerator, CompareNumber compareNumber) {
    this.answer = answerGenerator.generate();
    this.compareNumber = compareNumber;
  }

  public String guess(String input) {
    String answer = this.answer;

    return this.compareNumber.compare(answer, input);
  }
}
