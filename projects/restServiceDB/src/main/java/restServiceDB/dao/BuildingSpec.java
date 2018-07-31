package restServiceDB.dao;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "buildingjson")
public class BuildingSpec {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "timecur")
	private LocalDateTime currentTime;
	
	@Column(name = "buildingspec")
	private String buildingSpec;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(LocalDateTime currentTime) {
		this.currentTime = currentTime;
	}

	public String getBuildingSpec() {
		return buildingSpec;
	}

	public void setBuildingSpec(String buildingSpec) {
		this.buildingSpec = buildingSpec;
	}
}
