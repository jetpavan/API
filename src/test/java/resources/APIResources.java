package resources;

//It is a special class in java which has collection of constants and methods
public enum APIResources {

	addUserAPI("v2/user"), 
	getUserAPI("v2/user/SaraV");
	private String resource;

	APIResources(String resource) {
		this.resource = resource;
	}

	public String getResource() {
		return resource;
	}
}
