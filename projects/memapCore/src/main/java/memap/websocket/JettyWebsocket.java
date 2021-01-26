package memap.websocket;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

/**
 * 
 * JettyWebsocket class. Initiates and starts the websocket. 
 * 
 * @author freiesleben
 * 
 */

public abstract class JettyWebsocket
{

	
    public static void main(String[] args)
    {	
    	
    	//Initialize new Server and add a context
        Server server = new Server(8013);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
    	
        
        // Add REST_INTERFACE
        ServletHolder jerseyServlet = new ServletHolder(ServletContainer.class);
        jerseyServlet.setInitOrder(0);
        // Tells the Jersey Servlet which REST service/class to load.
        jerseyServlet.setInitParameter("jersey.config.server.provider.classnames", EntryPoint.class.getCanonicalName());
        context.addServlet(jerseyServlet, "/*");
        
        server.setHandler(context);

        try
        {
        	//Start and Join the Server
            server.start();
            server.join();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Failed to start the server!");
        }
    }
}
