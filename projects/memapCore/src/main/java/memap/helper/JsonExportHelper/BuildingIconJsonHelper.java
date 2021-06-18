package memap.helper.JsonExportHelper;

import java.awt.geom.Point2D;

import com.google.gson.annotations.Expose;

public class BuildingIconJsonHelper {

	@Expose
	private Point2D position;
	
	public BuildingIconJsonHelper(int i) {	
		Point2D defaultposition = new Point2D.Double(391 + 5*i, 206 + 5*i);
		setPosition(defaultposition);		
	}
	
	public Point2D getPosition() {
		return position;
	}

	public void setPosition(Point2D position) {
		this.position = position;
	}
	
	
}
