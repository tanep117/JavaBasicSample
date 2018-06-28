package chap12.sample12_1_1;

public class Souryo extends Player {

	public Souryo() {
		super("僧侶");
	}

	@Override
	public void attack() {
		System.out.println("僧侶はひたすら回復の呪文を唱えている。");
	}

}
