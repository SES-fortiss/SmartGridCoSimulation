package akka.timeManagement;

public interface CurrentTimeStepSubscriber {

	public void update(int currentTimeStep);
}
