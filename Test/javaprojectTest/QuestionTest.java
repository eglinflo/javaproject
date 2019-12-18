package javaprojectTest;

import org.junit.Before;
import org.junit.Test;

import fxProject.util.Question;
import junit.framework.TestCase;

public class QuestionTest extends TestCase {

	int questionNumber = 1;
	String question = "This is a question";
	String firstAnswer = "This is the first answer";
	String secondAnswer = "This is the second answer";
	String thirdAnswer = "This is the third answer";
	String fourthAnswer = "This is the fourth answer";
	String correctAnswer = "This is the correct answer";
	
	Question q = new Question(questionNumber, question, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer, correctAnswer);

	@Before
	public void setUp() {
	}

	@Test
	public void testKonstruktor() throws Exception {
		assertEquals(questionNumber, q.getQuestionNumber());
		assertEquals(question, q.getQuestion());
		assertEquals(firstAnswer, q.getFirstAnswer());
		assertEquals(secondAnswer, q.getSecondAnswer());
		assertEquals(thirdAnswer, q.getThirdAnswer());
		assertEquals(fourthAnswer, q.getFourthAnswer());
		assertEquals(correctAnswer, q.getCorrectAnswer());		
	}
	
	@Test
	public void testToString() throws Exception {
		String toStringTest	= "Question [questionNumber=" + questionNumber + ", question=" + question + ", firstAnswer=" + firstAnswer
				+ ", secondAnswer=" + secondAnswer + ", thirdAnswer=" + thirdAnswer + ", fourthAnswer=" + fourthAnswer
				+ ", correctAnswerString=" + correctAnswer + "]";
		
		assertEquals(toStringTest, q.toString());
	}

	@Test
	public void testSetter() throws Exception {
		int setterQuestionNumber = 0;
		String setterQuestion = "Is this a question?";
		String setterFirstAnswer = "Is this the first answer?";
		String setterSecondAnswer = "Is this the second answer?";
		String setterThirdAnswer = "Is this the third answer?";
		String setterFourthAnswer = "Is this the fourth answer?";
		String setterCorrectAnswer = "Is this the correct answer?";
		
		q.setQuestionNumber(setterQuestionNumber);
		q.setQuestion(setterQuestion);
		q.setFirstAnswer(setterFirstAnswer);
		q.setSecondAnswer(setterSecondAnswer);
		q.setThirdAnswer(setterThirdAnswer);
		q.setFourthAnswer(setterFourthAnswer);
		q.setCorrectAnswer(setterCorrectAnswer);
		
		assertEquals(setterQuestionNumber, q.getQuestionNumber());
		assertEquals(setterQuestion, q.getQuestion());
		assertEquals(setterFirstAnswer, q.getFirstAnswer());
		assertEquals(setterSecondAnswer, q.getSecondAnswer());
		assertEquals(setterThirdAnswer, q.getThirdAnswer());
		assertEquals(setterFourthAnswer, q.getFourthAnswer());
		assertEquals(setterCorrectAnswer, q.getCorrectAnswer());		
	}
	
	@Test
	public void testQuestionsSetter() throws Exception {
		String questionsFirstAnswer = "Answer 1";
		String questionsSecondAnswer = "Answer 2";
		String questionsThirdAnswer = "Answer 3";
		String questionsFourthAnswer = "Answer 4";
		
		q.setQuestions(questionsFirstAnswer, questionsSecondAnswer, questionsThirdAnswer, questionsFourthAnswer);
		
		assertEquals(questionsFirstAnswer, q.getFirstAnswer());
		assertEquals(questionsSecondAnswer, q.getSecondAnswer());
		assertEquals(questionsThirdAnswer, q.getThirdAnswer());
		assertEquals(questionsFourthAnswer, q.getFourthAnswer());
	}

}
