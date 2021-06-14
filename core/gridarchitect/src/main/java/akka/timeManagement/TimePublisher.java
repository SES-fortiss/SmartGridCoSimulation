package akka.timeManagement;

/**
 * Specify the methods to make time-related variables in class
 * {@link GlobalTime} available to the interested classes
 */
public interface TimePublisher {
	/** Add the observer to the list of current time step subscribers */
	public void subscribeToCurrentTimeStep(CurrentTimeStepSubscriber subscriber);

	/** Add the observer to the list of current time subscribers */
	public void subscribeToCurrentTime(CurrentTimeSubscriber subscriber);

	/** Notify a change in current time step to its subscribers */
	public void notifyCurrentTimeStepSubscribers();

	/** Notify a change in current time to its subscribers */
	public void notifyCurrentTimeSubscribers();
}
