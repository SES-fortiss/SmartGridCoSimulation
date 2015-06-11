/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package testVerbindung;
 
import java.util.Observable;
import java.util.Observer;
 
import org.eclipse.scada.core.ConnectionInformation;
import org.eclipse.scada.core.client.AutoReconnectController;
import org.eclipse.scada.core.client.ConnectionFactory;
import org.eclipse.scada.core.client.ConnectionState;
import org.eclipse.scada.core.client.ConnectionStateListener;
import org.eclipse.scada.da.client.Connection;
import org.eclipse.scada.da.client.DataItem;
import org.eclipse.scada.da.client.DataItemValue;
import org.eclipse.scada.da.client.ItemManagerImpl;
 
public class EclipseSCADAClient {
 
  public static void main(String[] args) throws InterruptedException {
    // the ConnectionFactory works a bit like JDBC,
    // every implementation registers itself when its loaded
    // alternatively it is also possible to use the connection
    // directly, but that would mean the code would have to be aware
    // which protocol is used, which is not desirable
	  
    try {
      Class.forName("org.eclipse.scada.da.client.ngp.ConnectionImpl");
    } catch (ClassNotFoundException e) {
      System.err.println(e.getMessage());
      System.exit(1);
    }
 
    final String uri = "da:ngp://admin:admin12@scada.eclipse.org:2101";
 
    final ConnectionInformation ci = ConnectionInformation.fromURI(uri);
 
    final Connection connection = (Connection) ConnectionFactory.create(ci);
    if (connection == null) {
      System.err.println("Unable to find a connection driver for specified URI");
      System.exit(1);
    }
 
    // just print the current connection state
    connection.addConnectionStateListener(new ConnectionStateListener() {
      @Override
      public void stateChange(org.eclipse.scada.core.client.Connection connection, ConnectionState state, Throwable error) {
        System.out.println("Connection state is now: " + state);
      }
    });
 
    // although it is possible to use the plain connection, the
    // AutoReconnectController automatically connects to the server
    // again if the connection is lost
    final AutoReconnectController controller = new AutoReconnectController(connection);
    controller.connect();
 
    // although it is possible to subscribe to an item directly,
    // the recommended way is to use the ItemManager, which handles the
    // subscriptions automatically
    final ItemManagerImpl itemManager = new ItemManagerImpl(connection);
 
    final DataItem dataItem = new DataItem("ES.DEMO.ARDUINO001.LIGHT.V", itemManager);
    dataItem.addObserver(new Observer() {
      @Override
      public void update(final Observable observable, final Object update) {
        final DataItemValue div = (DataItemValue) update;
        System.out.println("IBH: " + div.getValue().asDouble(null));
      }
    });
    
    final String uri2 = "da:ngp://admin:admin12@scada.eclipse.org:2101";
    
    final ConnectionInformation ci2 = ConnectionInformation.fromURI(uri2);
 
    final Connection connection2 = (Connection) ConnectionFactory.create(ci2);
    if (connection2 == null) {
      System.err.println("Unable to find a connection driver for specified URI");
      System.exit(1);
    }
 
    // just print the current connection state
    connection2.addConnectionStateListener(new ConnectionStateListener() {
      @Override
      public void stateChange(org.eclipse.scada.core.client.Connection connection2, ConnectionState state, Throwable error) {
        System.out.println("Connection state is now: " + state);
      }
    });
 
    // although it is possible to use the plain connection, the
    // AutoReconnectController automatically connects to the server
    // again if the connection is lost
    final AutoReconnectController controller2 = new AutoReconnectController(connection2);
    controller2.connect();
 
    // although it is possible to subscribe to an item directly,
    // the recommended way is to use the ItemManager, which handles the
    // subscriptions automatically
    final ItemManagerImpl itemManager2 = new ItemManagerImpl(connection2);
 
    final DataItem dataItem2 = new DataItem("ES.DEMO.FORTISS.PV.DC.V", itemManager2);
    dataItem2.addObserver(new Observer() {
      @Override
      public void update(final Observable observable, final Object update) {
        final DataItemValue div = (DataItemValue) update;
        System.out.println("FORTISS: " + div.getValue().asDouble(null));
      }
    });
    
  }
}