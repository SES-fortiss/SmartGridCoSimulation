package restServiceDB.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import restServiceDB.dao.BuildingSpecDAO;
import restServiceDB.dao.BuildingSpec;

@Path("/rest")
public class RestService
{   
    @GET
    @Path("/getdata")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BuildingSpec> getAllBuildingSpec() {
        BuildingSpecDAO dao = new BuildingSpecDAO();
        List<BuildingSpec> buildingspec = dao.getBuildingSpec("FROM BuildingSpec");
        return buildingspec;
    }
    
    @GET
    @Path("/getdata/{building_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getBuildingSpec(@PathParam("building_id") int id) {
        BuildingSpecDAO dao = new BuildingSpecDAO();
        List<String> buildingspec = dao.getBuildingSpecJSON("SELECT buildingSpec FROM BuildingSpec WHERE name LIKE 'Haus"+id+"'");
        return buildingspec;
    }
    
    @GET
    @Path("/getdata/{building_id}/{time_period_start}/{time_period_end}") // time format : YYYY-MM-DD HH:MM:SS
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getBuildingSpecTime(@PathParam("building_id") int id, @PathParam("time_period_start") String start, @PathParam("time_period_end") String end) {
        BuildingSpecDAO dao = new BuildingSpecDAO();
        List<String> buildingspec = dao.getBuildingSpecJSON("SELECT buildingSpec FROM BuildingSpec WHERE name LIKE 'Haus"+id+"' "
        		+ "AND currentTime BETWEEN '"+start+"' AND '"+end+"'");
        return buildingspec;
    }
}
