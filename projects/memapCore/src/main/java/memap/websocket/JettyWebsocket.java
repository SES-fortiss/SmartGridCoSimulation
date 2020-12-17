package memap.websocket;

import java.net.URL;
import java.util.Objects;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
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
    	
    	// Create JAX-RS application.
//        final ResourceConfig application = new ResourceConfig()
//                .packages("jersey.jetty.embedded")
//                .register(JacksonFeature.class);
    	

    	
        
        // Add REST_INTERFACE
        ServletHolder jerseyServlet = new ServletHolder(ServletContainer.class);
        jerseyServlet.setInitOrder(0);
        // Tells the Jersey Servlet which REST service/class to load.
        jerseyServlet.setInitParameter("jersey.config.server.provider.classnames", EntryPoint.class.getCanonicalName());

        
        
      //Initialize new Server and add a context
        Server server = new Server(8013);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
//      context.setContextPath("/");
        context.addServlet(jerseyServlet, "/*");
        

/*
        // Add websocket servlet Echo
        ServletHolder wsHolder = new ServletHolder("echo",new EchoSocketServlet());
        context.addServlet(wsHolder,"/echo");
        
        // Add default servlet (to serve the html/css/js)
        
        System.out.println(Thread.currentThread().getContextClassLoader().getResource("."));
        
        URL urlStatics = Thread.currentThread().getContextClassLoader().getResource("resources/webpage/indexH.html");
        Objects.requireNonNull(urlStatics,"Unable to find index.html in classpath");
        String urlBase = urlStatics.toExternalForm().replaceFirst("/[^/]*$","/");
        ServletHolder defHolder = new ServletHolder("default",new DefaultServlet());
        defHolder.setInitParameter("resourceBase",urlBase);
        defHolder.setInitParameter("dirAllowed","true");
        context.addServlet(defHolder,"/");
*/
        
        
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
