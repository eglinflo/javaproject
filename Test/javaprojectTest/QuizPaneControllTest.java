package javaprojectTest;

import org.junit.Test;

import fxProject.view.QuizPaneControll;
import junit.framework.TestCase;

public class QuizPaneControllTest extends TestCase {

	boolean statusTest;
	String resultTest;
	String correctAnswerTest;	



	@Test
	public void test() {
		resultTest = "black";
		correctAnswerTest = "black";
		assertTrue(QuizPaneControll.verification(resultTest, correctAnswerTest));
		resultTest = "white";
		correctAnswerTest = "black";
		assertFalse(QuizPaneControll.verification(resultTest, correctAnswerTest));
	}

}
