package akka.timeManagement;

import java.time.LocalDateTime;

public interface CurrentTimeSubscriber {
	public void update(LocalDateTime currentTime);
}
