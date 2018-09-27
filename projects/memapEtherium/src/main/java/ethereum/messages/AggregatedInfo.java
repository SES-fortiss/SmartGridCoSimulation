package ethereum.messages;

import java.util.List;

import akka.basicMessages.AnswerContent;

public class AggregatedInfo implements AnswerContent {
	public List<Consumption> consumptions;
	public List<Production> productions;
}
