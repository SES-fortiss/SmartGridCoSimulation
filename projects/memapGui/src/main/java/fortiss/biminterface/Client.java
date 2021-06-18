package fortiss.biminterface;

import java.util.Map.Entry;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.LinkedTreeMap;

import fortiss.biminterface.response.BimLogin;
import fortiss.biminterface.serialization.BimControllableTypeAdapter;
import fortiss.biminterface.serialization.BimDemandTypeAdapter;
import fortiss.biminterface.serialization.BimStorageTypeAdapter;
import fortiss.components.Controllable;
import fortiss.components.Demand;
import fortiss.components.Storage;
import fortiss.gui.DesignerPanel;
import fortiss.gui.commands.ResetCommand;
import fortiss.simulation.PlanningTool;
import fortiss.simulation.helper.Logger;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

	private Retrofit retrofit;
	private BimServiceApi bimService;
	private BimSession bimSession;

	public Client() {
		bimSession = BimSession.getInstance();

		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(Demand.class, new BimDemandTypeAdapter());
		gsonBuilder.registerTypeAdapter(Storage.class, new BimStorageTypeAdapter());
		gsonBuilder.registerTypeAdapter(Controllable.class, new BimControllableTypeAdapter());
		Gson gson = gsonBuilder.create();

		retrofit = new Retrofit.Builder().baseUrl(bimSession.getHost())
				.addConverterFactory(GsonConverterFactory.create(gson)).build();
		bimService = retrofit.create(BimServiceApi.class);
	}

	/**
	 * Authenticates a user against the BIM platform and starts a session
	 * @param userCredential a user login information
	 */
	public void login(UserCredential userCredential) {
		new ResetCommand().execute();

		final Call<BimLogin> call = bimService.authorize(userCredential);
		call.enqueue(new Callback<BimLogin>() {

			@Override
			public void onResponse(Call<BimLogin> call, Response<BimLogin> response) {
				BimSession bimSession = BimSession.getInstance();
				if (response.body() != null) {
					bimSession.setAccessToken(response.body().getAccessToken());
					bimSession.setStatus(ConnectionStatus.OPEN);
					DesignerPanel.showInformationPanel("remoteConnection2");
				} else {
					JOptionPane.showMessageDialog(PlanningTool.getInstance().getMainContentPane(),
							"Invalid user or password!");
				}
			}

			@Override
			public void onFailure(Call<BimLogin> call, Throwable t) {
				Logger.getInstance().writeError("Invalid BIM request: Login");
			}
		});
	}

	/**
	 * Loads the MEMAP topology in BIM
	 */
	public void loadTopology() {
		final Call<LinkedTreeMap<String, String>> call = bimService.getComponentList(bimSession.getAccessToken(),
				bimSession.getContentType(), bimSession.getTeam(), bimSession.getProjectId(),
				bimSession.getComponentTypeID(), true);
		call.enqueue(new Callback<LinkedTreeMap<String, String>>() {

			@Override
			public void onResponse(Call<LinkedTreeMap<String, String>> call,
					Response<LinkedTreeMap<String, String>> response) {
				if (response.body() != null) {
					LinkedTreeMap<String, String> componentList = response.body();
					for (Entry<String, String> item : componentList.entrySet()) {
						parseComponent(item.getKey(), item.getValue());
					}
				}
			}

			@Override
			public void onFailure(Call<LinkedTreeMap<String, String>> call, Throwable t) {
				Logger.getInstance().writeError("Invalid BIM request: Component list");
			}
		});
	}

	/**
	 * Identifies the type of component and delegates its parsing
	 * @param componentId
	 * @param componentType
	 */
	private void parseComponent(String componentId, String componentType) {
		switch (componentType) {
		case "Demand":
			parseDemand(componentId);
			break;
		case "Storage":
			parseStorage(componentId);
			break;
		case "Controllable production":
			parseControllable(componentId);
			break;
		default:
			Logger.getInstance().writeInfo("Unknown component type");
			break;
		}
		// Note: VolatileProduction and Coupler are not included yet because they are not in the model.
	}

	private void parseDemand(String componentId) {
		final Call<Demand> call = bimService.getDemand(bimSession.getAccessToken(), bimSession.getContentType(),
				bimSession.getTeam(), componentId);
		call.enqueue(new Callback<Demand>() {

			@Override
			public void onResponse(Call<Demand> call, Response<Demand> response) {
				if (response != null) {
					Demand demand = response.body();
					Logger.getInstance().writeInfo("Demand added to topology: " + demand.getName());
				}
			}

			@Override
			public void onFailure(Call<Demand> call, Throwable t) {
				Logger.getInstance().writeError("Invalid BIM request: Component with id " + componentId);
			}
		});
	}

	private void parseStorage(String componentId) {
		final Call<Storage> call = bimService.getStorage(bimSession.getAccessToken(), bimSession.getContentType(),
				bimSession.getTeam(), componentId);
		call.enqueue(new Callback<Storage>() {

			@Override
			public void onResponse(Call<Storage> call, Response<Storage> response) {
				if (response != null) {
					Storage storage = response.body();
					Logger.getInstance().writeInfo("Storage added to topology: " + storage.getName());
				}
			}

			@Override
			public void onFailure(Call<Storage> call, Throwable t) {
				Logger.getInstance().writeError("Invalid BIM request: Component with id " + componentId);
			}
		});
	}
	
	private void parseControllable(String componentId) {
		final Call<Controllable> call = bimService.getControllable(bimSession.getAccessToken(), bimSession.getContentType(),
				bimSession.getTeam(), componentId);
		call.enqueue(new Callback<Controllable>() {

			@Override
			public void onResponse(Call<Controllable> call, Response<Controllable> response) {
				if (response != null) {
					Controllable controllable = response.body();
					Logger.getInstance().writeInfo("Controllable added to topology: " + controllable.getName());
				}
			}

			@Override
			public void onFailure(Call<Controllable> call, Throwable t) {
				Logger.getInstance().writeError("Invalid BIM request: Component with id " + componentId);
			}
		});
	}
}
