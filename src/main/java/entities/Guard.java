package entities;

public class Guard {

	private String name;

	public Guard(String guardName) {
		this.setName(guardName);
	}
	
	public boolean accept(Soul s) {
		return false;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
