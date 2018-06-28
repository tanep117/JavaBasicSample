package chap12.sample12_1_1;

public abstract class Player {
	protected String job;  //職業

	public Player(String job) {
		this.job = job;
	}

	public String getJob() {
		return this.job;
	}

	public abstract void attack();

}
