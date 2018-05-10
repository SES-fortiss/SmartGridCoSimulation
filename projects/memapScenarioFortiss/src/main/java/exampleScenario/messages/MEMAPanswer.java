package exampleScenario.messages;

import java.time.LocalDateTime;
import akka.basicMessages.AnswerContent;

public class MEMAPanswer implements AnswerContent{
	public int counter;
	public LocalDateTime currentTime;
}
