# JAVA-Quizmaster

## Inhaltverzeichnis

1. Mitglieder
2. Einleitung, Ziele, Randbedingung
3. Bedinnungsanleitung
4. User stories
5. Taskliste fuer die Umsetzung der Us
6. Release Plan
7. Dokumentation Sprint 1
8. Dokumentation Sprint 2
9. Dokumentation Sprint 3
10. Klassendiagramm
11. Black Box

## Mitglieder

Eglin Florian, Heimlich Matthieu, Pratx Gabin, Suter Dominik


## Introduction, Ziele, Randbedingung:

Das Projekt Quizztrinat und das zugehörige GIT-Repository entstand im Rahmen einer Projektarbeit für den Kurs Software Engineering.
Dieses Projekt wurde mit Java, beziehungsweise Java Fx realisiert.

Ziel:

Unser Ziel während dem Projekt war, die in den Fächer erlernten Kompetenzen in Java und Java Fx anhand des Projekt Quizztrinat umzusetzen. Das unser Studium eine sprachliche Abwechslung bietet, wollten wir auch unser Quizz auf diese Stufe bringen.
Das Ziel war es ein Quizz zu machen, welches unsere Sprachliche Veranlagung fördert und gleichzeitig unsere Vorliebe für das Automobil vorzeigt. Die Besonderheit ist, dass die Fragen austauchbar sind
Unser Anspruch war es auch, dass die richtigen Antworten erscheinen und dass am Schluss eine Zusammenfassung der Resultaten erscheint.

Randbedingung:

Die Programmierung soll in Java beziehungsweise JavaFx erfolgen. Darüber hinaus sollen die klassen internet mit die entsprechenden Unit-Tests verfügen, 





## Bedinnungsanleitung

Sehr geehrter Benutzer,
Wir freuen uns Sie auf unserem Quizz begrüssen zu dürfen.  Die Bedienung ist sehr simpel. 
Als erstes haben Sie die Ehre die Sprache auszuwählen, in welcher Sie gerne das Quizz absolvieren wollen. Dafür klicken Sie ganz einfach auf die Flagge, welche Ihre gewünschte Sprache entspricht.


<img src="https://github.com/eglinflo/javaproject/blob/master/Bild1.PNG" alt="Bild 1" />


Nach dem Aussuchen der Sprache, können mit dem Quizz beginnen. Das Quizz startet automatisch, lesen die Frage gut durch und beantworten Sie diese indem Sie auf die richtige Antwort klicken. Die richtige Antwort wird nach dem aussuchen angezeigt.  Dies erfolgt auch bei einer falschen Antwort, die richtige Antwort wird dann angezeigt.

<img src="https://github.com/eglinflo/javaproject/blob/master/Capture_Question.PNG" alt="Bild 2" />

Nach Beantwortung der Frage öffnet sich das folgende Fenster und die richtige Antwort wird angezeigt. Um weiterzufahren, klicken Sie bitte auf next.

<img src="https://github.com/eglinflo/javaproject/blob/master/Correct_answer.PNG" alt="Bild 3" />

Nach Beendung des Quizz bekommen Sie eine Zusammenfassung Ihrer Ergebnisse.

<img src="https://github.com/eglinflo/javaproject/blob/master/Screen_%20Result.PNG" alt="Bild 4" />

Um das Programm zu beenden gehen Sie auf File und dann auf Exit. Somit schliesst sich das Benutzerfenster und Sie haben Erfolgreich das Programm beendet.

Falls Sie die Fragen auswechseln wollen, können Sie ganz einfach die Fragen in den CSV-Dateien  der gewünschte Sprache  auswechseln.

Wir hoffen Sie hatten viel Spass bei dem Quizz.

Ihr Quizzmaster Team.




## User Stories
US  |SP | Priorität | Akzeptanzkriterium 
----|:---:|:-----------:|-------------------
1  Als Benutzer möchte ich, dass die richtige Antworten in Grün und falschen in rot Markiert werden, somit ich sehe welche Richtig sind| 2 | Mittel | Nach dem die Frage beantwortet ist möchte ich erkennen, ob es falsch oder richtig war
2 Als Benutzer möchte ich, dass ich die Sprache aussuchen kann damit ich je nach Lust probieren kann | 8 | Hoch | Bevor ich das Quizz beginne möchte ich meine sprachliche Vorliebe aussuchen
3  Als Quiz Meister, möchte ich wechselhafte Fragen bekommen damit ich Abwechslung habe | 5 | Mittel | Nach dem Ich das Quizz durch gespielt habe, möchte ich nicht immer die gleichen Frage bekommen
4 Als Benutzer möchte ich am Schluss eine Zusammenfassung bekommen, damit ich mich einschätzen kann | 8 | Hoch | Nach dem man alle Frage beantwortet habe, möchte eine Zusammenfassung bekommen und mein Niveau einzuschätzen.
5 Als Benutzer möchte ich ein Startmenü haben, damit ich empfangen werde | 3 | Niedrig | Das Spiel soll nicht direkt starten, sondern erst wenn der Benutzer bereit ist
6 Als Benutzer möchte ich bei jeder frage die richtige Antwort bekommen, damit ich jeder Zeit weiß was richtig ist | 8 | Hoch | Das Spiel soll bei jeder  Fragen, deren richtige Antwort anzeigen, nach Beantwortung dessen
7  Ich als Benutzer möchte mindestens eine Auswahl aus 30 Fragen haben, damit ich nicht immer die gleichen Fragen habe | 1 | Niedrig | Das Spiel soll mindesten eine Datenbank von 30 Fragen pro Sprache
8 Als Benutzer möchte ich ein gängiges Dokument Datei für die Fragen, z.B CSV, damit ich je nach Lust die Fragen verändern kann | 1 | Mittel | Die Datenbank der Fragen soll für jede Sprache eine CSV-Datei bekommen

## Taskliste für die Umsetzung der User Story

US1: Als Benutzer möchte ich ein gängiges Dokument Datei für die Fragen, z.B CSV, damit ich je nach Lust die Fragen verändern kann
	Task:  CSV Datei einlesen/herstellen
	Task: Klasse zur Generierung der Quizz herstellen

US2:  Ich als Benutzer möchte mindestens eine Auswahl aus 30 Fragen haben, damit ich nicht immer die gleichen Fragen habe
	Task: Methode zur Auswahl von 10 Fragen  aus der Datenbank von 30 Fragen
	Task: Klassen zur Generierung der Frage herstellen
	Task: Randoom  Frage aus der Datenbank aussuchen
	
US3: Als Benutzer möchte ich bei jeder frage die richtige Antwort bekommen, damit ich jeder Zeit weiß was richtig ist
	Task: überprüfen ob die Antwort korrekt ist
	Task: Dem Spieler sagen ob Antwort richtig ist
	Task: Bei jeder Frage die richtige Antwort rausgeben
	Task : Spielfenster herstellen

US4: Als Benutzer möchte ich ein Startmenü haben, damit ich empfangen werde
	Task: Empfang Spielfenster herstellen

US5: Als Benutzer möchte ich am Schluss eine Zusammenfassung bekommen, damit ich mich einschätzen kann
	Task: Ein Fenster Result machen und  die Resultaten machen

US6: Als Benutzer möchte eine Möglichkeit haben um das Spiel zu verlassen, damit ich jederzeit aufhören kann
	Task:  Exit programmieren
	Task : Spielfenster Exit programmieren

US7: Als Benutzer möchte ich, dass ich die Sprache aussuchen kann damit ich je nach Lust probieren kann
	Task: Sprache auswählen
	Task: Bedinnungsfenster für die Sprach Auswahl
	Task: Bilder / Flaggen einfügen

US8: Als Benutzer möchte ich, dass die richtige Antworten in Grün und falschen in rot Markiert werden, somit ich sehe welche Richtig sind
	Task: Spielfenster
	Task: Interaktion mit dem Benutzer programmieren
	Task:  Richtige Antwort in grün und falsche in rot anzeigen lassen


 


## Release plan
Iteration 1  | Iteration 2 | Iteration 3  
-------------|:-----------:|:-----------
US1: CSV Datei | US 2: Fragen auswählen | US3: Richtige Antwort
US7: Sprachauswahl | US4: Startmenü | US5: Zusammenfassung
 0 | 0 | US6: Spiel verlassen
 0 | 0 | US8: Antworten markeiren


## Documentation Sprint 1
 Taskliste der User Stories (mit Schätzung):
	
Task  | Beschreibung | Aufwandschätzung in Minuten 
------|:------------:|:---------------------------
1 | Klasse zur Generierung der Quizz herstellen | 100
2 | CSV Datei einlesen/herstellen + übersetzen | 120
3 | Bilder / Flaggen einfügen | 40
4 | Bedinnungsfenster für die Sprach Auswahl | 40
5 | Sprache auswählen | 60

### Code snipe des sprint 1:
```javascript
public static void generation() {
		try {

			FileReader f = new FileReader(file);
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
```
Erklaerung: Programm Abschnitt zum ablesen der CSV-Datei. Mit dem Konstruktor new Question wird jedes Mal ein Objekt Question generiert der als Attribute: der Nummer des Fragens, die Frage, die vier Antworten und die richtige Antwort hat.
	

## Documentation Sprint 2
 Taskliste der User Stories (mit Schätzung):
	
Task  | Beschreibung | Aufwandschätzung in Minuten 
------|:------------:|:---------------------------
1 | Klassen zur Generierung der Frage herstellen | 110
2 | Methode zur Auswahl von 10 Fragen  aus der Datenbank von 30 Fragen | 90
3 | Randoom  Frage aus der Datenbank aussuchen | 60
4 | Empfang Spielfenster herstellen | 40

### Code snipe des sprint 2:
```javascript
public static void questionGeneration() {
		String tmp = "";

		for (Question q : questions) {
			int random = ((int) (Math.random()*4));
			switch (random) {
			case 0 : break;
			case 1 : tmp = q.getFirstAnswer();			
			q.setQuestions(q.getSecondAnswer(), q.getThirdAnswer(), q.getFourthAnswer(), tmp);
			case 2 : tmp = q.getFirstAnswer();			
			q.setQuestions(q.getThirdAnswer(), q.getFourthAnswer(), tmp, q.getSecondAnswer());
			case 3 : tmp = q.getFirstAnswer();			
			q.setQuestions(q.getFourthAnswer(), tmp, q.getSecondAnswer(), q.getThirdAnswer());
			}

		}
	}
```

Erklaerung: Programm Abschnitt der der Reihenfolge der Antworten ändert, damit die Richtige Antwort nicht immer am selben Platz ist. Die Methode setQuestion ändert dann den Wert der Attribute des Objekts Question.

## Documentation Sprint 3
Taskliste der User Stories (mit Schätzung):

Task  | Beschreibung | Aufwandschätzung in Minuten 
------|:------------:|:---------------------------
1 | überprüfen ob die Antwort korrekt ist | 120
2 | Bei jeder Frage die richtige Antwort rausgeben | 90
3 | Dem Spieler sagen ob Antwort richtig ist | 40
4 | Spielfenster herstellen | 40
5 | Ein Fenster Result machen und  die Resultaten machen | 60
6 | Spielfenster Exit + Try again programmieren | 100
7 | Interaktion mit dem Benutzer programmieren | 120
8 | Richtige Antwort  anzeige lassen | 70

### Code snipe des sprint 3:
```javascript
answerA.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				String result = a.getText()  + "\n";
				if(verification(result, QuizzGeneration.questions.get(n).getCorrectAnswer())) {
					answerA.setStyle("-fx-border-color: #00ff00; -fx-border-width: 2px;");
				}
				else { answerA.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");
				}

				try {
					TimeUnit.SECONDS.sleep(wait);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				CorrectAnswerPane.showCorrectAnswer(primaryStage);

			}
		});

```
Erklaerung: Programm Abschnitt mit den Event Handler von ein Knopf im Quizz. Welcher fuer die Beantwortung der Fragen unersetzlich ist
// JUnit muss hier noch rein


## Klassendiagramm
Nach Beendung der 3 Sprints :

<img src="https://github.com/eglinflo/javaproject/blob/master/Klassendiagramm.PNG" alt="Bild 5" />


## Prüfung des Usersinterfaces (Black Box)

- Gebiet: Prüfung der Sprachauswahl:


Prüfablauf:  
Testen Sie die Sprachauswahl, indem Sie auf die verschiedenen Knoepfe ( die 3 die zu Auswahle stehen) drücken und dabei beobachten, ob sich die Sprache der Fragen geändert hat. Schreiben Sie Ihr Ergebnis in die Bemerkung.



Bemerkung: 
Pruefablauf wurde durchgefuehrt und keine Einschraekung wurde festgestellt. Die Sprach lassen sich aendern


- Gebiet:  Prüfung der Veränderbarkeit der CSV-Dateien:


Prüfablauf:  
Wählen Sie eine der 3 CSV Datei aus, welches Sie auch verändern wollen. Nachdem Sie eins ausgesucht haben, tauschen Sie die Fragen aus. Testen Sie ob es geklappt hat.



Bemerkung:

Pruefablauf wurde durchgefuehrt und keine Beanstandung ist wahrzunehmen. Die csv-Dateien lassen sich veraendern und wurden auch ins Spiel eingespielt. Soweit war alles in Ordnung



- Gebiet: Prüfung von Antworteingabe:


Prüfablauf:  
Testen bei ein paar Fragen, ob bei Eingabe von richtigen Antworten, dies auch als richtig gezählt wird.  Das gleiche gilt auch bei falschen Antworten, geben Sie extra falschen Antworten ein und beobachten Sie, ob dies auch als falsch gegolten wir.



Bemerkung:
Pruefablauf in Ordnung. Die Erkennung von falschen und richtigen Antworten wurde korrekt erkannt und registriert.


- Gebiet:  Spiel verlassen


Prüfablauf: 
Spielen Sie das Spiel zu Ende, bis Sie auf das Result Fenster erreichen. Gehen Sie dann auf den Knopf Exit unten in der Mitte des Spielfeldes. Drücken Sie darauf und beobachten Sie ob sich das Fenster geschlossen hat oder nicht. 


Bemerkung:
der Exit funktionnier ohne Beanstandung, darueber hinaus gibt es sogar ein Try Again knopf welcher auch prima funktioniert .





