package restServiceDB;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;
import org.eclipse.jetty.servlets.CrossOriginFilter;

public class ServerRest {

     public static void main(String[] args) throws Exception {
         ServletHolder sh = new ServletHolder(ServletContainer.class);    
         sh.setInitParameter("com.sun.jersey.config.property.resourceConfigClass", "com.sun.jersey.api.core.PackagesResourceConfig");
         sh.setInitParameter("jersey.config.server.provider.packages", "serverDB.rest");
         sh.setInitOrder(0);
         
         Server server = new Server(9999);

         ServletContextHandler context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
        
         FilterHolder filterHolder = new FilterHolder(CrossOriginFilter.class);
         filterHolder.setInitParameter("allowedOrigins", "*");
         filterHolder.setInitParameter("allowedMethods", "GET, POST");
         context.addFilter(filterHolder, "/*", null);

         context.addServlet(sh, "/*");

         server.start();
         server.join();
      }
}
