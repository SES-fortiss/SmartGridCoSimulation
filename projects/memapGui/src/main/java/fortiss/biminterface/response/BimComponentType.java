package fortiss.biminterface.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BimComponentType {

	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("decimal")
	@Expose
	private Integer decimal;
	@SerializedName("visible")
	@Expose
	private Integer visible;
	@SerializedName("changeable")
	@Expose
	private Integer changeable;
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("description")
	@Expose
	private String description;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getDecimal() {
		return decimal;
	}

	public void setDecimal(Integer decimal) {
		this.decimal = decimal;
	}

	public Integer getVisible() {
		return visible;
	}

	public void setVisible(Integer visible) {
		this.visible = visible;
	}

	public Integer getChangeable() {
		return changeable;
	}

	public void setChangeable(Integer changeable) {
		this.changeable = changeable;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}