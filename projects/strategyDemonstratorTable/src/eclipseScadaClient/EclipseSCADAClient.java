package eclipseScadaClient;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.eclipse.scada.core.ConnectionInformation;
import org.eclipse.scada.core.Variant;
import org.eclipse.scada.core.client.AutoReconnectController;
import org.eclipse.scada.core.client.ConnectionFactory;
import org.eclipse.scada.core.client.ConnectionState;
import org.eclipse.scada.core.client.ConnectionStateListener;
import org.eclipse.scada.da.client.Connection;
import org.eclipse.scada.da.client.DataItem;
import org.eclipse.scada.da.client.DataItemValue;
import org.eclipse.scada.da.client.ItemManagerImpl;
import org.eclipse.scada.da.core.WriteResult;
import org.eclipse.scada.utils.concurrent.NamedThreadFactory;
import org.eclipse.scada.utils.concurrent.NotifyFuture;

import steuerung.Raspberry;

public class EclipseSCADAClient {

	Raspberry rasp;

	private ExecutorService executorService = null;

	private Connection connectionFortiss;
	private Connection connectionFW5;
	private Connection connectionSolarSensor;

	private AutoReconnectController reconnectControllerFortiss;
	private AutoReconnectController reconnectControllerFW5;
	private AutoReconnectController reconnectControllerSolarSensor;

	String ipFortiss = "scada.eclipse.org";
	String diFortiss = "ES.DEMO.FORTISS.PV.DC.V";

	String ipFW5 = "192.168.1.11";
	String diFW5 = "DE.FW5.POWERSETPOINT.S";

	String ipSolar = "192.168.1.33";
	String diSolarSensor = "DE.PV.ACTIVEPOWER.V";
	final double SENSORSCALE = 0.1;
	
	boolean test = false;

	int lastValueToFw5 = 0;
	long lastTimeToFw5 = 0;

	public void setRaspberry(Raspberry r) {
		this.rasp = r;
	}

	public void start() {
		
		if (test){
			ipSolar = "scada.eclipse.org";
			diSolarSensor = "ES.DEMO.ARDUINO001.LIGHT.V";
		}
		

		try {
			Class.forName("org.eclipse.scada.da.client.ngp.ConnectionImpl");
		} catch (ClassNotFoundException e) {
			//System.err.println(e.getMessage());
			//System.exit(1);
		}

		executorService =
				Executors
						.newSingleThreadScheduledExecutor(new NamedThreadFactory(
								"our Eclipse SCADA thread"));

		executorService.submit(new Runnable() {
			@Override
			public void run() {
				createConnectionToSolarSensor();
				createConnectionToFP5();
				createConnectionToFortissSolar();
			}
		});
	}

	private void createConnectionToFortissSolar() {
		final String uriFortissSolar =
				"da:ngp://admin:admin12@" + ipFortiss + ":2101";

		final ConnectionInformation ciFortissSolar =
				ConnectionInformation.fromURI(uriFortissSolar);

		connectionFortiss =
				(Connection) ConnectionFactory.create(ciFortissSolar);
		if (connectionFortiss == null) {
			System.err
					.println("Unable to find a connection driver for specified URI");
			System.exit(1);
		}

		connectionFortiss
				.addConnectionStateListener(new ConnectionStateListener() {
					@Override
					public void stateChange(
							org.eclipse.scada.core.client.Connection connectionFortissSolar,
							ConnectionState state, Throwable error) {
						
					System.out
						.println("Connection state Fortiss is now: "
								+ state);
					}
				});

		reconnectControllerFortiss =
				new AutoReconnectController(connectionFortiss);
		reconnectControllerFortiss.connect();

		final ItemManagerImpl itemManagerFortiss =
				new ItemManagerImpl(connectionFortiss);

		final DataItem dataItemFortiss =
				new DataItem(diFortiss, itemManagerFortiss);
		
		dataItemFortiss.addObserver(new Observer() {
			@Override
			public void update(final Observable observable, final Object update) {
				final DataItemValue div = (DataItemValue) update;
				int solarFortiss = div.getValue().asDouble(0.0).intValue();
				System.out.println("FORTISS: " + div.getValue().asDouble(null));
				System.out.println("Fortiss: " + div.getTimestamp().getTime());
				rasp.setistFutureSolarFortiss(solarFortiss);
			}
		});
	}

	private void createConnectionToFP5() {
		final String uriFP5 = "da:ngp://admin:admin12@" + ipFW5 + ":2101";

		final ConnectionInformation ciFP5 =
				ConnectionInformation.fromURI(uriFP5);

		connectionFW5 = (Connection) ConnectionFactory.create(ciFP5);
		if (connectionFW5 == null) {
			System.err
					.println("Unable to find a connection driver for specified URI");
			System.exit(1);
		}

		connectionFW5.addConnectionStateListener(new ConnectionStateListener() {
			@Override
			public void stateChange(
					org.eclipse.scada.core.client.Connection connection2,
					ConnectionState state, Throwable error) {
				System.out.println("Connection state FP5 is now: " + state);
			}
		});

		reconnectControllerFW5 = new AutoReconnectController(connectionFW5);
		reconnectControllerFW5.connect();

		final ItemManagerImpl itemManagerFP5 =
				new ItemManagerImpl(connectionFW5);

		final DataItem dataItemFP5 = new DataItem(diFW5, itemManagerFP5);
		dataItemFP5.addObserver(new Observer() {
			@Override
			public void update(final Observable observable, final Object update) {
				final DataItemValue div = (DataItemValue) update;
				System.out.println("FW5: " + div.getValue().asDouble(null));
			}
		});

	}

	private void createConnectionToSolarSensor() {
		final String uriSolarSensor =
				"da:ngp://admin:admin12@" + ipSolar + ":2101";

		final ConnectionInformation ciSolarSensor =
				ConnectionInformation.fromURI(uriSolarSensor);

		connectionSolarSensor =
				(Connection) ConnectionFactory.create(ciSolarSensor);
		if (connectionSolarSensor == null) {
			System.err
					.println("Unable to find a connection driver for specified URI");
			System.exit(1);
		}

		// just print the current connection state
		connectionSolarSensor
				.addConnectionStateListener(new ConnectionStateListener() {
					@Override
					public void stateChange(
							org.eclipse.scada.core.client.Connection connection,
							ConnectionState state, Throwable error) {
						System.out
								.println("Connection state SolarSensor is now: "
										+ state);
						
						// rasp.setistFutureSolar((int) (rasp.maxSolar * Math.random()));
					}
				});

		
		reconnectControllerSolarSensor =
				new AutoReconnectController(connectionSolarSensor);
		reconnectControllerSolarSensor.connect();

		final ItemManagerImpl itemManager =
				new ItemManagerImpl(connectionSolarSensor);

		final DataItem dataItem = new DataItem(diSolarSensor, itemManager);
		dataItem.addObserver(new Observer() {
			@Override
			public void update(final Observable observable, final Object update) {
				final DataItemValue div = (DataItemValue) update;

				double solarSensor = div.getValue().asDouble(0.0);
				solarSensor = solarSensor * SENSORSCALE;
				rasp.setistFutureSolar( (int) solarSensor);
				System.out.println("IBH SOLAR: "
						+ div.getValue().asDouble(null));
			}
		});

	}

	public void dispose() {
		System.out.println("dispose is called");
		if (executorService == null) {
			return;
		}
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println("disposing connections");
				try {
					if (reconnectControllerSolarSensor != null) {

						reconnectControllerSolarSensor.disconnect();
						reconnectControllerSolarSensor.dispose();
					}
					if (connectionSolarSensor != null) {
						connectionSolarSensor.disconnect();
						connectionSolarSensor.dispose();
					}

					if (reconnectControllerFortiss != null) {
						reconnectControllerFortiss.disconnect();
						reconnectControllerFortiss.dispose();
					}

					if (connectionFortiss != null) {
						connectionFortiss.disconnect();
						connectionFortiss.dispose();
					}

					if (reconnectControllerFW5 != null) {
						reconnectControllerFW5.disconnect();
						reconnectControllerFW5.dispose();
					}

					if (connectionFW5 != null) {

						connectionFW5.disconnect();
						connectionFW5.dispose();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		System.out.println("shutdown executor");
		executorService.shutdown();
		executorService = null;
	}

	public void setFW5(final int istBiogas) {
		if (istBiogas != lastValueToFw5
				|| System.currentTimeMillis() - lastTimeToFw5 > 1000 * 10) {

			lastTimeToFw5 = System.currentTimeMillis();
			lastValueToFw5 = istBiogas;

			if (executorService != null) {
				executorService.submit(new Runnable() {
					@Override
					public void run() {
						// System.out.println("write gets executed");
						NotifyFuture<WriteResult> future =
								connectionFW5.startWrite(diFW5,
										Variant.valueOf(istBiogas), null, null);
						try {
							future.get(10, TimeUnit.SECONDS);
						} catch (InterruptedException | ExecutionException
								| TimeoutException e) {
							// e.printStackTrace();
						}
					}
				});
			}
		}
	}
}