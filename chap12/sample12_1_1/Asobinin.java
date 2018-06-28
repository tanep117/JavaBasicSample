package chap12.sample12_1_1;

public class Asobinin extends Player {

	public Asobinin() {
		super("遊び人");
	}

	@Override
	public void attack() {
		System.out.println("遊び人はケラケラ笑っている。");
	}

}
