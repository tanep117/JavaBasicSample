package chap13.sample13_1_2;

public abstract class Player {
	private String job;  //職業
	private Attack attack; //攻撃

	public Player(String job) {
		this.job = job;
	}

	public void setAttack(Attack attack) {
		this.attack = attack;
	}

	public void Attack() {
		System.out.println(job + "の攻撃");
		attack.exec();
	}

	public abstract void showStatus();
}
