package makery.address.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class QuizzGeneration {

	static Vector<Question> questions = new Vector<Question>();
	static int count=0;
	static String file;

	public static void generation() {
		try {

			file = "questionFrench"; //les autres fichiers sont nommés "questionEnglish" et "questionGerman".
			FileReader f = new FileReader(file);
			System.out.println("File " + file + " was successfully opened.");
			char [] c = new char[1000000];
			f.read(c);
			String s = new String(c);
			String[] result = s.split(";|\n");

			for (int i = 0; i < result.length-1; i=i+7) {
				questions.add(new Question(Integer.parseInt(result[i]), result[i+1], result[i+2], result[i+3], result[i+4], result[i+5], result[i+6]));
				count++;
			}

			f.close();
		}
		catch (IOException e) {
			System.err.println("Failure to read the file " + file + ".");
			System.err.println(e.getMessage());
		}
		
		System.out.println(count + " Entries created.\n");
		
		questionSelection();
		System.out.println(count + " Entries selected.\n");
		
		debug();

	}

	public static void debug() {
		for (Question q : questions) {
			System.out.println(q.toString());
		}
	}
	
	public static void questionSelection() {
		
		do {
					int q = (int) (Math.random()*count);
					questions.remove(q);
					count--;
				
			System.out.println(count);
		}
		while (count>10);
	}

}
