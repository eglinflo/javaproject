package fxProject.util;

public class Question {

	private int questionNumber;
	private String question;
	private String firstAnswer;
	private String secondAnswer;
	private String thirdAnswer;
	private String fourthAnswer;
	private String correctAnswerString;

	public Question(int questionNumber, String question, String firstAnswer, String secondAnswer, String thirdAnswer,
			String fourthAnswer, String correctAnswerString) {
		
		super();
		this.questionNumber = questionNumber;
		this.question = question;
		this.firstAnswer = firstAnswer;
		this.secondAnswer = secondAnswer;
		this.thirdAnswer = thirdAnswer;
		this.fourthAnswer = fourthAnswer;
		this.correctAnswerString = correctAnswerString;
	}

	@Override
	public String toString() {
		return "Question [questionNumber=" + questionNumber + ", question=" + question + ", firstAnswer=" + firstAnswer
				+ ", secondAnswer=" + secondAnswer + ", thirdAnswer=" + thirdAnswer + ", fourthAnswer=" + fourthAnswer
				+ ", correctAnswerString=" + correctAnswerString + "]";
	}

	public int getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getFirstAnswer() {
		return firstAnswer;
	}

	public void setFirstAnswer(String firstAnswer) {
		this.firstAnswer = firstAnswer;
	}

	public String getSecondAnswer() {
		return secondAnswer;
	}

	public void setSecondAnswer(String secondAnswer) {
		this.secondAnswer = secondAnswer;
	}

	public String getThirdAnswer() {
		return thirdAnswer;
	}

	public void setThirdAnswer(String thirdAnswer) {
		this.thirdAnswer = thirdAnswer;
	}

	public String getFourthAnswer() {
		return fourthAnswer;
	}

	public void setFourthAnswer(String fourthAnswer) {
		this.fourthAnswer = fourthAnswer;
	}

	public String getCorrectAnswer() {
		return correctAnswerString;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswerString = correctAnswer;
	}


	public void setQuestions(String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer) {
		this.firstAnswer = firstAnswer;
		this.secondAnswer = secondAnswer;
		this.thirdAnswer = thirdAnswer;
		this.fourthAnswer = fourthAnswer;
	}
}