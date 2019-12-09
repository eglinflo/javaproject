package makery.address.util;

public class Question {
	
	public static int questionNumber;
	public static String question;
	public static String firstAnswer;
	public static String secondAnswer;
	public static String thirdAnswer;
	public static String fourthAnswer;
	public static String correctAnswer;
	
	public Question(int questionNumber, String question, String firstAnswer, String secondAnswer, String thirdAnswer,
			String fourthAnswer, String correctAnswer) {
		super();
		Question.questionNumber = questionNumber;
		Question.question = question;
		Question.firstAnswer = firstAnswer;
		Question.secondAnswer = secondAnswer;
		Question.thirdAnswer = thirdAnswer;
		Question.fourthAnswer = fourthAnswer;
		Question.correctAnswer = correctAnswer;
	}

	@Override
	public String toString() {
		return "Question [questionNumber=" + questionNumber + ", question=" + question + ", firstAnswer=" + firstAnswer
				+ ", secondAnswer=" + secondAnswer + ", thirdAnswer=" + thirdAnswer + ", fourthAnswer=" + fourthAnswer
				+ ", correctAnswer=" + correctAnswer + "]";
	}

	public int getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(int questionNumber) {
		Question.questionNumber = questionNumber;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		Question.question = question;
	}

	public String getFirstAnswer() {
		return firstAnswer;
	}

	public void setFirstAnswer(String firstAnswer) {
		Question.firstAnswer = firstAnswer;
	}

	public String getSecondAnswer() {
		return secondAnswer;
	}

	public void setSecondAnswer(String secondAnswer) {
		Question.secondAnswer = secondAnswer;
	}

	public String getThirdAnswer() {
		return thirdAnswer;
	}

	public void setThirdAnswer(String thirdAnswer) {
		Question.thirdAnswer = thirdAnswer;
	}

	public String getFourthAnswer() {
		return fourthAnswer;
	}

	public void setFourthAnswer(String fourthAnswer) {
		Question.fourthAnswer = fourthAnswer;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		Question.correctAnswer = correctAnswer;
	}
	
	public void questionSetter(String a, String b, String c, String d) {
		Question.firstAnswer = a;
		Question.secondAnswer = b;
		Question.thirdAnswer = c;
		Question.fourthAnswer = d;
	}
}