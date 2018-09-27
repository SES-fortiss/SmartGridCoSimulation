package serverConnection;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class PiHandler extends AbstractHandler {
	
	public static double setPoint = 0;
	public static double pv = 0;
	public static double wind = 0;
	public static double bhkw = 0;
	public static double pvfortiss = 0;
	public static double requestPower = 0;

	public void handle(String target,Request baseRequest,HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("application/json;charset=utf-8");
	    response.setStatus(HttpServletResponse.SC_OK);	     
	    baseRequest.setHandled(true);	    
	    
	    /*String output = "{ \"SetPoint\": " +setPoint+ ", \"PV\": "+pv+
	    		", \"PVFortiss\": "+pvfortiss+", \"Wind\": "+wind+
	    		", \"BHKW\": "+bhkw+", \"RequestPower\": "+requestPower + " }"; 
	    */
	    
	     
	    String output = "{ "+"\"currentValue\": "+setPoint+", \"targetValue\": " +setPoint+ ", \"solar\": "+(pv+pvfortiss)+", \"wind\": "+wind+
	    		", \"biogas\": "+bhkw+" }";
	    
	    response.getWriter().println(output);
	    
	    //System.out.println(output);
	}
}
