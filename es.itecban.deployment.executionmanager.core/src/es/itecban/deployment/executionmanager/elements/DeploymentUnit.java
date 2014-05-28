package es.itecban.deployment.executionmanager.elements;

public class DeploymentUnit implements java.io.Serializable {
	private String name;
	private String version;

	public DeploymentUnit() {
	}

	public DeploymentUnit(String name, String version) {
		super();
		this.name = name;
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean equals(Object obj) {
		if (obj instanceof DeploymentUnit != true)
			return false;
		DeploymentUnit n = (DeploymentUnit) obj;
		String nn = n.getName();
		String nv = n.getVersion();
		String tn = this.getName();
		String tv = this.getVersion();
		if (nn.equals(tn)) {
			if (nv == null && tv == null)
				return true;
			if (nv != null && tv != null)
				return nv.equals(tv);
		}
		return false;
	}

	public String toString() {
		return "Unit \n\tname:" + name + "\n\t version:" + version;
	}

}
