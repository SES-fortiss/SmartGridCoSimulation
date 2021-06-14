package fortiss.simulation.helper;

import java.io.IOException;
import java.io.OutputStream;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import fortiss.gui.LogPanel;

public class LogOutputStream extends OutputStream {

	LogPanel lp;
	Logger log;
	Level level;
    private StringBuffer msg;
    
    public LogOutputStream(LogPanel lp, Logger log) {
        this.lp = lp;
        this.log = log;
        this.level = log.getLevel();
        msg = new StringBuffer();
    }
    
	@Override
	public void write(int b) throws IOException {
		if ( (char) b == '\n' ) {
            flush();
            return;
        }
        msg = msg.append( (char) b );
	}

	//@Override
   /* public void flush() {
		if(level.equals(Level.ERROR)) {
			lp.writeError(msg.toString());
		} else if(level.equals(Level.WARN)) {
			lp.writeWarning(msg.toString());
		} else {
			lp.writeInfo(msg.toString());
		}
		
        msg = new StringBuffer();
    }*/
}
