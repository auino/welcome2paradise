package entities;

public enum Guards {
	saintPeter("stpeter");

	private Guard guard;

	private Guards(String guardName) {
		this.guard = new Guard(guardName);
	}

	public Guard getGuard() {
		return this.guard;
	}
}
