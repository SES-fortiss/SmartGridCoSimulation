package ethereum.messages;

import java.math.BigInteger;

import akka.basicMessages.AnswerContent;

public class Production implements AnswerContent {
	public BigInteger amount;
	public BigInteger price;
}
